package src;

import src.service.BookLoans;
import src.views.MenuView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookLoans bookLoans = new BookLoans();

        MenuView menuView = new MenuView(bookLoans, scanner);
        menuView.showMenu();

        scanner.close();
    }
}