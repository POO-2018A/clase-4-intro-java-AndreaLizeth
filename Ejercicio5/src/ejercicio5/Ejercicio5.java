/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;
import java.util.Scanner;
/**
 *
 * @author Andrea Lizeth
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero entre [1-12].");
        int opc = scan.nextInt();
        switch (opc){
            case 1:
                System.out.println("Enero.");
              break;
              case 2:
                System.out.println("Febrero.");
              break;
              case 3:
                System.out.println("Marzo.");
              break;
              case 4:
                System.out.println("Abril.");
              break;
              case 5:
                System.out.println("Mayo.");
              break;
              case 6:
                System.out.println("Junio.");
              break;
              case 7:
                System.out.println("Julio.");
              break;
              case 8:
                System.out.println("Agosto.");
              break;
              case 9:
                System.out.println("Septiembre.");
              break;
              case 10:
                System.out.println("Octubre.");
              break;
              case 11:
                System.out.println("Noviembre.");
              break;
              case 12:
                System.out.println("Diciembre.");
              break;
              default:
                  System.out.println("Opcion no valida!");
              break;
              
              
              
              
        }
        
        
        
        
        
        // TODO code application logic here
    }
    
}
