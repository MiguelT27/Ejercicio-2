/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author LAURA
 */
public class Profesor extends Empleado {

    private String carrera;

    public Profesor(String carrera, String Jefe, String nombre, String domicilio, String horario) {
        super(Jefe, nombre, domicilio, horario);
        this.carrera = carrera;
    }
    public String getCarrera() {
        return carrera;
    }
    @Override
    public void Cobrar() {
        System.out.println("El profesor cobra");
    }
    public void Ensenar() {
        System.out.print("El profesor " + getNombre() + " que reside en la " + getDomicilio()+ " ensena en el horario de la "+getHorario());
        System.out.println(", estudio la carrera " + carrera + " y su jefe es " + getJefe()+".");
    }

}
