package src.views;

import src.service.BookLoans;
import src.service.UserServices; // Importe o UserServices

import java.util.Scanner;

public class MenuView {
    // Atributos de instância (agora todos injetados)
    private UserServices userServices = null;
    private final BookLoans bookLoans;
    private final Scanner scanner;

    // Construtor recebendo todos os serviços necessários
    public MenuView(BookLoans bookLoans, Scanner scanner) {
        this.userServices = userServices;
        this.bookLoans = bookLoans;
        this.scanner = scanner;
    }

    // Loop para execução do programa até sua finalização
    public void showMenu() {
        boolean codeRunned = true;

        while (codeRunned) {
            try {
                int choice = displayOptions();

                switch (choice) {
                    case 1 -> {
                        // bookService.gerenciarLivros();
                        System.out.println("Módulo de Livros em construção...");
                    }
                    case 2 -> {
                        // Chamando o método através da instância injetada
                        userServices.registerUsers();
                    }
                    case 3 -> {
                        // bookLoans.gerenciarEmprestimos();
                        System.out.println("Módulo de Empréstimos em construção...");
                    }
                    case 4 -> {
                        System.out.println("Obrigado por usar o nosso sistema! ✌️");
                        codeRunned = false;
                    }
                    default -> {
                        System.out.println("🤖 Ops, comando não reconhecido!");
                        System.out.println("Essa opção não consta no meu sistema. Que tal tentar de novo?\n");
                    }
                }
            } catch (Exception e) {
                System.out.println("\n🤖 Ops, comando não reconhecido!");
                scanner.nextLine();
            }
        }
    }

    // Menu de serviços disponíveis no sistema
    public int displayOptions() {
        System.out.println("\n" + "=".repeat(30));
        System.out.println("📖 Library Management 📖");
        System.out.println("=".repeat(30));

        System.out.println("\n1. Gerenciamento de Livros");
        System.out.println("2. Gerenciamento de Usuários");
        System.out.println("3. Sistema de Empréstimos e Devoluções");
        System.out.println("4. Finalizar Execução do Programa");

        System.out.print("Opção Escolhida: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        return choice;
    }
}