/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Super_Clases;

/**
 *
 * @author KarimAP
 */
public abstract class Ropa extends Productos {

    private String talla;
    private String Marca;
    private String Color;

    public Ropa() {
        super();
        this.talla = "";
        this.Marca = "";
        this.Color = "";

    }

    public Ropa(String talla, String Marca, String Color, double Precio, String Nombre, String UnidadVenta) {
        super(Precio, Nombre, UnidadVenta);
        this.talla = talla;
        this.Marca = Marca;
        this.Color = Color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

}
