/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import Super_Clases.Electronica;

/**
 *
 * @author KarimAP
 */
public final class Computadoras extends Electronica {

    private int Memoria;
    private String Procesador;
    private double TamanoDePantalla;
    private double DiscoDuro;

    public Computadoras() {
        super();
        this.Memoria = 0;
        this.Procesador = "";
        this.TamanoDePantalla = 0;
        this.DiscoDuro = 0;
    }

    public Computadoras(int Memoria, String Procesador, double TamanoDePantalla, double DiscoDuro, String Fabricante, String Modelo, int Garantia, double Precio, String Nombre, String UnidadVenta) {
        super(Fabricante, Modelo, Garantia, Precio, Nombre, UnidadVenta);
        this.Memoria = Memoria;
        this.Procesador = Procesador;
        this.TamanoDePantalla = TamanoDePantalla;
        this.DiscoDuro = DiscoDuro;
    }

    public int getMemoria() {
        return Memoria;
    }

    public void setMemoria(int Memoria) {
        this.Memoria = Memoria;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    public double getTamanoDePantalla() {
        return TamanoDePantalla;
    }

    public void setTamanoDePantalla(double TamanoDePantalla) {
        this.TamanoDePantalla = TamanoDePantalla;
    }

    public double getDiscoDuro() {
        return DiscoDuro;
    }

    public void setDiscoDuro(double DiscoDuro) {
        this.DiscoDuro = DiscoDuro;
    }

    @Override
    public double PrecioVenta(int cant) {
//antes de cierta cantidad manejamos precios normales
//despues de cierta cantidad hay un descuento
        if (cant <= 10) {
            return getPrecio() * cant;
        } else {
            return (getPrecio() * 0.8) * cant;
        }
    }

    @Override
    public String toString() {
        String cant = "Datos: \n"
                + "Memoria:" + getMemoria() + "\n"
                + "Procesador: " + getProcesador() + "\n"
                + "Tamano de Pantalla: " + getTamanoDePantalla() + "\n"
                + "Disco duro: " + getDiscoDuro() + "\n"
                + "Fabricante: " + getFabricante() + "\n"
                + "Modelo: " + getModelo() + "\n"
                + "Garantia: " + getGarantia() + "\n"
                + "Precio: " + getPrecio()  + "\n"
                + "Nombre: " + getNombre() + "\n"
                + "Unidad de Venta: " + getUnidadVenta() + "\n";

        return cant;
    }
}

//class Laptop extends Computadoras{
//final --? no se puede heredar de una clase con final
//?
