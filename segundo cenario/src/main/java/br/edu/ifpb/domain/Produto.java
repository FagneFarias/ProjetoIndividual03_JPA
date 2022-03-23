package br.edu.ifpb.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Produto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codProduto;
    private String categoria;
    private String nome;

    public Produto() {
    }

    public Produto(Long codProduto, String categoria, String nome) {
        this.codProduto = codProduto;
        this.categoria = categoria;
        this.nome = nome;
    }

    public Long getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Long codProduto) {
        this.codProduto = codProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Produto produto = (Produto) object;
        return java.util.Objects.equals(codProduto, produto.codProduto);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), codProduto);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Produto{" +
                "codProduto=" + codProduto +
                ", categoria='" + categoria + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}