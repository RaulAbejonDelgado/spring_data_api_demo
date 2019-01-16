package com.bilbomatica.springdata.pojo;

import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.AllArgsConstructor;

/**
 * @Document(collection="personas") vinculacion entre objeto y coleccion de mongo
 * @Data Usado para creacion y gestion de getters y setters por spring data
 * @AllArgsConstructor Esto nos genera un constructor con todos las propiedades
 * @NoArgsConstructor Esto nos generra un constructor vacio
 */
@Document(collection="personas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persons  {


    private String id;

    @Id
    private int selfId;

    private int familyId;

    private String nombre;

    private String correo;

    private String password;


//    public int getFamilyId() {
//        return familyId;
//    }
//
//    public void setFamilyId(int familyId) {
//        this.familyId = familyId;
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
//
//    public String getCorreo() {
//        return correo;
//    }
//
//    public void setCorreo(String correo) {
//        this.correo = correo;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
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
//    public int getSelfId() {
//        return selfId;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "selfId=" + selfId +
//                ", familyId=" + familyId +
//                ", nombre='" + nombre + '\'' +
//                ", email='" + correo + '\'' +
//                ", password='" + password + '\'' +
//                ", id=" + id +
//                '}';
//    }
}
