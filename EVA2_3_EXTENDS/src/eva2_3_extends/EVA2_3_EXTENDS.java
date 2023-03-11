/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_extends;

/**
 *
 * @author KarimAP
 */
public class EVA2_3_EXTENDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu = new Estudiante();
        estu.setNombre("Perez");
        estu.setEdad(50);
        estu.setNoControl("011256");
        System.out.println("DATOS DEL ESTUDIANTE: ");
        System.out.println(estu.getNombre());
        System.out.println(estu.getEdad());
        System.out.println(estu.getNoControl());
        
        Docentes Do = new Docentes();
        Do.setNombre("Jorge");
        Do.setEdad(23);
        Do.setPlaza("EdificioC");
        System.out.println("DATOS DEL DOCENTE");
        System.out.println(Do.getNombre());
        System.out.println(Do.getEdad());
        System.out.println(Do.getPlaza());
        
    }
    
}
