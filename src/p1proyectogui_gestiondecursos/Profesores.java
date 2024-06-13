/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1proyectogui_gestiondecursos;

/**
 *
 * @author Usuario
 */
public class Profesores {
    private String nombre;
    private int identidad;
    private int edad;
    private String sexo;
    private String estado;
    private int telefono;

    public Profesores() {
    }

    public Profesores(String nombre, int identidad, int edad, String sexo, String estado, int telefono) {
        this.nombre = nombre;
        this.identidad = identidad;
        this.edad = edad;
        this.sexo = sexo;
        this.estado = estado;
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentidad() {
        return identidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nombre;
    }   
}
