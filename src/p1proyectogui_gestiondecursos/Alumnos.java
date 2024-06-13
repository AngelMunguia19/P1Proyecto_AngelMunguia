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
    private String nombre;
    private String sexo;
    private int identidad;
    private int edad;

    public Alumnos() {
    }

    public Alumnos(String nombre, String sexo, int identidad, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.identidad = identidad;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdentidad() {
        return identidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
