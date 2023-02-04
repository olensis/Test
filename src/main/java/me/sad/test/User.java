package me.sad.test;

public class User {
    private String login;
    private String email;

    public User() {
    }

    public User(String login, String email) {
        if (!login.equals(email)) {
            this.login = login;
        } else {
            throw new RuntimeException();
        }

        if (email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            throw new RuntimeException();
        }


    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
