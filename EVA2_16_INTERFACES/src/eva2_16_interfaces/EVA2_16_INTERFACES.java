/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_interfaces;

/**
 *
 * @author KarimAP
 */
public class EVA2_16_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // MostrarDatos obj = new MostrarDatos(); nose puede instanciar una interface
        Persona perso = new Persona("Godinez", 45);
        perso.ImprimirDatos();
        Computadora compu = new Computadora("Lenovo", "Ryzen 3500", 4000, "Lenovo ING");
        compu.ImprimirDatos();
    }
    
}
