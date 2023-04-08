/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_21_polimorfismo_vehiculos;

/**
 *
 * @author KarimAP
 */
public class Vehiculo {

    private String Marca;
    public int Velocidad;

    public Vehiculo() {
        this.Marca = "----";
        this.Velocidad = 0;
    }

    public Vehiculo(String Marca, int Velocidad) {
        this.Marca = Marca;
        this.Velocidad = Velocidad;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

}

interface ControlarDatos {

    void CambiarVelocidad(int cambio);

    public abstract void tablero();
}

class Automovil extends Vehiculo implements ControlarDatos {

    private String Modelo;
    private int Ano;

    public Automovil() {
        super();
        this.Modelo = "----";
        this.Ano = 0;

    }

    public Automovil(String Modelo, int Ano, String Marca, int Velocidad) {
        super(Marca, Velocidad);
        this.Modelo = Modelo;
        this.Ano = Ano;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    @Override
    public void CambiarVelocidad(int cambio) {
        int vel = Velocidad + cambio;
        if (vel >= 0) {
            Velocidad = vel;
        }
    }

    @Override
    public void tablero() {
        System.out.println("Automovil: ");
        System.out.println("Velocidad: " + Velocidad);
        System.out.println("Combustible (Pendiente)");
        System.out.println("Revoluciones (Pendiente)");
    }

}

class Bicicleta extends Vehiculo implements ControlarDatos {

    private String Tipo;

    public Bicicleta() {
        super();
        this.Tipo = "---";
    }

    public Bicicleta(String Tipo, String Marca, int Velocidad) {
        super(Marca, Velocidad);
        this.Tipo = Tipo;
    }

    @Override
    public void CambiarVelocidad(int cambio) {
        int vel = Velocidad + cambio;
        if (vel >= 0) {
            Velocidad = vel;
        }
    }

    @Override
    public void tablero() {
        System.out.println("Bicicleta:");
        System.out.println("Velocidad: " + Velocidad);
    }

}
