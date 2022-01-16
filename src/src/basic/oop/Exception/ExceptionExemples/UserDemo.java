package basic.oop.Exception.ExceptionExemples;

import basic.oop.Exception.ExceptionExemples.MyException;
import basic.oop.Exception.ExceptionExemples.User;

public class UserDemo {
    public static void main(String[] args) throws MyException {
        User user = new User();
        user.setAge(-5);
        //try {
        //    checkAge(user.getAge());
        //}catch (RuntimeException e ) {
//
        //}catch (MyException e) {
        //    System.out.println("age can not be negative");
        //}
        //checkAge(user.getAge());
        test(user);
        System.out.println(user.getAge());
    }


    private static void test(User user)  {
        try {
            checkAge(user.getAge());
        }catch (MyException e) {


        }
    }
    private static void checkAge(int age) throws MyException {
        if (age <= 0) {
            throw  new MyException("Age cannot be negative");
        }
     }
}//unenq user ete useris tariqy poqra 12 ic prosty shprtumen enq accses denied
