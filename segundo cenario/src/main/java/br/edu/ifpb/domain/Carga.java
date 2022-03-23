package br.edu.ifpb.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Carga implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codCarga;
    private String origem;
    private String destino;

    public Carga() {
    }

    public Carga(Long codCarga, String origem, String destino) {
        this.codCarga = codCarga;
        this.origem = origem;
        this.destino = destino;
    }

    public Long getCodCarga() {
        return codCarga;
    }

    public void setCodCarga(Long codCarga) {
        this.codCarga = codCarga;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Carga carga = (Carga) object;
        return java.util.Objects.equals(codCarga, carga.codCarga);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), codCarga);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Carga{" +
                "codCarga=" + codCarga +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                '}';
    }
}