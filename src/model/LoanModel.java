package src.model;

import java.time.LocalDate;

public class LoanModel {
    private Long id;
    private BookModel book;       // O livro associado ao empréstimo
    private String userName;      // Ou uma classe UserModel, se houver
    private LocalDate loanDate;   // Data em que foi feito o empréstimo
    private LocalDate dueDate;    // Data prevista de devolução
    private LocalDate returnDate; // Data real em que foi devolvido (null se ainda estiver ativo)
    private boolean active;       // Status do empréstimo (ativo ou finalizado)

    public LoanModel() {}
    public LoanModel(Long id, BookModel book, String userName, LocalDate loanDate, LocalDate dueDate) {
        this.id = id;
        this.book = book;
        this.userName = userName;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.active = true;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public BookModel getBook() { return book; }
    public void setBook(BookModel book) { this.book = book; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public LocalDate getLoanDate() { return loanDate; }
    public void setLoanDate(LocalDate loanDate) { this.loanDate = loanDate; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    public LocalDate getReturnDate() { return returnDate; }
    public void setReturnDate(LocalDate returnDate) { this.returnDate = returnDate; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}