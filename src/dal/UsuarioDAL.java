package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christianlopez
 */
public class UsuarioDAL {
    
    private String usuario, pass;
    
    public boolean validarUsuario(String usuario, String pass) throws SQLException
    {
        boolean resultado = false;
        Connection conexion = Conexion.getConexion();
        String query = "SELECT * FROM funcionario WHERE funcionarioid = "+usuario+" AND contraseña = "+pass+"";
        System.out.println(query);
        PreparedStatement consulta = conexion.prepareStatement(query);
        ResultSet rs = consulta.executeQuery();
   
        while(rs.next())
        {
            System.out.println("Fila: "+rs.getRow());
            resultado = (rs.getRow()>1)?false:true;
                       
        }
        
        return resultado;

    }
    
    private ResultSet getUsuario() throws SQLException
    {
        Connection conexion = Conexion.getConexion();
        String query = "SELECT * FROM funcionario ORDER BY funcionarioid ASC";
        PreparedStatement consulta = conexion.prepareStatement(query);
        ResultSet rs = consulta.executeQuery();
        
        
        return rs;
    }
    
    
    

    
    /*
    
    public void cargarCategorias(){
        this.formulario.cboCategoria.removeAllItems();
        try{
            Connection conexion = Conexion.getConexion();
            String query = "SELECT * FROM categoria ORDER BY id";
            PreparedStatement consulta = conexion.prepareStatement(query);
            
            ResultSet rs = consulta.executeQuery();
            this.formulario.cboCategoriaListado.addItem("Todas");
            if(rs.getFetchSize() > 0){
                while(rs.next()){
                    this.formulario.cboCategoria.addItem(rs.getString("descripcion"));
                    this.formulario.cboCategoria1.addItem(rs.getString("descripcion"));
                    this.formulario.cboCategoriaListado.addItem(rs.getString("descripcion"));
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
*/
    
}
