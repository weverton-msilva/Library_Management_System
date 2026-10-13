package src.model;

import java.time.LocalDate;

public class UserModel {
    private Long id;
    private String name;
    private String email;
    private String cpf; // Ou outro documento de identificação
    private String phone;
    private LocalDate registrationDate; // Data de cadastro
    private boolean active; // Se a conta está ativa ou suspensa

    public UserModel() {}
    public UserModel(Long id, String name, String email, String cpf, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.phone = phone;
        this.registrationDate = LocalDate.now();
        this.active = true;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public LocalDate getRegistrationDate() { return registrationDate; }
    public void setRegistrationDate(LocalDate registrationDate) { this.registrationDate = registrationDate; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}
