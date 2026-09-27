/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validators;

/**
 *
 * @author Lenovo
 */
public class validatePrfx {

    public static void validarPrefijo(String p) throws Exception {
        if (p.isBlank() || p.isEmpty()) {
            throw new Exception("El prefijo no puede estar vacio");
        }

        if (tieneLetras(p)) {
            throw new Exception("El prefijo tiene que ser un dato valido");
        }

        int pEntero = Integer.parseInt(p);
        if (pEntero < 0 || pEntero > 32) {
            throw new Exception("El prefijo tiene que ser mayor a 0 y menor a 32 bits");
        }
    }

    private static boolean tieneLetras(String p) {
        String letras = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        boolean tiene = false;

        char compP = ' ';
        char compLetras = ' ';

        for (int i = 0; i < p.length(); i++) {
            compP = p.charAt(i);
            for (int j = 0; j < letras.length(); j++) {
                compLetras = letras.charAt(j);

                if (compLetras == compP) {
                    tiene = true;
                }
            }
        }
        return tiene;
    }

}
