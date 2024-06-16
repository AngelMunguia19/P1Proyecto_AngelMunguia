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
    public String cursos;

    public Cursos() {
    }

    public Cursos(String cursos) {
        this.cursos = cursos;
    }
    
    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return cursos;
    }   
}
