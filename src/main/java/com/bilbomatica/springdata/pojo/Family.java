package com.bilbomatica.springdata.pojo;

import org.springframework.data.annotation.Id;

import java.util.Arrays;

public class Family {

    @Id
    private String id;

    private int selfId;

    private String nombre;

    private Persons[] personas;


    public Family() {
        this.selfId = 0;
        this.nombre = "";

    }

    public Family(int selfId, String nombre, Persons[] personas) {

        this.selfId = selfId;
        this.nombre = nombre;
        this.personas = personas;
    }

    public Persons[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persons[] personas) {
        this.personas = personas;
    }

    public int getSelfId() {
        return selfId;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Family{" +
                "id='" + id + '\'' +
                ", selfId=" + selfId +
                ", nombre='" + nombre + '\'' +
                ", personas=" + Arrays.toString(personas) +
                '}';
    }
}
