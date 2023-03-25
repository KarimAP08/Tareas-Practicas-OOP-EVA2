/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_16_interfaces;

/**
 *
 * @author KarimAP
 */
public class Persona implements MostrarDatos {

    private String Nombre;
    private int Edad;

    public Persona() {
        this.Nombre = "";
        this.Edad = 0;
    }

    public Persona(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public void ImprimirDatos() {
        System.out.println("Nonbre: "+ Nombre);
        System.out.println("Edad: " + Edad);
    }

}
