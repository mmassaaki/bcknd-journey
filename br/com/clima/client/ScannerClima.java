package br.com.clima.client;

import br.com.clima.model.Cidade;
import br.com.clima.model.Cidades;
import br.com.clima.model.Previsao;
import br.com.clima.model.Previsoes;
import br.com.clima.service.CidadeServico;
import br.com.clima.service.ClimaPorCidadeService;
import br.com.clima.enumCondicaoClima;

import java.util.Scanner;

public class ScannerClima {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da cidade:");
        String nome = scanner.nextLine();

        Cidades cidades = CidadeServico.buscaCidadePorNome(nome);

        if (cidades.getCidades() == null) {
            System.out.println("Não foram encontrados resultados");
        } else {
            System.out.println("Foram encontrados os seguintes resultados:");
            for (int i = 0; i < cidades.getCidades().size(); i++) {
                Cidade cidade = cidades.getCidades().get(i);
                System.out.println((i + 1) + ". " + cidade.getNome() + " - " + cidade.getUF());
            }

            System.out.println("Digite o número da cidade desejada:");
            int numeroEscolhido = scanner.nextInt();
            if (numeroEscolhido >= 1 && numeroEscolhido <= cidades.getCidades().size()) {
                int idEscolhido = cidades.getCidades().get(numeroEscolhido - 1).getId();
                Previsoes previsoes = ClimaPorCidadeService.buscaClimaPorId(Integer.toString(idEscolhido));
                for(Previsao previsao : previsoes.getPrevisoes()){
                    System.out.println("Dia " + previsao.getDia());
                    System.out.println("Máxima" + previsao.getMaxima());
                    System.out.println("Mínima" + previsao.getMinima());
                    enumCondicaoClima condicao = enumCondicaoClima.valueOf(previsao.getTempo());
                    System.out.println(condicao.getDescricao());
                }

            } else {
                System.out.println("Número inválido. Tente novamente.");
            }
        }
    }
}