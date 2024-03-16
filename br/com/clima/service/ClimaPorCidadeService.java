package br.com.clima.service;

import br.com.Util;
import br.com.clima.model.Previsoes;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ClimaPorCidadeService {
    static String webService = "http://servicos.cptec.inpe.br/XML/cidade/";
    static int codigoSucesso = 200;
    public static Previsoes buscaClimaPorId(String id) throws Exception {
        String chamada = webService + id + "/previsao.xml";

        try {
            URL url = new URL(chamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            if (conexao.getResponseCode() != codigoSucesso)
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());

            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
            String XMLEmString = Util.converteJsonEmString(resposta);

            XmlMapper xmlMapper = new XmlMapper();
            return xmlMapper.readValue(XMLEmString, Previsoes.class);
        } catch (Exception e) {
            throw new Exception("ERRO: " + e);
        }
    }}