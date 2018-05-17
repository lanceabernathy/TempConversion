/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconversion;

import java.util.Scanner;

/**
 *
 * @author Lance
 */
public class TempConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float tempf, tempc;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a Temperature in Calcus to convert to Fahrenheit: ");
        tempc = keyboard.nextInt();
                      
        tempf = (float) ((float) (9.0/5.0) * tempc + 32.0);
        System.out.println("The temperature in Fahrenheit is " + tempf + " Degrees");
    }
    
}
