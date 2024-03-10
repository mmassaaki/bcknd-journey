package br.com.buscador.client;
import br.com.buscador.dominio.*;
import br.com.buscador.servico.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception{
        System.out.print("Informe seu CEP: ");
        String cep = new Scanner(System.in).nextLine();
        Endereco endereco = ServicoCep.buscaEnderecoPelo(cep);

            System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Localidade: " + endereco.getLocalidade());
    }

}
