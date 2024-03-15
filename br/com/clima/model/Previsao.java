package br.com.clima.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
public class Cidade {
    @JacksonXmlProperty(localName = "cidade")
    String cidade;
    @JacksonXmlProperty(localName = "nome")
    String nome;
    @JacksonXmlProperty(localName = "uf")
    String UF;
    @JacksonXmlProperty(localName = "id")
    Integer id;

    public String getNome() {
        return this.nome;
    }

    public String getUF() {
        return this.UF;
    }

    public Integer getId() {
        return this.id;
    }
}
