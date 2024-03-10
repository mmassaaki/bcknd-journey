package br.com.marvel.service;
import java.net.HttpURLConnection;
import java.util.*;
public class ClimaService {
    static String cidadeUri = "http://servicos.cptec.inpe.br/XML/listaCidades?city=";
    public static Cidade buscaCidade(String nome) throws Exception {
        String chamada = cidadeUri + nome;
        try {
            URL url = new url(chamada);
            HttpURLConnection conexClima = (HttpURLConnection) url.openconnection;

        }
    }

}
