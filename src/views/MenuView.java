package src.views;

import src.service.BookLoans;

import java.util.Scanner;

public class MenuView {
    private final BookLoans bookLoans;
    private final Scanner scanner;

    public MenuView(BookLoans bookLoans, Scanner scanner) {
        this.bookLoans = bookLoans;
        this.scanner = scanner;
    }

    // Loop para execução do programa até sua finalização
    public void showMenu() {
        while (true) {
            int choice = displayOptions();

            switch (choice) {
                // case 1 -> BookService.;
                // case 2 -> UserServices.;
                // case 3 -> BookLoans.;
                case 4 -> {
                    System.out.println("Obrigado por usar o nosso sistema! ✌️");
                    break;
                }
                default -> {
                    System.out.println("🤖 Ops, comando não reconhecido!");
                    System.out.println("Essa opção não consta no meu sistema. Que tal tentar de novo?\n");
                }
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
