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
public class Estudiante extends Persona {

    private int grado;
    private char grupo;
    Scanner leces = new Scanner(System.in);

    public Estudiante(int grado, String nombre, String domicilio, String horario) {
        super(nombre, domicilio, horario);
        this.grado = grado;
        this.grupo = 'A';
    }

    public int getGrado() {
        return grado;
    }

    public char getGrupo() {
        return grupo;
    }
    @Override
    public void Asistir() {
        System.out.println("El estudiante asiste" + "\n");
    }
    public void Estudiar() {
        System.out.print("El estudiante " + getNombre() + " que reside en la " + getDomicilio()+ " estudia en el horario de la "+getHorario());
        System.out.println(", pertenece al grupo " + grupo +" y cursa el grado "+grado+".");
    }
}
