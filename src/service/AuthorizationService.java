package service;

import exception.WrongLoginException;
import exception.WrongPasswordException;

public class AuthorizationService {
    public static boolean valid(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches("[a-zA-Z0-9_]{5,20}+")) {
            throw new WrongLoginException("Логин не соответствует требованиям!");
        }
        if (!password.matches("[a-zA-Z0-9_]{5,20}+")) {
            throw new WrongPasswordException("Пароль не соответствует требованиям!");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль не совпадает!");
        }
        return true;
    }

}
