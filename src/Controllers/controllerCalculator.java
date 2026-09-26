/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.IPv4Address;
import Models.IPv4Network;
import Services.IPv4Calculator;

/**
 *
 * @author Lenovo
 */
public class controllerCalculator {

    public static IPv4Network CalcularSubnet(String ipv4, String cidr) {
      IPv4Address ip = new IPv4Address(ipv4);

    int prefijo = Integer.parseInt(cidr);
    
    System.out.println("IP: " + ipv4);
    System.out.println("CIDR recibido: " + cidr);
    System.out.println("Prefijo convertido: " + prefijo);

    IPv4Network resultado =
            IPv4Calculator.calculateNetwork(ip, prefijo);

    return resultado;
    }
    
}
