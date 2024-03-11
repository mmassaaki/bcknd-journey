package br.com.clima.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class Cidades {
    @JacksonXmlProperty(localName = "cidade")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Cidade> cidades;

    public List<Cidade> getCidades() {
        return cidades;
    }
}