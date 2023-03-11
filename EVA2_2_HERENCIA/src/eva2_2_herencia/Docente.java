/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_herencia;

/**
 *
 * @author KarimAP
 */
public class Docente {
    private String nombre;
    private String Apellido;
    private int edad;
    private String plaza;

    public Docente(String nombre, String Apellido, int edad, String plaza) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.plaza = plaza;
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

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    
    
}
