/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1proyectogui_gestiondecursos;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Cursos {
    private ArrayList<String> cursos = new ArrayList<>();

    public Cursos() {
    }

    public Cursos(ArrayList<String> cursos) {
        this.cursos = cursos;
    }
    
    public ArrayList<String> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<String> cursos) {
        this.cursos = cursos;
    }
    
    
}
