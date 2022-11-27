package com.yaroslav.classes;

public class User {

    private final String login;
    private final String password;

    private final String publicPassword;

    public User(String login, String password) {
        this.login = login;
        this.password = password;

        String securePassword = "";
        for (int i = 0; i < password.length(); i++) {
            securePassword += "*";
        }

        publicPassword = securePassword;
    }


    public String getPassword() {
        return publicPassword;
    }

    public String getLogin() {
        return login;
    }
}
