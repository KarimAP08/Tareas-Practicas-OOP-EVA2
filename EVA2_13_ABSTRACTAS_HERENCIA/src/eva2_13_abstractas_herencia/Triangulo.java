/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_13_abstractas_herencia;

/**
 *
 * @author KarimAP
 */
public class Triangulo extends Figuras {

 private double Base;
    private double Altura;

    public Triangulo() {
        this.Base = 100.0;
        this.Altura = 100.0;

    }

    public Triangulo(double Base, double Altura, double Lado) {
        this.Base = Base;
        this.Altura = Altura;

    }

    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

 @Override
    public double CalcularArea() {
        double area = Base * Altura / 2;
        return area;
    }

 @Override
    public double CalcularPerimetro() {
        double hip = Math.sqrt((Base * Base) + (Altura * Altura));
        return Base + Altura + hip;
    }


}
