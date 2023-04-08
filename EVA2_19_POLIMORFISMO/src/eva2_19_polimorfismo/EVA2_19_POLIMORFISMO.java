/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_polimorfismo;

/**
 *
 * @author KarimAP
 */
public class EVA2_19_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Estudiante est = new Estudiante("233", "Mario", "Castaneda", 15);
        est.ImprimirDatos();
        Docentes Doc = new Docentes("Tec", "Jose", "Mourinho", 56);
        Doc.ImprimirDatos();
        //EN RESUMEN, ESTO ES POLIMORFISMO:
        //OCULTAMOS PROPIEDADES
        //Nose se puede hacer conversion de super clases a subclases
        //EN ESTE CASO, NO EXISTE "PLAZA"
        Persona persona = Doc;
        persona.ImprimirDatos();
        Persona persona2 = est;
        persona2.ImprimirDatos();
        Persona Perso = new Persona("Mario", "Jose", 12);
        //Docentes doc = Perso;
    }

}
