package src.repository;

import src.model.LoanModel;
import src.model.UserModel;

import java.util.ArrayList;
import java.util.List;

public class SavedData {
    // Listas privadas para proteger os dados
    private final List<UserModel> bookModels = new ArrayList<UserModel>();
    private final List<LoanModel> loanModels = new ArrayList<>();
    private final List<UserModel> userModels = new ArrayList<>();

    // Métodos de acesso e manipulação
    public List<UserModel> getBookModels() {
        return bookModels;
    }

    public void addBook(UserModel book) {
        this.bookModels.add(book);
    }

    public List<UserModel> getUserModels() {
        return userModels;
    }

    public void addUser(UserModel user) {
        this.userModels.add(user);
    }

    public List<LoanModel> getLoanModels() {
        return loanModels;
    }

    public void addLoan(LoanModel loan) {
        this.loanModels.add(loan);
    }
}