import exception.WrongLoginException;
import exception.WrongPasswordException;

import static service.AuthorizationService.valid;

public class Main {
    public static void main(String[] args) {
        try {
            valid("koldun1997", "abrakadabra", "abrakadabra");
            System.out.println("Успешная регистрация!");
        } catch (WrongLoginException | WrongPasswordException i) {
            System.out.println(i.getMessage());
        }
    }
}