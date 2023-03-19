/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_13_abstractas_herencia;

/**
 *
 * @author KarimAP
 */
public class Circulo extends Figuras {

    private double radio;

    public Circulo() {
        this.radio = 100;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double CalcularArea() {
        return Math.PI * (radio * radio);
    }

    @Override
    public double CalcularPerimetro() {
        return 2 * Math.PI * radio;

    }
}
