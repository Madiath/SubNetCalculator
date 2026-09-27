/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Models.IPv4Address;
import Models.IPv4Network;

/**
 *
 * @author Lenovo
 */
public class IPv4Calculator {

    public static IPv4Network calculateNetwork(IPv4Address ip, int prefix) {
 long ipNumber = ipToNumber(ip);
        long mask = calculateMask(prefix);

        long networkNumber = ipNumber & mask;

        long broadcast = calculateBroadcast(networkNumber, mask);

        long firstHost = calculateFirstHost(networkNumber);
        long lastHost = calculateLastHost(broadcast);

        long totalAddresses = calculateTotalAddresses(prefix);
        long usableHosts = calculateUsableHosts(prefix);

        IPv4Address networkAddress = numberToIp(networkNumber);
        IPv4Address maskAddress = numberToIp(mask);
        IPv4Address broadcastAddress = numberToIp(broadcast);
        IPv4Address firstHostAddress = numberToIp(firstHost);
        IPv4Address lastHostAddress = numberToIp(lastHost);

        return new IPv4Network(
                networkAddress,
                prefix,
                maskAddress,
                broadcastAddress,
                firstHostAddress,
                lastHostAddress,
                totalAddresses,
                usableHosts
        );
    }

    private static long ipToNumber(IPv4Address ip) {
        String[] octetos = ip.getIpv4().split("\\.");

        int ip1 = Integer.parseInt(octetos[0]);
        int ip2 = Integer.parseInt(octetos[1]);
        int ip3 = Integer.parseInt(octetos[2]);
        int ip4 = Integer.parseInt(octetos[3]);

        // Convertir la IP a un número de 32 bits
        long ipNumber
                = ((long) ip1 << 24)
                | ((long) ip2 << 16)
                | ((long) ip3 << 8)
                | ip4;

        return ipNumber;
    }

    private static long calculateMask(int prefix) {
        // Crear la máscara a partir del prefijo
        int mask;

        if (prefix == 0) {
            mask = 0;
        } else {
            mask = (0xFFFFFFFF << (32 - prefix));
        }

        return mask;
    }

    private static IPv4Address numberToIp(long networkNumber) {
        int network1 = (int) ((networkNumber >> 24) & 255);
        int network2 = (int) ((networkNumber >> 16) & 255);
        int network3 = (int) ((networkNumber >> 8) & 255);
        int network4 = (int) (networkNumber & 255);

        String networkAddress
                = network1 + "."
                + network2 + "."
                + network3 + "."
                + network4;

        IPv4Address network = new IPv4Address(networkAddress);

        return network;
    }

    private static long calculateBroadcast(long networkNumber, long mask) {
        long broadcast = networkNumber | (~mask & 0xFFFFFFFFL);

        return broadcast;
    }

    private static long calculateFirstHost(long networkNumber) {
        return networkNumber + 1;
    }

    private static long calculateLastHost(long broadcast) {
        return broadcast - 1;
    }

    private static long calculateTotalAddresses(int prefix) {
        return 1L << (32 - prefix);
    }

    private static long calculateUsableHosts(int prefix) {

        if (prefix >= 31) {
            return 0;
        }

        return calculateTotalAddresses(prefix) - 2;
    }

}
