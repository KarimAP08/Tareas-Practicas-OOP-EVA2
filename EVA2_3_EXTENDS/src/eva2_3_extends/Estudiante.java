/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_extends;

/**
 *
 * @author KarimAP
 */          //CLASE DERIVADA extends CLASE BASE
//CLASE HIJO extends clase PADRE
//SUBCLASE extends SUPERCLASE
public class Estudiante extends Persona {

    public String NoControl;

    public Estudiante() {
    }

    public String getNoControl() {
        return NoControl;
    }

    public void setNoControl(String NoControl) {
        this.NoControl = NoControl;
    }

}
