/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author KarimAP
 */
public class Persona {

    private int id;
    private String nombre;
    private int edad;

    public Persona() {
        id = 0;
        nombre = "";
        edad = 0;
    }

    public Persona(int i, String Nom, int ed) {
        id = i;
        nombre = Nom;
        edad = ed;
    }

    public int getid() {
        return id;
    }

    public void setid(int valor) {
        id = valor;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String valor) {
        nombre = valor;
    }

    public int getedad() {
        return edad;
    }

    public void setedad(int valor) {
        edad = valor;
    }

    public void ImprimirDatos() {
        System.out.println("Su id es: " + id);
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su edad es: " + edad);
    }

}
