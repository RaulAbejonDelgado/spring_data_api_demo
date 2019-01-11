package com.bilbomatica.springdata.pojo;

import org.springframework.data.annotation.Id;

public class Person  {

    @Id
    private String id;

    private int selfId;

    private int familyId;

    private String nombre;

    private String correo;

    private String password;


    public int getFamilyId() {
        return familyId;
    }

    public void setFamilyId(int familyId) {
        this.familyId = familyId;
    }

    public void setSelfId(int selfId) {
        this.selfId = selfId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSelfId() {
        return selfId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "selfId=" + selfId +
                ", familyId=" + familyId +
                ", nombre='" + nombre + '\'' +
                ", email='" + correo + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                '}';
    }
}
