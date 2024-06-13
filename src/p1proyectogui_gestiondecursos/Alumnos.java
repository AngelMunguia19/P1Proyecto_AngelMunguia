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
public class Alumnos {
    private int NumCuenta;
    private String nombre;
    private String profesor;
    private int calificaciones;
    private String identidad;
    private ArrayList<String> estudiantes;

    public Alumnos(String nombre, String profesor, int NumCuenta) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
        this.NumCuenta = NumCuenta;
        this.estudiantes = new ArrayList<>();
    }

    public ArrayList<String> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<String> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    public int getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(int NumCuenta) {
        this.NumCuenta = NumCuenta;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int calificaciones) {
        this.calificaciones = calificaciones;
    }  
}
