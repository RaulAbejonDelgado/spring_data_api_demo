package com.bilbomatica.springdata.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;


/**
 * @Document(collection="personas") vinculacion entre objeto y coleccion de mongo
 * @Data Usado para creacion y gestion de getters y setters por spring data
 * @AllArgsConstructor Esto nos genera un constructor con todos las propiedades
 * @NoArgsConstructor Esto nos generra un constructor vacio
 */
@Document(collection="familias")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Family {


    private String id;

    @Id
    private int selfId;

    private String nombre;

    private Persons[] personas;


//    public Family() {
//        this.selfId = 0;
//        this.nombre = "";
//
//    }
//
//    public Family(int selfId, String nombre, Persons[] personas) {
//
//        this.selfId = selfId;
//        this.nombre = nombre;
//        this.personas = personas;
//    }
//
//    public Persons[] getPersonas() {
//        return personas;
//    }
//
//    public void setPersonas(Persons[] personas) {
//        this.personas = personas;
//    }
//
//    public int getSelfId() {
//        return selfId;
//    }
//
//    public void setSelfId(int selfId) {
//        this.selfId = selfId;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    @Override
//    public String toString() {
//        return "Family{" +
//                "id='" + id + '\'' +
//                ", selfId=" + selfId +
//                ", nombre='" + nombre + '\'' +
//                ", personas=" + Arrays.toString(personas) +
//                '}';
//    }
}
