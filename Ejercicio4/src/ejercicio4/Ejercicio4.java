/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author Andrea Lizeth
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = scan.nextInt();
        
        if( numero % 2== 0 ){
            System.out.println("El númeo es par.");
        } else {
            System.out.println("El número es impar.");
        }
        
        
        
        
        // TODO code application logic here
    }
    
}
