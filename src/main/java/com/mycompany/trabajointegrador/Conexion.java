/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajointegrador;

/**
 *
 * @author david
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/tpintegrador", "root", "");
    }
}
