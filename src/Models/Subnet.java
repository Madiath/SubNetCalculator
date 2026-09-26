/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Lenovo
 */
public class Subnet {

    
    private IPv4Address networkAddress;
    private IPv4Address firstHost;
    private IPv4Address lastHost;
    private IPv4Address broadcast;
    private int prefixLength;

    public Subnet() {}

    public Subnet(IPv4Address networkAddress, IPv4Address firstHost, IPv4Address lastHost, IPv4Address broadcast, int prefixLength) {
        this.networkAddress = networkAddress;
        this.firstHost = firstHost;
        this.lastHost = lastHost;
        this.broadcast = broadcast;
        this.prefixLength = prefixLength;
    }
    
    
    
    
    public IPv4Address getNetworkAddress() {
        return networkAddress;
    }

    public void setNetworkAddress(IPv4Address networkAddress) {
        this.networkAddress = networkAddress;
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

    public IPv4Address getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(IPv4Address broadcast) {
        this.broadcast = broadcast;
    }

    public int getPrefixLength() {
        return prefixLength;
    }

    public void setPrefixLength(int prefixLength) {
        this.prefixLength = prefixLength;
    }

}
