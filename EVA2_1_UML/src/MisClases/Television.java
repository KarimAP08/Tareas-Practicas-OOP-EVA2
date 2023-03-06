/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author KarimAP
 */
public class Television {

    private int canal;
    private int volumen;
    private String encendido;

    public Television() {
        canal = 0;
        volumen = 0;
        encendido = "";
    }

    public Television(int can, int vol, String ence) {
        canal = can;
        volumen = vol;
        encendido = ence;
    }

    public int getcanal() {
        return canal;
    }

    public void setcanal(int valor) {
        canal = valor;
    }

    public int getvolumen() {
        return volumen;
    }

    public void setvolumen(int valor) {
        volumen = valor;
    }

    public String getencendido() {
        return encendido;
    }

    public void setencendido(String valor) {
        encendido = valor;
    }

    public void ImprimirDatos() {
        System.out.println("El canal es: " + canal);
        System.out.println("El volumen: " + volumen);
        System.out.println("Esta encendido o apagado? " + encendido);
    }
}
