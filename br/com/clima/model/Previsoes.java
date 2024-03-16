package br.com.clima.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class Previsoes {
    @JacksonXmlProperty(localName = "cidade")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Previsao> previsoes;

    public List<Previsao> getPrevisoes() {
        return previsoes;
    }
}