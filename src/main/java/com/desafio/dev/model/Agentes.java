package com.desafio.dev.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "agentes")
public class Agentes {
    private List<Agente> agentes;

    @XmlElement(name = "agente")
    public List<Agente> getAgentes() {
        return agentes;
    }

    public void setAgentes(List<Agente> agentes) {
        this.agentes = agentes;
    }
}
