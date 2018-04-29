/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

/**
 *
 * @author papalominos
 */
public class Hostal {
    
    private int hostalID,empresaID;
    private String hostalNombre,direccion;

    public Hostal() {
    }

    public int getHostalID() {
        return hostalID;
    }

    public void setHostalID(int hostalID) {
        this.hostalID = hostalID;
    }

    public int getEmpresaID() {
        return empresaID;
    }

    public void setEmpresaID(int empresaID) {
        this.empresaID = empresaID;
    }

    public String getHostalNombre() {
        return hostalNombre;
    }

    public void setHostalNombre(String hostalNombre) {
        this.hostalNombre = hostalNombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
    
}
