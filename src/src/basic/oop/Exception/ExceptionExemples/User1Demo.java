package basic.oop.Exception.ExceptionExemples;

import basic.oop.Exception.ExceptionExemples.MyException2;
import basic.oop.Exception.ExceptionExemples.User;

public class User1Demo {
    public static void main(String[] args) throws MyException2 {
        User user = new User();
        user.setAge(10);
        checkAge(user.getAge());
    }

    public static void checkAge(int age) throws MyException2 {
        if (age < 12) {
            throw new MyException2("access denied");
        }
    }
}
