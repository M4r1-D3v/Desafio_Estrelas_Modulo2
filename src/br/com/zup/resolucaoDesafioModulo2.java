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
            System.out.println("\n");
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

                if (funcionarios.containsKey(cpf)) {
                    System.out.println("Este CPF já existe no sistema. ");
                } else {
                    funcionarios.put(cpf, nome + " Telefone: " + telefone + " Email: " + email);
                }

            } else if (escolhaUsuario == 2) {
                if (funcionarios.size() == 0) {
                    System.out.println("Ainda não existem funcionários cadastrados.");
                } else {
                    System.out.println("Lista dos funcionários cadastrados: ");
                    for (String referencia : funcionarios.keySet()) {
                        System.out.println("Nome: " + funcionarios.get(referencia));
                    }
                }
            } else if (escolhaUsuario == 3) {
                if (funcionarios.size() == 0) {
                    System.out.println("Ainda não existem funcionários cadastrados.");
                } else {
                    System.out.println("Por favor, digite o cpf do funcionário a ser excluído: ");
                    String deleteCPF;
                    String cpfDeletado = input.nextLine();
                    for (String referencia2 : funcionarios.keySet()) {
                        if (referencia2.contains(cpfDeletado)) {
                            System.out.println("Funcionário excluído com sucesso.");
                            deleteCPF = cpfDeletado;
                        }
                    }
                    funcionarios.remove(cpfDeletado);
                }
            } else if (escolhaUsuario == 4) {
                System.out.println("Obrigada, até a próxima!");
                operarMenu = false;
            } else {
                System.out.println("Por favor digite um número válido.");
            }
        }
    }
}








