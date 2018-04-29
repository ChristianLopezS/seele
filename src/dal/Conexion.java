/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection getConexion() {

        Connection cnx = null;
               
        String url = "jdbc:oracle:thin:@190.163.54.194:1521:XE";
        String user = "portafolio2018";
        String pass = "ke0r1aseele";

/*      String url, user, pass;
        url = "jdbc:oracle:thin:@localhost:1521:XE";
        user = "system";
        pass = "lcgroup";
*/                
        System.out.println("Prueba de conexión...");
        
        try 
        {
            cnx = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión con la base de datos resultó satisfactoria");
        } 
        catch (SQLException e) 
        {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }      
        return cnx;
    }
}
