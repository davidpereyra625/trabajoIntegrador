/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.trabajointegrador;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author david
 */
public class EquipoIT {
    
    public EquipoIT() {
    }

    @Test
    public void testMostrarEquipoSeleccionado() {
        System.out.println("mostrarEquipoSeleccionado");
        int idEquipo = 1;
        Equipo instance = new Equipo();
        instance.mostrarEquipoSeleccionado(idEquipo);
    }

    @Test
    public void testMostrarTodosEquipos() {
        System.out.println("mostrarTodosEquipos");
        Equipo instance = new Equipo();
        instance.mostrarTodosEquipos();
    }
    
}
