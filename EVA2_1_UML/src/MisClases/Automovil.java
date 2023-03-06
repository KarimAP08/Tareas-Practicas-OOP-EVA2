/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author KarimAP
 */
public class Automovil {

    private String marca;
    private String modelo;
    private int ano;

    public Automovil() {
        marca = "";
        modelo = "";
        ano = 0;
    }

    public Automovil(String mar, String model, int a) {
        marca = mar;
        modelo = model;
        ano = a;
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String valor) {
        marca = valor;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String valor) {
        modelo = valor;
    }

    public int getano() {
        return ano;
    }

    public void setano(int valor) {
        ano = valor;
    }

    public void ImprimirDatos() {
        System.out.println("La marca es: " + marca);
        System.out.println("El modelo es: " + modelo);
        System.out.println("el ano es: " + ano);
    }
}
