/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;
import ejercicio2.Administrador;

/**
 *
 * /**
 *
 * @author LAURA
 */

public class Herencia2 {

    /**
     * static Persona ingresarPersona(Scanner lector){ String nombre =
     * lector.nextLine(); String domicilio = lector.nextLine(); String horario =
     * lector.nextLine(); Persona persona = new Persona(nombre, domicilio,
     * horario); return persona; }
     *
     * static Empleado IngresarEmpleado(Scanner lector){ String
     * nombre=lector.nextLine(); String domici
     *
     *
     * }
     */
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String nombre, domicilio, horario, jefe, puesto, carrera;
        int grado;
        System.out.println("Bienvenido a la libreria de consulta");
        System.out.println("Escoja el usuario del cual desea ingresar los datos");
        System.out.println(
                "1.Estudiante");
        System.out.println(
                "2.Administrador");
        System.out.println(
                "3.Profesor");
        int opcion = lectura.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese su nombre");
                nombre = lectura.next();
                System.out.println("Ingrese su domicilio");
                domicilio = lectura.next();
                System.out.println("Ingrese su horario");
                horario = lectura.next();
                System.out.println("Ingrese su grado");
                grado = lectura.nextInt();
                Estudiante e = new Estudiante (grado, nombre, domicilio, horario);
                e.Estudiar();
                break;
            case 2:
                System.out.println("Ingrese su nombre");
                nombre = lectura.next();
                System.out.println("Ingrese su domicilio");
                domicilio = lectura.next();
                System.out.println("Ingrese su horario");
                horario = lectura.next();
                System.out.println("Ingrese su jefe");
                jefe = lectura.next();
                System.out.println("Ingrese su puesto");
                puesto = lectura.next();
                Administrador a = new Administrador(puesto, jefe, nombre, domicilio, horario);
                a.Administrar();
                break;
            case 3:
                System.out.println("Ingrese su nombre");
                nombre = lectura.next();
                System.out.println("Ingrese su domicilio");
                domicilio = lectura.next();
                System.out.println("Ingrese su horario");
                horario = lectura.next();
                System.out.println("Ingrese su jefe");
                jefe = lectura.next();
                System.out.println("Ingrese su carrera");
                carrera = lectura.next();
                Profesor p = new Profesor(carrera, jefe, nombre, domicilio, horario);
                p.Ensenar();
                break;
            default:
                System.out.println("OPCION NO VALIDA");

        }

    }

}


