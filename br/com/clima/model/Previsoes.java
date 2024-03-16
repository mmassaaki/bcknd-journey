package br.com.clima.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class Previsoes {
    @JacksonXmlProperty(localName = "cidade")
    private String cidade;
    @JacksonXmlProperty(localName = "nome")
    private String nome;
    @JacksonXmlProperty(localName = "uf")
    private String uf;
    @JacksonXmlProperty(localName = "atualizacao")
    private String atualizacao;
    @JacksonXmlProperty(localName = "previsao")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Previsao> previsoes;

    public List<Previsao> getPrevisoes() {
        return previsoes;
    }
}