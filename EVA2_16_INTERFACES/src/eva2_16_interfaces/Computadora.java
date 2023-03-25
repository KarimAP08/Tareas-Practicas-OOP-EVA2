/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_16_interfaces;

/**
 *
 * @author KarimAP
 */
public class Computadora extends Producto
        implements MostrarDatos {//implementamos interfaces

    private String Marca;
    private String Procesador;

    public Computadora() {
        super();
        this.Marca = "";
        this.Procesador = "";

    }

    public Computadora(String Marca, String Procesador, double Precio, String Nombre) {
        super(Precio, Nombre);
        this.Marca = Marca;
        this.Procesador = Procesador;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    @Override
    public void ImprimirDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio:" +getPrecio());
        System.out.println("Marca: " + Marca);
        System.out.println("Procesador: " + Procesador);
    }

}
