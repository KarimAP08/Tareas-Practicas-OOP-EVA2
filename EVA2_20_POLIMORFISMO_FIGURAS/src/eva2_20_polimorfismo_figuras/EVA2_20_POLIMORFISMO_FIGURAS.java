/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_polimorfismo_figuras;

import java.util.Scanner;

/**
 *
 * @author KarimAP
 */
public class EVA2_20_POLIMORFISMO_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Circulo cir = new Circulo(5);
        cir.ImprimirDatos();
        //FIGURA ES PADRE DE CIRCULO
        //PODEMOS ASGINAR UN OBJETO CIRCULO A UNA VARIABLE

        Figuras fig = cir;

        System.out.println("USANDO FIGURAS");
        System.out.println("Area: " + fig.CalcularArea());
        System.out.println("Perimetro: " + fig.CalcularPerimetro());*/
 /*int[] arreglo = new int [10];//arreglo que pueda guardar 10 enteros
        //un arreglo donde inicia y donde termina?
        //primer posicion: 0
        //ultima posicion: N - 1, N cantidad de elementos del arreglo
        arreglo[0] = 100;
        System.out.println(arreglo[0]);*/
        System.out.println("Cuantas figuaras necesitas?");
        Scanner input = new Scanner(System.in);
        int cant = input.nextInt();
        Figuras[] Figuras = new Figuras[cant];
        for (int i = 0; i < Figuras.length; i++) {
            System.out.println("Que tipo de figuras necesitas? 1.Circulo 2.Triangulo");
            int tipo = input.nextInt();
            if (tipo == 1) {//CIRCULO
                Circulo circ = new Circulo();
                System.out.println("Introduce el radio: ");
                circ.setRadio(input.nextDouble());//capturamos el dato del radio
                Figuras[i] = circ;

            } else {//TRIANGULO
                Triangulo trian = new Triangulo();
                System.out.println("Introduce la base: ");
                trian.setBase(input.nextDouble());
                System.out.println("Introduce la altura: ");
                trian.setAltura(input.nextDouble());
                Figuras[i] = trian;

            }
        }
        //IMPRIMIR LOS RESULTADOS
        for (int i = 0; i < Figuras.length; i++) {
            if (Figuras[i] instanceof Circulo) {
                System.out.println("Circulo: " + i);
                //CASTING: CONVERSION
                //EJEMPLO
                //int val = (int)(Math.random() * 100);
                Circulo circ = (Circulo)Figuras[i];
                circ.ImprimirDatos();
            } else {
                System.out.println("Triangulo: " + i);
                //CASTING
                Triangulo trian = (Triangulo) Figuras[i];
                trian.ImprimirDatos();
            }
            
            //System.out.println("Area: " + Figuras[i].CalcularArea());
            //System.out.println("Perimetro: " + Figuras[i].CalcularPerimetro());
        }
        /*Circulo[] circulos = new Circulo[cant];
       circulos[0] = new Circulo();
       circulos[0].ImprimirDatos();
       
        for (int i = 0; i < circulos.length; i++) {
            circulos[i] =  new Circulo();
            
        }
        
        for (int i = 0; i < circulos.length; i++) {
            circulos[i].ImprimirDatos();
            
        }*/
    }

}
