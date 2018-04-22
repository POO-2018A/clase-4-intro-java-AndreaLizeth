/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;
import java.util.Scanner;
/**
 *
 * @author Andrea Lizeth
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean estaNevando = true;
        boolean estaLloviendo = false;
        double temperatura = 60.0;
        
        if (estaNevando== true || estaLloviendo== true || temperatura <10){
            System.out.println("Nos quedamos en casa!");
        } else {
            System.out.println("Vamos afuera!");
        }
        
        // TODO code application logic here
    }
    
}
