/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo3;

/**
 *
 * @author danie
 */
public class Poo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
    Trabajador tra5 =new Trabajador (7);
        Trabajador tra4 = new Trabajador (17);
        Trabajador tra3 = new Trabajador (5);
         Trabajador tra1 = new Trabajador(3,  "  Daniel","Paredes",285);
        
         Trabajador tra2= new Trabajador ();
         
         
    tra3.setTelefono(5);
    
        System.out.println("el numero de tra 3 es:" + tra3.getTelefono());
        System.out.println(".......................................... " );
         
        
        
        System.out.println("el nombre de tra 1 es:" + tra1.getNombre());
       
        
        System.out.println(".......................................... " );
        
        tra2.setNombre("  pedro");
        System.out.println("el nombre de tra 2 es:"+ tra2.getNombre());
    System.out.println(".......................................... " );
    
    tra4.setNombre("juanitaa");
    System.out.println("la edad de trabajador 4 es: " + tra4.getNombre() );
    
    tra5.setEdad(15);
    System.out.println("el numero de tra 3 es:" + tra5.getEdad());
    }
    
}
