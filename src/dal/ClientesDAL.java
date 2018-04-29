/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;
 
import bll.ClienteBLL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author christianlopez
 */
public class ClientesDAL {
    
    public ArrayList<ClienteBLL> getAll(){
        
        ArrayList<ClienteBLL> clientes = new ArrayList<>();
        
        try{
            Conexion conexion = Conexion.getInstance();
            Connection conn = conexion.getConnection();
            String query = "SELECT * FROM empresacliente";
            PreparedStatement consulta = conn.prepareStatement(query);
            
            ResultSet resultado = consulta.executeQuery();
            ClienteBLL cliente = new ClienteBLL();
            while (resultado.next()) {
               cliente.setRutEmpresa(resultado.getInt("rutempresa"));
               cliente.setNombreEmpresa(resultado.getString("nombreempresa"));
                System.out.println(resultado.getString("nombreempresa"));
               
                /*
                empleado.setCodigo(resultado.getInt("codigo"));
                System.out.println(resultado.getInt("codigo"));
                empleado.setRut(resultado.getInt("rut"));
                empleado.setNombre(resultado.getString("nombre"));
                empleado.setApellido(resultado.getString("apellido"));
                empleado.setCelular(resultado.getInt("celular"));
                empleado.setEmail(resultado.getString("email"));
                empleado.setSueldo(resultado.getInt("sueldo_bruto"));
                empleado.setCivil(resultado.getString("est_civil"));
                empleado.setDpto(resultado.getString("nom_depto"));
                listarEmpleados.add(empleado);

*/
            }
            
        }catch(SQLException s){
            System.out.println("Error "+s.getMessage());
        
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        
        }
        
        return clientes;
    }
    
 
    public boolean nuevaEmpresa(String nombEmp,String dir,String mail,int rutEmp,int pass,int nHuesp,int telefono,int empClntID,int hostalID,int servComID,int huespID) throws SQLException
    {
        Conexion conexion = Conexion.getInstance();
        Connection conn = conexion.getConnection();
        
        return true;
    }
    
}
