package br.edu.ifpb.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Comandante implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdComandante;
    private String nome;
    private String pais;

    public Comandante() {
    }

    public Comandante(Long idComandante, String nome, String pais) {
        IdComandante = idComandante;
        this.nome = nome;
        this.pais = pais;
    }

    public Long getIdComandante() {
        return IdComandante;
    }

    public void setIdComandante(Long idComandante) {
        IdComandante = idComandante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Comandante that = (Comandante) object;
        return java.util.Objects.equals(IdComandante, that.IdComandante);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), IdComandante);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Comandante{" +
                "IdComandante=" + IdComandante +
                ", nome='" + nome + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}