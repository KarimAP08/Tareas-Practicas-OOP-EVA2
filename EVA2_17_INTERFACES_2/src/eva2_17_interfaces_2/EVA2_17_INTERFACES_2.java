/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_interfaces_2;

/**
 *
 * @author KarimAP
 */
public class EVA2_17_INTERFACES_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}

interface intA {

    void A();//equivale a public abstract void(A);
}

interface intB {

    public abstract void B();//equivale a void B();
}

interface intC extends intA, intB {

    void C();
}

class Prueba implements intC {

    @Override
    public void C() {

    }

    @Override
    public void A() {

    }

    @Override
    public void B() {

    }

}
