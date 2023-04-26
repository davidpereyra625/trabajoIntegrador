/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajointegrador;

/**
 *
 * @author david
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EquipoTest {
    @Test
    public void testMostrarEquipoSeleccionado() {
        Equipo equipo = new Equipo();
        equipo.mostrarEquipoSeleccionado(1);
    }
    
    @Test
    public void testMostrarTodosEquipos() {
        Equipo equipo = new Equipo();
        equipo.mostrarTodosEquipos();
     }
}
