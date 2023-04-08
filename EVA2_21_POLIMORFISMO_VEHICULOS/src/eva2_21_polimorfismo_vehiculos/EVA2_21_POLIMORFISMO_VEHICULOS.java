/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_polimorfismo_vehiculos;

/**
 *
 * @author KarimAP
 */
public class EVA2_21_POLIMORFISMO_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil auto = new Automovil("Bocho", 2001, "Volks", 0);
        ModificarVel(auto, 550);

        Bicicleta bici = new Bicicleta("Grande", "Apache", 0);

        ModificarVel(bici, 122);

    }

    public static void ModificarVel(ControlarDatos datos, int vel) {
        datos.CambiarVelocidad(vel);
        datos.tablero();

    }

}
