package br.com.clima.service;

import br.com.Util;
import br.com.clima.model.Cidades;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CidadeServico {
    static String webService = "http://servicos.cptec.inpe.br/XML/listaCidades?city=";
    static int codigoSucesso = 200;
    public static Cidades buscaCidadePorNome(String nome) throws Exception {
        String chamada = webService + nome;

        try {
            URL url = new URL(chamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            if (conexao.getResponseCode() != codigoSucesso)
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());

            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
            String XMLEmString = Util.converteJsonEmString(resposta);

            XmlMapper xmlMapper = new XmlMapper();
            return xmlMapper.readValue(XMLEmString, Cidades.class);
        } catch (Exception e) {
            throw new Exception("ERRO: " + e);
        }
    }}