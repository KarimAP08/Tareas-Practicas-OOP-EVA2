/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_formato_apa;

/**
 *
 * @author KarimAP
 */
public class EVA2_4_FORMATO_APA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro Lib = new Libro();
        Lib.setAutor("Mario");
        Lib.setTitulo("Mario y Mario");
        Lib.setAno(2001);
        Lib.setMes("Marzo");
        Lib.setDia(12);
        Lib.setCiudad("Puebla");
        Lib.setEditor("Jorge");
        Lib.setVolumen(12);
        System.out.println("DATOS DEL LIBRO");
        System.out.println(Lib.getAutor());
        System.out.println(Lib.getTitulo());
        System.out.println(Lib.getAno());
        System.out.println(Lib.getMes());
        System.out.println(Lib.getDia());
        System.out.println(Lib.getCiudad());
        System.out.println(Lib.getEditor());
        System.out.println(Lib.getVolumen());

        Articulo Arti = new Articulo();
        Arti.setAutor("Jose");
        Arti.setTitulo("Mario y Mario(Resena)");
        Arti.setAno(2002);
        Arti.setMes("Marzo");
        Arti.setDia(12);
        Arti.setCiudad("Puebla");
        Arti.setNumero(12);
        Arti.setMedio("Elrincondelvago");
        System.out.println("DATOS DEL Articulo");
        System.out.println(Arti.getAutor());
        System.out.println(Arti.getTitulo());
        System.out.println(Arti.getAno());
        System.out.println(Arti.getMes());
        System.out.println(Arti.getDia());
        System.out.println(Arti.getCiudad());
        System.out.println(Arti.getNumero());
        System.out.println(Arti.getMedio());

        Informe Info = new Informe();
        Info.setAutor("Juan Guarnizo");
        Info.setTitulo("El agua en el Tec");
        Info.setAno(2022);
        Info.setMes("Marzo");
        Info.setDia(12);
        Info.setCiudad("Chihuahua");
        Info.setInstitucion("Tec2");
        Info.setTipodeinforme("Expositivo");
        System.out.println("DATOS DEL INFORME");
        System.out.println(Info.getAutor());
        System.out.println(Info.getTitulo());
        System.out.println(Info.getAno());
        System.out.println(Info.getMes());
        System.out.println(Info.getDia());
        System.out.println(Info.getCiudad());
        System.out.println(Info.getInstitucion());
        System.out.println(Info.getTipodeinforme());

        SitioWeb Web = new SitioWeb();
        Web.setAutor("Desconocido");
        Web.setTitulo("Mario");
        Web.setAno(2023);
        Web.setMes("Marzo");
        Web.setDia(10);
        Web.setCiudad("Chihuahua");
        Web.setURL("https://es.wikipedia.org/wiki/Mario_(personaje)");
        Web.setComentarios("Esta Chido");
        System.out.println("DATOS DEL SITIO WEB");
        System.out.println(Web.getAutor());
        System.out.println(Web.getTitulo());
        System.out.println(Web.getAno());
        System.out.println(Web.getMes());
        System.out.println(Web.getDia());
        System.out.println(Web.getCiudad());
        System.out.println(Web.getURL());
        System.out.println(Web.getComentarios());
    }

}
