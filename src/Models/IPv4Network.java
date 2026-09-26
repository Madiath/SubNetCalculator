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
    
    public IPv4Network()
    {
    
    }
    
    public IPv4Network(int pLength, IPv4Address netAddress)
    {
        networkAddress = netAddress;
        pLength = prefixLength;
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
    
    
    
    
    
    
    
}
