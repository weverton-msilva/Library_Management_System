package src.service;

import src.model.UserModel;
import src.repository.SavedData;
import java.util.Scanner;
import java.util.List;

public class UserServices {
    private final SavedData savedData;

    public UserServices(SavedData savedData) {
        this.savedData = savedData;
    }

    // Método sem argumentos que interage com o usuário para criar o UserModel
    public void registerUsers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do usuário: ");
        String name = scanner.nextLine();

        UserModel userModel = new UserModel();
        userModel.setName(name);

        savedData.addBook(userModel); // Ou savedData.addUser(userModel) se já tiver criado o método
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public List<UserModel> modelList() {
        return savedData.getBookModels();
    }
}