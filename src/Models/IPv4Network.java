/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Lenovo
 */
public class IPv4Network {


    private IPv4Address networkAddress;
    private int prefixLength;
    private IPv4Address mask;
    private IPv4Address broadcastAddress;
    private IPv4Address firstHost;
    private IPv4Address lastHost;
    private long totalAddresses;
    private long usableHosts;
    
    public IPv4Network(){}
    
    public IPv4Network(IPv4Address networkAddress, int prefixLength, IPv4Address mask, IPv4Address broadcastAddress, IPv4Address firstHost, IPv4Address lastHost, long totalAddresses, long usableHosts) {
        this.networkAddress = networkAddress;
        this.prefixLength = prefixLength;
        this.mask = mask;
        this.broadcastAddress = broadcastAddress;
        this.firstHost = firstHost;
        this.lastHost = lastHost;
        this.totalAddresses = totalAddresses;
        this.usableHosts = usableHosts;
    }
   
    public IPv4Address getNetworkAddress() {
        return networkAddress;
    }

    public void setNetworkAddress(IPv4Address networkAddress) {
        this.networkAddress = networkAddress;
    }

    public int getPrefixLength() {
        return prefixLength;
    }

    public void setPrefixLength(int prefixLength) {
        this.prefixLength = prefixLength;
    }
    
    
    public IPv4Address getBroadcastAddress() {
        return broadcastAddress;
    }

    public void setBroadcastAddress(IPv4Address broadcastAddress) {
        this.broadcastAddress = broadcastAddress;
    }

    public IPv4Address getFirstHost() {
        return firstHost;
    }

    public void setFirstHost(IPv4Address firstHost) {
        this.firstHost = firstHost;
    }

    public IPv4Address getLastHost() {
        return lastHost;
    }

    public void setLastHost(IPv4Address lastHost) {
        this.lastHost = lastHost;
    }

    public long getTotalAddresses() {
        return totalAddresses;
    }

    public void setTotalAddresses(long totalAddresses) {
        this.totalAddresses = totalAddresses;
    }

    public long getUsableHosts() {
        return usableHosts;
    }

    public void setUsableHosts(long usableHosts) {
        this.usableHosts = usableHosts;
    }

    
    
    public IPv4Address getMask() {
        return mask;
    }

    public void setMask(IPv4Address mask) {
        this.mask = mask;
    }
}
