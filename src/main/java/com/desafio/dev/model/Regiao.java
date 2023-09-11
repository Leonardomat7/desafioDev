package com.desafio.dev.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.util.List;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Regiao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @XmlAttribute
    private String sigla;

    @ElementCollection
    @CollectionTable(name = "geracao")
    private List<Double> geracao;

    @ElementCollection
    @CollectionTable(name = "compra")
    private List<Double> compra;

    @ElementCollection
    @CollectionTable(name = "preco_medio")
    private List<Double> precoMedio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public List<Double> getGeracao() {
        return geracao;
    }

    public void setGeracao(List<Double> geracao) {
        this.geracao = geracao;
    }

    public List<Double> getCompra() {
        return compra;
    }

    public void setCompra(List<Double> compra) {
        this.compra = compra;
    }

    public List<Double> getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(List<Double> precoMedio) {
        this.precoMedio = precoMedio;
    }
}
