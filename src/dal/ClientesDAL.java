/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author christianlopez
 */
public class ClientesDAL {
    
    public void cargarCategorias(){
        
        try{
            Connection conexion = Conexion.getConexion();
            String query = "SELECT * FROM categoria ORDER BY id";
            PreparedStatement consulta = conexion.prepareStatement(query);
            
            ResultSet rs = consulta.executeQuery();
            if(rs.getFetchSize() > 0){
                while(rs.next()){
                   
                }
            }
            consulta.close();
            conexion.close();
        }catch(SQLException s){
            System.out.println("Error "+s.getMessage());
        
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        
        }
    }
    
}
