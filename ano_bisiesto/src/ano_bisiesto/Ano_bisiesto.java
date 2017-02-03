/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ano_bisiesto;

import java.util.Scanner;
/**
 *
 * @author Felix
 */
public class Ano_bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int ano;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Introducir año: ");
        ano = teclado.nextInt();
        
        if (ano % 4==0 && ano % 100 !=0 || ano % 400 == 0 ) { // que no sea divisible entre 100 pero si entre 400
            System.out.println ("El año es bisiesto");
            
        } else  {
                
                System.out.println("El año no es bisiesto");
                
                }
        
        
        
        teclado.close();
    }
    
}
