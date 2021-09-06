package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class resolucaoDesafioModulo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, String> funcionarios = new HashMap<String, String>();
        boolean operarMenu = true;

        //Entrega mínima:

        System.out.println("Olá, seja bem vinde ao nosso sistema de gerenciamento de funcionários!");
        System.out.println("Por favor, digite o nome do funcionário que gostaria de cadastrar: ");
        String nome = input.nextLine();
        System.out.println("Por favor, insira o telefone do funcionário: ");
        String telefone = input.nextLine();
        System.out.println("Por favor, insira o email do funcionário: ");
        String email = input.nextLine();
        System.out.println("Por favor, insira o CPF do funcionário: ");
        String cpf = input.nextLine();
        System.out.println(funcionarios);
        System.out.println("Funcionário cadastrado com sucesso.");


    }
}
