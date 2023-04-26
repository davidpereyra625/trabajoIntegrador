/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajointegrador;

/**
 *
 * @author david
 * 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Equipo {
    private int idEquipo;
    private String nombre;
    private int titulares;
    private int suplentes;
    private String directorTecnico;
    private int puntos;
    private int partidosJugados;
    
    
    
public void mostrarEquipoSeleccionado(int idEquipo) {
    try (Connection con = Conexion.getConnection();
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM equipos WHERE id_equipo = " + idEquipo)) {
        if (rs.next()) {
            System.out.println("ID del equipo: " + rs.getInt("id_equipo"));
            System.out.println("Nombre del equipo: " + rs.getString("nombre_equipo"));
            System.out.println("Jugadores titulares: " + rs.getInt("titulares"));
            System.out.println("Jugadores suplentes: " + rs.getInt("suplentes"));
            System.out.println("Director técnico: " + rs.getString("director_tecnico"));
            System.out.println("Puntos acumulados: " + rs.getInt("puntos"));
            System.out.println("Partidos jugados: " + rs.getInt("partidos_jugados"));
        } else {
            System.out.println("No se encontró el equipo con ID " + idEquipo);
        }
    } catch (SQLException e) {
        System.out.println("Error al conectarse a la base de datos: " + e.getMessage());
    }
}  
  public void mostrarTodosEquipos() {
    try (Connection con = Conexion.getConnection();
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM equipos")) {
        while (rs.next()) {
            System.out.println("ID del equipo: " + rs.getInt("id_equipo"));
            System.out.println("Nombre del equipo: " + rs.getString("nombre_equipo"));
            System.out.println("Jugadores titulares: " + rs.getInt("titulares"));
            System.out.println("Jugadores suplentes: " + rs.getInt("suplentes"));
            System.out.println("Director técnico: " + rs.getString("director_tecnico"));
            System.out.println("Puntos acumulados: " + rs.getInt("puntos"));
            System.out.println("Partidos jugados: " + rs.getInt("partidos_jugados"));
            System.out.println("-------------------------------------------");
        }
    } catch (SQLException e) {
        System.out.println("Error al conectarse a la base de datos: " + e.getMessage());
    }
}
            
}
