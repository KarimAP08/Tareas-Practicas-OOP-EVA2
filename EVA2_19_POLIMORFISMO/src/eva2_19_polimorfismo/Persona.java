/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_19_polimorfismo;

/**
 *
 * @author KarimAP
 */
public class Persona {

    private String nombre;
    private String Apellido;
    private int edad;

    public Persona() {
        this.nombre = "-----";
        this.Apellido = "-----";
        this.edad = -1;
    }

    public Persona(String nombre, String Apellido, int edad) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void ImprimirDatos() {
        System.out.println("DATOS:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.Apellido);
        System.out.println("Edad: " + this.edad);
    }
}
