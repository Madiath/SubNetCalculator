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
        String[] octetos = ip.getIpv4().split("\\.");

    int ip1 = Integer.parseInt(octetos[0]);
    int ip2 = Integer.parseInt(octetos[1]);
    int ip3 = Integer.parseInt(octetos[2]);
    int ip4 = Integer.parseInt(octetos[3]);

    // Crear la máscara a partir del prefijo
    int mask;

    if (prefix == 0) {
        mask = 0;
    } else {
        mask = (0xFFFFFFFF << (32 - prefix));
    }

    // Convertir la IP a un número de 32 bits
    long ipNumber =
            ((long) ip1 << 24) |
            ((long) ip2 << 16) |
            ((long) ip3 << 8) |
            ip4;

    // Aplicar la máscara
    long networkNumber = ipNumber & (mask & 0xFFFFFFFFL);

    // Volver de número a IP
    int network1 = (int) ((networkNumber >> 24) & 255);
    int network2 = (int) ((networkNumber >> 16) & 255);
    int network3 = (int) ((networkNumber >> 8) & 255);
    int network4 = (int) (networkNumber & 255);

    String networkAddress =
            network1 + "." +
            network2 + "." +
            network3 + "." +
            network4;

    IPv4Address network = new IPv4Address(networkAddress);

    return new IPv4Network(prefix,network);
    }
}
