/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_22_has_a_direccion;

/**
 *
 * @author KarimAP
 */
public class EVA2_22_HAS_A_DIRECCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona per = new Persona();
        per.setNombre("Naria");
        per.setApellido("Martinez");
        per.setEdad(45);
        
        /*Direccion direccion = new Direccion();
        direccion.setCalle("Av. Industrias");
        direccion.setNumero(2105);
        direccion.setColonia("Complejo industrial");
        direccion.setCp("31135");
        direccion.setCiudad("Chihuahua");
        direccion.setEstado("Chihuahua");
        
        per.setDireccion(direccion);*/
        per.ImprimirDatos();
    }

}

class Direccion {

    private String Calle;
    private int numero;
    private String colonia;
    private String cp;
    private String ciudad;
    private String Estado;

    public Direccion() {
        this.Calle = "---";
        this.numero = 0;
        this.colonia = "---";
        this.cp = "---";
        this.ciudad = "---";
        this.Estado = "-----";
    }

    public Direccion(String Calle, int numero, String colonia, String cp, String ciudad, String Estado) {
        this.Calle = Calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.Estado = Estado;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void ImprimirDatos() {
        System.out.println("Direccion:");
        System.out.println(Calle + " #" + numero + ", " + colonia + 
                ", C.P.:" + cp + ", " + ciudad);
    }

}
//persona es una direccion? no

class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion;// Persona has-a (tiene-una) direccion

    public Persona() {
        this.nombre = "--";
        this.apellido = "---";
        this.edad = 0;
        this.direccion = null;//la direccion todavia no existe
    }

    public Persona(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void ImprimirDatos() {
        System.out.println("Persona:");
        System.out.println(nombre + " " + apellido + 
                ", " + edad + " anos");
        if(direccion == null)
            System.out.println("No hay direccion");
        else
        direccion.ImprimirDatos();
    }
}
