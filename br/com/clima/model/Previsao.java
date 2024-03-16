package br.com.clima.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Date;

@JacksonXmlRootElement
public class Previsao {


    Date dia;

    String tempo;

    Integer maxima;


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
    public Double iuv;
}
