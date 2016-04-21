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
public class Administrador extends Empleado {

    private String puesto;

    public Administrador(String puesto, String Jefe, String nombre, String domicilio, String horario) {
        super(Jefe, nombre, domicilio, horario);
        this.puesto = puesto;
    }
    @Override
    public void Cobrar() {
        System.out.println("El administrador cobra");
    }
    public void Administrar() {
        System.out.print("El administrador " + getNombre() + " que reside en la " + getDomicilio()+ " trabaja en el horario de la "+getHorario());
        System.out.println(", ocupa el puesto de" + puesto + ", en el que tiene como Jefe a " + getJefe()+".");
    }

}
