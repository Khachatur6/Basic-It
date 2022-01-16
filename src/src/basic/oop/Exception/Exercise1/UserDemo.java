package basic.oop.Exception.Exercise1;

import users.User1;

import java.util.Scanner;

public class UserDemo {
    public static void main(String[] args) throws ExerciseException {
        User[] users = new User[3];

        for (int i = 0; i < users.length; i++) {
            Userservice.creatUser();
        }


    }
}
