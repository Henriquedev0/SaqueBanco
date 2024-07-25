package SaqueBanco.App;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int saldo = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1- Saldo");
            System.out.println("2- Depositar");
            System.out.println("3- Sacar");
            System.out.println("4- Sair");
            System.out.print("Opção >: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1" -> {
                    System.out.println("Você tem de saldo: " + saldo);
                }
                case "2" -> {
                    System.out.print("Digite o valor para depositar: ");
                    int deposito = Integer.parseInt(scanner.nextLine());
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso. Saldo atual: " + saldo);
                    } else {
                        System.out.println("Valor inválido para depósito.");
                    }
                }
                case "3" -> {
                    System.out.print("Digite o valor para sacar: ");
                    int saque = Integer.parseInt(scanner.nextLine());
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente para saque.");
                    } else {
                        System.out.println("Valor inválido para saque.");
                    }
                }
                case "4" -> {
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Erro, opção inválida.");
            }
        } while (true);
    }
}
