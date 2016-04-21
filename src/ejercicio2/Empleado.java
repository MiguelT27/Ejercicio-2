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
public abstract class Empleado extends Persona {

    private String Jefe;

    public Empleado(String Jefe, String nombre, String domicilio, String horario) {
        super(nombre, domicilio, horario);
        this.Jefe = Jefe;
    }
    public String getJefe() {
        return Jefe;
    }
    @Override
    public void Asistir() {
        System.out.println("El empleado asiste" + "\n");
    }
    public abstract void Cobrar();
}
