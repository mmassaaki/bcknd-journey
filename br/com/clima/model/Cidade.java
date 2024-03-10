package br.com.marvel.model;
import jakarta.*;

@XmlRootElement
public class CidadeModel {
    String nome;
    String UF;
    Integer id;

    @XMLElement
    public void setNome(String nome) {
        this.nome = nome;
    }

    @XMLElement
    public void setUF(String UF) {
        this.UF = UF;
    }

    @XMLElement
    public void setId(String id) {
        this.id = id;
    }
}
