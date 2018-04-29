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
    
    private String nombEmp,dir,mail;
    private int rutEmp,pass,nHuesp,telefono,empClntID,hostalID,servComID,huespID;
    
    public void ClienteBLL()
    {};
    

    public String getNombEmp() {
        return nombEmp;
    }
    

    public void setNombEmp(String nombEmp) {
        this.nombEmp = nombEmp;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getRutEmp() {
        return rutEmp;
    }

    public void setRutEmp(int rutEmp) {
        this.rutEmp = rutEmp;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public int getnHuesp() {
        return nHuesp;
    }

    public void setnHuesp(int nHuesp) {
        this.nHuesp = nHuesp;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEmpClntID() {
        return empClntID;
    }

    public void setEmpClntID(int empClntID) {
        this.empClntID = empClntID;
    }

    public int getHostalID() {
        return hostalID;
    }

    public void setHostalID(int hostalID) {
        this.hostalID = hostalID;
    }

    public int getServComID() {
        return servComID;
    }

    public void setServComID(int servComID) {
        this.servComID = servComID;
    }

    public int getHuespID() {
        return huespID;
    }

    public void setHuespID(int huespID) {
        this.huespID = huespID;
    }
    
        
    public boolean crearEmp(String nombEmp,String dir,String mail,int rutEmp,int pass,int nHuesp,int telefono,int empClntID,int hostalID,int servComID,int huespID)
    {
        setNombEmp(nombEmp);
        setDir(dir);
        setMail(mail);
        setRutEmp(rutEmp);
        setPass(pass);
        setnHuesp(nHuesp);
        setTelefono(telefono);
        setEmpClntID(empClntID);
        setHostalID(hostalID);
        setServComID(servComID);
        setHuespID(huespID);
        
        dal.ClientesDAL cdal = new dal.ClientesDAL();
        
       
        
        
        
        return false;
    };
}
