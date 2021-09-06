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

       /* System.out.println("Olá, seja bem vinde ao nosso sistema de gerenciamento de funcionários!");
        System.out.println("Por favor, digite o nome do funcionário que gostaria de cadastrar: ");
        String nome = input.nextLine();
        System.out.println("Por favor, insira o telefone do funcionário: ");
        String telefone = input.nextLine();
        System.out.println("Por favor, insira o email do funcionário: ");
        String email = input.nextLine();
        System.out.println("Por favor, insira o CPF do funcionário: ");
        String cpf = input.nextLine();
        funcionarios.put(cpf, " Nome: " + nome + " Telefone: " + telefone + " Email: " + email);
        System.out.println(funcionarios);
        System.out.println("Funcionário cadastrado com sucesso.");*/


        int escolhaUsuario = 0;
        while (operarMenu == true) {
            System.out.println("Para cadastrar um funcionário, digite: 1");
            System.out.println("Para exibir uma lista dos funcionários cadastrados, digite: 2");
            System.out.println("Para excluir um funcionário, digite: 3");
            System.out.println("Para encerrar o programa, digite: 4");
            escolhaUsuario = input.nextInt();
            input.nextLine();

            if (escolhaUsuario == 1) {
                System.out.println("Por favor, digite o nome do funcionário: ");
                String nome = input.nextLine();

                System.out.println("Por favor, insira o telefone do funcionário: ");
                String telefone = input.nextLine();

                System.out.println("Por favor, insira o email do funcionário: ");
                String email = input.nextLine();

                System.out.println("Por favor, insira o CPF do funcionário: ");
                String cpf = input.nextLine();



            }
}
