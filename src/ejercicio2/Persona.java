/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author LAURA
 */
public abstract class Persona {

    private String nombre;
    private String domicilio;
    private String horario;

    public Persona(String nombre, String domicilio, String horario) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.horario = horario;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public String getHorario() {
        return horario;
    }
    public abstract void Asistir();
}
