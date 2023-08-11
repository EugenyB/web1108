package com.example.web1108.beans;

import com.example.web1108.data.User;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Data;

import java.io.Serializable;

@Named
@SessionScoped
@Data
public class UserBean implements Serializable {
    private User user = new User();

    private String message;

    public String hello() {
        if (user.getAge() < 0) {
            message = "Age can't be less 0";
            return "error";
        } else {
            return "hello";
        }
    }

    public String getAdvice() {
        if (user.getAge() < 18) {
            return "Drink Cola";
        } else {
            return "What do you want?";
        }
    }
}
