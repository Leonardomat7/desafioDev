package com.desafio.dev.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.util.List;


@Entity
@XmlRootElement(name = "agente")
@XmlAccessorType(XmlAccessType.FIELD)
public class Agente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int codigo;
    private String data;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "agente_id")
    @XmlElement(name = "regiao")
    private List<Regiao> regioes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Regiao> getRegioes() {
        return regioes;
    }

    public void setRegioes(List<Regiao> regioes) {
        this.regioes = regioes;
    }
}
