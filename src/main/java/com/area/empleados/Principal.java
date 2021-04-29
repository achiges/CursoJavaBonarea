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
public class Principal {
    
    public static void main(String[] args){
        Empleado arrayEmpleados[] = new Empleado[5];
        arrayEmpleados[0] = new Empleado("Alberto", "Casanova", 1500.00f);
        arrayEmpleados[1] = new Empleado("Clara", "Gregori", 1400.50f);
        arrayEmpleados[2] = new Empleado("Jordi", "Ascension", 800.00f);
        arrayEmpleados[3] = new Empleado("Xavier", "Verges", 1200.00f);
        arrayEmpleados[4] = new Empleado("Marc", "Cano", 2000.99f);
        
        float sueltoTotal = 0.00f;
        
        for (Empleado empleado : arrayEmpleados ) {
            sueltoTotal += empleado.sueldo; 
        }
        
        System.out.println("La suma de los sueldos de los empleados es " + 
                sueltoTotal);
    }  
    
}
