/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.empleados;

/**
 *
 * @author alberto.casanova
 */
public class Empleado {
    String nombre;
    String apellido;
    Float sueldo;
    
    public Empleado (String nombre, String apellido, Float sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }
}
