/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_formato_apa;

/**
 *
 * @author KarimAP
 */
public class Libro extends Documento {

    private String Editor;
    private int Volumen;

    public Libro() {
    }

    public String getEditor() {
        return Editor;
    }

    public void setEditor(String Editor) {
        this.Editor = Editor;
    }

    public int getVolumen() {
        return Volumen;
    }

    public void setVolumen(int Volumen) {
        this.Volumen = Volumen;
    }

}
