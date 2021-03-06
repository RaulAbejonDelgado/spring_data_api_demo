package com.bilbomatica.springdata.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
import java.util.Date;

/**
 * @Document(collection="personas") vinculacion entre objeto y coleccion de mongo
 * @Data Usado para creacion y gestion de getters y setters por spring data
 * @AllArgsConstructor Esto nos genera un constructor con todos las propiedades
 * @NoArgsConstructor Esto nos generra un constructor vacio
 */
@Document(collection="comentarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {


    private String id;

    private Family[] familia;

    private String titulo;

    private String texto;

    private Persons[] persona;

    @Id
    private int selfId;

    private Date fecha;



//
//    public Comment() {
//        this.familia = null;
//        this.texto = "";
//        this.persona = null;
//    }
//
//    public Comment( Family[] familia, String texto, Persons[] persona, int comentarioId) {
//
//        this.familia = familia;
//        this.texto = texto;
//        this.persona = persona;
//        this.selfId = comentarioId;
//    }
//
//    public Family[] getFamilia() {
//        return familia;
//    }
//
//    public void setFamilia(Family[] familia) {
//        this.familia = familia;
//    }
//
//    public String getTexto() {
//        return texto;
//    }
//
//    public void setTexto(String texto) {
//        this.texto = texto;
//    }
//
//    public Persons[] getPersona() {
//        return persona;
//    }
//
//    public void setPersona(Persons[] persona) {
//        this.persona = persona;
//    }
//
//    public int getSelfId() {
//        return selfId;
//    }
//
//    public void setSelfId(int selfId) {
//        this.selfId = selfId;
//    }
//    public String getTitulo() {
//        return titulo;
//    }
//
//    public void setTitulo(String titulo) {
//        this.titulo = titulo;
//    }
//
//    public Date getFecha() {
//        return fecha;
//    }
//
//    public void setFecha(Date fecha) {
//        this.fecha = fecha;
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
//        return "Comment{" +
//                "familia=" + Arrays.toString(familia) +
//                ", titulo='" + titulo + '\'' +
//                ", texto='" + texto + '\'' +
//                ", persona=" + Arrays.toString(persona) +
//                ", selfId=" + selfId +
//                ", fecha=" + fecha +
//                ", _id=" + id +
//                '}';
//    }
}
