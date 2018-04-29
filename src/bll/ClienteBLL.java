/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

/**
 *
 * @author ppalominos
 */
public class ClienteBLL {
    
    private String nombreEmpresa,direccion,mail;
    private int rutEmpresa,pass,telefono;

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getRutEmpresa() {
        return rutEmpresa;
    }

    public void setRutEmpresa(int rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    public boolean crearEmp(String nombEmp,String dir,String mail,int rutEmp,int pass,int nHuesp,int telefono,int empClntID,int hostalID,int servComID,int huespID)
    {  
        
        ClientesDAL cdal = new ClientesDAL();
       
        cdal.nuevaEmpresa(nombEmp, dir, mail, rutEmp, pass, nHuesp, telefono, empClntID, hostalID, servComID, huespID);
       if()
       {
           return true;
       }
       
              return false;
    };
>>>>>>> 564201c2db932f7281938817242ae94242827f6f
}
