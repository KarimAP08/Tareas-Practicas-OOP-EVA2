/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Super_Clases;

/**
 *
 * @author KarimAP
 */
public abstract class Electronica extends Productos {

    private String Fabricante;
    private String Modelo;
    private int Garantia;

    public Electronica() {
        super();
        this.Fabricante = "";
        this.Modelo = "";
        this.Garantia = 0;
    }

    public Electronica(String Fabricante, String Modelo, int Garantia, double Precio, String Nombre, String UnidadVenta) {
        super(Precio, Nombre, UnidadVenta);
        this.Fabricante = Fabricante;
        this.Modelo = Modelo;
        this.Garantia = Garantia;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getGarantia() {
        return Garantia;
    }

    public void setGarantia(int Garantia) {
        this.Garantia = Garantia;
    }

}
