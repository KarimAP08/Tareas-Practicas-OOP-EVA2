/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_tienda;

import Productos.Computadoras;
import Productos.Jeans;

/**
 *
 * @author KarimAP
 */
public class EVA2_14_TIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadoras compu =  new Computadoras(45, "Ryzen", 14.5, 250, "Intel", "Intel GP", 1, 5000, "Laptop", "5");
        compu.PrecioVenta(11);
        System.out.println(compu);
        Jeans jean = new Jeans("Beach", "Normal", "Grande", "Vans", "Azul", 1200, "Vans", "2");
        jean.PrecioVenta(30);
        System.out.println(jean);
    }
    
}
