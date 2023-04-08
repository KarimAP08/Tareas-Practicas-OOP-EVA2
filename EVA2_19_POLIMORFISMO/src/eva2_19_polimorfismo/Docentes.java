/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_19_polimorfismo;

/**
 *
 * @author KarimAP
 */
//CLASE DERIVADA extends CLASE BASE
//CLASE HIJO extends clase PADRE
//SUBCLASE extends SUPERCLASE
public class Docentes extends Persona {

    private String plaza;

    public Docentes() {
        super();
        this.plaza = "----";
    }

    public Docentes(String plaza, String nombre, String Apellido, int edad) {
        super(nombre, Apellido, edad);
        this.plaza = plaza;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    
    @Override
    public void ImprimirDatos(){
        super.ImprimirDatos();
        System.out.println("Plaza: " +plaza);
    }

}
