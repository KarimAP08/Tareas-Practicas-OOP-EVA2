/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_super_2;

/**
 *
 * @author KarimAP
 */          //CLASE DERIVADA extends CLASE BASE
//CLASE HIJO extends clase PADRE
//SUBCLASE extends SUPERCLASE
public class Estudiante extends Persona {

    public String NoControl;

    public Estudiante() {//constructor defalut
        super();//llamada al constructor de la superclase
        this.NoControl = "------";
    }

    public Estudiante(String NoControl, String nombre, String Apellido, int edad) {
        super(nombre, Apellido, edad);
        this.NoControl = NoControl;
    }

    public String getNoControl() {
        return NoControl;
    }

    public void setNoControl(String NoControl) {
        this.NoControl = NoControl;
    }   
    //REMPLAZAR EL METODO ImprimirDatos DE LA SUPERCLASE
    @Override
    public void ImprimirDatos(){
        super.ImprimirDatos();
        System.out.println("NoDeControl: " +NoControl);
    }

}
