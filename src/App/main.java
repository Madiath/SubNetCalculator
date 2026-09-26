/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;


import UI.MainW;
/**
 *
 * @author Lenovo
 */
public class main {
    public static void main(String[]args)
    {
        try
        {
         MainW v = new MainW();
         v.setVisible(true);
         System.out.println("Corriendo calculadora");
        }
        catch(Exception e)
        {
            System.out.println("El sistema no pudo funcionar algo salío mal :C");
        }
    }
}
