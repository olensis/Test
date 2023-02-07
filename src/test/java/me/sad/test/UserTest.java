package me.sad.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    @DisplayName("When User is created with login and email then there parameters are installed correct")
    public void createUser() {
        String login = "sad";
        String email = "sad@mail.ru";
        User user = new User(login, email);
        Assertions.assertEquals(login, user.getLogin());
        Assertions.assertEquals(email, user.getEmail());
    }

    @Test
    @DisplayName("When Users Constructor is empty , then login and email are null")
    public void createISEmpty() {
        User user = new User();
        Assertions.assertNull(user.getEmail());
        Assertions.assertNull(user.getLogin());
    }

    @Test
    @DisplayName("When email  has not  @ and ' . ' , then email is not correct ")
    public void correctEmailException() {
        String email = "sad@ru";
        String login = "sad";
        Assertions.assertThrows(RuntimeException.class,()-> new User(login,email) );
    }

    @Test
    @DisplayName("When login is not equals email , then parameters are correct")
    public void loginNotEqualsEmail() {
        String login = "sad@ru";
        String email = "sad@ru";
        Assertions.assertThrows(RuntimeException.class,()-> new User(login,email));
    }
}
