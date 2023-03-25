/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Super_Clases;

/**
 *
 * @author KarimAP
 */
public abstract class Productos {

    private double Precio;
    private String Nombre;
    private String UnidadVenta;

    public Productos() {
        this.Precio = 0;
        this.Nombre = "";
        this.UnidadVenta = "";
    }

    public Productos(double Precio, String Nombre, String UnidadVenta) {
        this.Precio = Precio;
        this.Nombre = Nombre;
        this.UnidadVenta = UnidadVenta;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUnidadVenta() {
        return UnidadVenta;
    }

    public void setUnidadVenta(String UnidadVenta) {
        this.UnidadVenta = UnidadVenta;
    }
    
    public abstract double PrecioVenta(int cant);

}
