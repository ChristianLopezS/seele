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
public class HuespedBll {
    
    private String nombre,apellido_paterno,apellido_materno,mail,genero;
    private int edad,nivel,clienteRutEmpresa,rut,empcli_empcliid,empresaclientid;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getClienteRutEmpresa() {
        return clienteRutEmpresa;
    }

    public void setClienteRutEmpresa(int clienteRutEmpresa) {
        this.clienteRutEmpresa = clienteRutEmpresa;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getEmpcli_empcliid() {
        return empcli_empcliid;
    }

    public void setEmpcli_empcliid(int empcli_empcliid) {
        this.empcli_empcliid = empcli_empcliid;
    }

    public int getEmpresaclientid() {
        return empresaclientid;
    }

    public void setEmpresaclientid(int empresaclientid) {
        this.empresaclientid = empresaclientid;
    }
      
    
    
    
}
