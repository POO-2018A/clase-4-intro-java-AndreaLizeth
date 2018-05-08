/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona_clase05;

/**
 *
 * @author ESFOT
 */
public class Principal {
    public static void main (String[] args){
        Persona_clase05 p2 = new Persona_clase05();
        Persona_clase05 p3 = p2;
        p2.setNombre("Andrea");
        p3.setApellido("Quishpe");
        
        System.out.println("P2 nombre: "+ p2.getNombre());
        System.out.println("P3 nombre: "+ p3.getNombre());
        System.out.println("P2 apellido: "+ p2.getApellido());
        System.out.println("P3 apellido: "+ p3.getApellido());
        
        String greeting = "Hello, World!";
        String greeting2 = greeting;
        greeting2.toUpperCase();
        System.out.println(greeting2);
    }
    
}
