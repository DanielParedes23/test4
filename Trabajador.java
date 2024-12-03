/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo3;

/**
 *
 * @author danie
 */
//declaro variables
public class Trabajador {
    int edad;
    String nombre;
    String apellido;
    int telefono;  
//constructor telefono
    public Trabajador(int telefono) {
        this.telefono = telefono;
    }
//constructor nombre
    public Trabajador(String nombre) {
        this.nombre = nombre;
    }

  

   // constructor vacio
    
    public Trabajador() {
    }
    //constructor con todas las variables

    public Trabajador(int edad, String nombre, String apellido, int telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
    
}
