package br.com.clima.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Date;

@JacksonXmlRootElement
public class Previsao {
    @JacksonXmlProperty(localName = "nome")
    String nome;
    @JacksonXmlProperty(localName = "uf")
    String uf;
    @JacksonXmlProperty(localName = "cidade")
    String cidade;
    @JacksonXmlProperty(localName = "dia")
    Date dia;
    @JacksonXmlProperty(localName = "tempo")
    String tempo;
    @JacksonXmlProperty(localName = "maxima")
    Integer maxima;

    @JacksonXmlProperty(localName = "minima")
    Integer minima;

    public Date getDia() {
        return dia;
    }

    public String getTempo() {
        return tempo;
    }

    public Integer getMaxima() {
        return maxima;
    }

    public Integer getMinima() {
        return minima;
    }
}
