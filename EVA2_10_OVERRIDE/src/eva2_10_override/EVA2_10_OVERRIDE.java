/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_override;

/**
 *
 * @author KarimAP
 */
public class EVA2_10_OVERRIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona obj = new Persona();
        Persona ob2 = new Persona("Mario", 23);
        System.out.println(obj);
        System.out.println(ob2);
    }

}

class Persona {

    private String Nombre;
    private int Edad;

    public Persona() {
        this.Nombre = "---";
        this.Edad = -1;
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
    public String toString() {
        String cade = "Datos: \n"
                + "Nombre: " + Nombre + "\n"
                + "Edad: " + Edad;
        return cade;
    }

}
