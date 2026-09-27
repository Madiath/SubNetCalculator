/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validators;



/**
 *
 * @author Lenovo
 */
public class validateIPv4 {
    
   public static void IPv4valida(String ipv4) throws Exception
   {
       if(!validarIPv4(ipv4))
       {
        throw new Exception("La direccion IPv4 no es valida");
       }
   }
    
   public static boolean validarIPv4(String ipv4) {

    if (ipv4 == null || ipv4.isEmpty()) {
        return false;
    }

    String[] octetos = ipv4.split("\\.", -1);

    if (octetos.length != 4) {
        return false;
    }

    for (String octeto : octetos) {

        if (octeto.isEmpty()) {
            return false;
        }

        try {
            int numero = Integer.parseInt(octeto);

            if (numero < 0 || numero > 255) {
                return false;
            }

        } catch (NumberFormatException e) {
            return false;
        }
    }

    return true;
}
    
}
