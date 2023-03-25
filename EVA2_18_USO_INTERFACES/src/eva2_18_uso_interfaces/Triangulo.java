/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_18_uso_interfaces;

/**
 *
 * @author KarimAP
 */
public class Triangulo implements Figuras, MostrarDatos {

    private double Base;
    private double Altura;

    public Triangulo() {
        this.Base = 0;
        this.Altura = 0;
    }

    public Triangulo(double Base, double Altura) {
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
        return (Base * Altura) / 2;
    }

    @Override
    public double CalcularPerimetro() {
        double hip = Math.sqrt(Math.pow(Base, 2) + Math.pow(Altura, 2));
        return Base + Altura + (hip);
    }

    @Override
    public void ImprimirDatos() {
        System.out.println("Base: " + Base);
        System.out.println("Altura: " + Altura);
        System.out.println("El area es: " + CalcularArea());
        System.out.println("El perimetro es: " + CalcularPerimetro());
    }

}
