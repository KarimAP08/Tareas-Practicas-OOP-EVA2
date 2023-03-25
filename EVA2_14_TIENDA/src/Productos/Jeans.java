/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import Super_Clases.Ropa;

/**
 *
 * @author KarimAP
 */
public final class Jeans extends Ropa {

    private String Estilo;
    private String Material;

    public Jeans() {
        super();
        this.Estilo = "";
        this.Material = "";
    }

    public Jeans(String Estilo, String Material, String talla, String Marca, String Color, double Precio, String Nombre, String UnidadVenta) {
        super(talla, Marca, Color, Precio, Nombre, UnidadVenta);
        this.Estilo = Estilo;
        this.Material = Material;
    }

    public String getEstilo() {
        return Estilo;
    }

    public void setEstilo(String Estilo) {
        this.Estilo = Estilo;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    @Override
    public double PrecioVenta(int cant) {
        if (cant <= 10) {
            return getPrecio() * cant;
        } else {
            return (getPrecio() * 0.8) * cant;
        }

    }

    @Override
    public String toString() {
        String cant = "Datos: \n"
                + "Estilo:" + getEstilo()+ "\n"
                + "Material: " + getMaterial()+ "\n"
                + "Talla: " + getTalla()+ "\n"
                + "Marca: " + getMarca()+ "\n"
                + "Color: " + getColor()+ "\n"
                + "Precio: " + getPrecio()+ "\n"
                + "Nombre: " + getNombre() + "\n"
                + "Unidad de Venta: " + getUnidadVenta() + "\n";

        return cant;
    }

}
