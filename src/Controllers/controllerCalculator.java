/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.IPv4Address;
import Models.IPv4Network;
import Services.IPv4Calculator;
import UI.VistaCalculadoraIPv4;

/**
 *
 * @author Lenovo
 */
public class controllerCalculator {

    public static IPv4Network CalcularSubnet(String ipv4, String cidr) {

    try {
        IPv4Address ip = new IPv4Address(ipv4);

        int prefijo = Integer.parseInt(cidr);

        return IPv4Calculator.calculateNetwork(ip, prefijo);

    } catch (NumberFormatException e) {
        VistaCalculadoraIPv4.MostrarMensajeError(
                "El prefijo debe ser un número entero."
        );
        return null;

    } catch (IllegalArgumentException e) {
        VistaCalculadoraIPv4.MostrarMensajeError(
                e.getMessage()
        );
        return null;
    }
}

}
