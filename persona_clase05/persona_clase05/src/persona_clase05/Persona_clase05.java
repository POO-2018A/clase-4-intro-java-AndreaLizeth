/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona_clase05;

import java.util.Date;



public class Persona_clase05 {

    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String cedula;
    
    public Persona_clase05(){
        this.nombre  = "Anonymus";
    }
    
    public Persona_clase05(String nombre){
        this.nombre = nombre; 
    }
    
    public Persona_clase05(String nombre, String apellido){  // nombre puede ser puesto a voluntad
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public Persona_clase05(String nombre, String apellido, String fechaNaciemiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //getters
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    
    public Date getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    public String getCedula(){
    return this.cedula;
    }
    // setters
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setFechaNacimiento(Date fehaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setCedula(String cedula){
        if(cedulaValida(cedula)){
             this.cedula = cedula;
           
              System.out.println("Cedula valida");
        }else{
            System.out.println("Cedula no valida");
         }
       }
   //Métodos privados
      private boolean cedulaValida (String cedula){
          int dig1;
          int operacion1;
          int dig2;
          int operacion2;
          int dig3;
          int operacion3;
          int dig4;
          int operacion4;
          int dig5;
          int operacion5;
          int dig6;
          int operacion6;
          int dig7;
          int operacion7;
          int dig8;
          int operacion8;
          int dig9;
          int operacion9;
          int suma = 0;
          int digitoVerificador;
          int respuesta;
          
          char E; //permite escoger numero por numero de toda la serie.
          int contador = 0;
          boolean cadena = false;
          
          if (cedula.length() == 10 ){
              for (int i = 0; i < cedula.length(); i++){
                E = cedula.charAt(i);
                if(Character.isDigit(E)){
                contador++;
                    }
                if(contador == 10){
                dig1 =Integer.valueOf(cedula.substring(0, 1));
                dig2 =Integer.valueOf(cedula.substring(1, 2));
                dig3 =Integer.valueOf(cedula.substring(2, 3));
                dig4 =Integer.valueOf(cedula.substring(3, 4));
                dig5 =Integer.valueOf(cedula.substring(4, 5));
                dig6 =Integer.valueOf(cedula.substring(5, 6));
                dig7 =Integer.valueOf(cedula.substring(6, 7));
                dig8 =Integer.valueOf(cedula.substring(7, 8));
                dig9 =Integer.valueOf(cedula.substring(8, 9));
                
                digitoVerificador = Integer.valueOf(cedula.substring(9, 10));
                
                if(dig3 < 6){
                    operacion1 = dig1 * 2;
                    if(operacion1 >= 10){
                        operacion1 -= 9;
                          }
                 
                    operacion2 = dig2 * 1;
                    if(operacion2 >= 10){
                        operacion2 -= 9;
                          }
                    
                    operacion3 = dig3 * 2;
                    if(operacion3 >= 10){
                        operacion3 -= 9;
                          }
                    
                    operacion4 = dig4 * 1;
                    if(operacion4 >= 10){
                        operacion4 -= 9;
                          }
                    
                    
                   
                    operacion5 = dig5 * 2;
                    if(operacion5 >= 10){
                        operacion5 -= 9;
                          }
                    
                    operacion6 = dig6 * 1;
                    if(operacion6 >= 10){
                        operacion6 -= 9;
                          }
                    
                    operacion7 = dig7 * 2;
                    if(operacion7 >= 10){
                        operacion7 -= 9;
                          }
                    
                    operacion8 = dig8 * 1;
                    if(operacion8 >= 10){
                        operacion8 -= 9;
                          }
                    
                    operacion9 = dig9 * 2;
                    if(operacion9 >= 10){
                        operacion9 -= 9;
                          }
                    
                suma = operacion1 + operacion2 + operacion3 + operacion4 + operacion5 + operacion6 + operacion7 + operacion8 + operacion9;      
                respuesta = suma % 10;
                    if(respuesta == 0){
                        if(respuesta == digitoVerificador){
                         cadena = true;
                            } else {
                            cadena = false;
                                }
                        
                        } else{
                            respuesta = 10 - respuesta;
                            if(respuesta == digitoVerificador){
                                cadena = true;
                                        } else{
                                            cadena = false;
                                            }
                                }
                
                    } else {
                        if(dig3 == 7 || dig3 == 0){
                            cadena = false;
                                } else {
                                
                            if(dig3 == 6){
                                
                                } else {
                                    if (dig3 == 9){
                                        
                                        }
                                }
                                        
                                        }
                            }
                
                    }else {
                           cadena = false;
                        }
                
                } 
          
          
            }else {
                        cadena = false;
                        }
          
          return cadena;
        
        
            
        }

        
        
        
       

        
    public static void main(String[] args) {
        Persona_clase05 p = new Persona_clase05();
        System.out.println("El nombre de P es: "+p.nombre);
        
        p.apellido = "Quishpe";
        p.nombre = "Andrea";
        p.fechaNacimiento = new Date("1999/11/26");
        System.out.println("El nombre de P es: "+p.nombre);
        
        Persona_clase05 p1 = new Persona_clase05("Andre");
        System.out.println("El nombre de P1 es: "+p1.nombre);
        System.out.println("El nombre de P es: "+p.nombre);
        
        p.nombre = p.nombre + " Lizeth";
        System.out.println("El nombre plus es: "+p.nombre);
        
         p.setCedula("1724388887");
         p.setCedula("1537409473")
       
         
        
    }
}
