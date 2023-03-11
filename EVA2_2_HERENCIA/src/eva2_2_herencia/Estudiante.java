/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_herencia;

/**
 *
 * @author KarimAP
 */
public class Estudiante {
    private String nombre;
    private String Apellido;
    private int edad;
    private String NoControl;

    public Estudiante(String nombre, String Apellido, int edad, String NoControl) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.NoControl = NoControl;
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

    public String getNoControl() {
        return NoControl;
    }

    public void setNoControl(String NoControl) {
        this.NoControl = NoControl;
    }
    
    
    
    
}
