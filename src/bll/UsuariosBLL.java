/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;
import dal.UsuarioDAL;
import java.sql.SQLException;

/**
 *
 * @author christianlopez
 */
public class UsuariosBLL {
    
    UsuarioDAL usuario = new UsuarioDAL();
    
    public boolean validarLogin(String usuario, String pass) throws SQLException
    {
        return this.usuario.validarUsuario(usuario, pass);
    }
    
}
