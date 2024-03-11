package br.com.clima.client;

import br.com.clima.model.Cidade;
import br.com.clima.model.Cidades;
import br.com.clima.service.CidadeServico;

import java.util.Scanner;

public class ScannerClima {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da cidade:");
        String nome = scanner.nextLine();

        Cidades cidades = CidadeServico.buscaCidadePorNome(nome);

        for (Cidade cidade : cidades.getCidades()) {
            System.out.println("Nome: " + cidade.getNome());
            System.out.println("UF: " + cidade.getUF());
            System.out.println("ID: " + cidade.getId());
            System.out.println("-------------------");
        }
    }
}