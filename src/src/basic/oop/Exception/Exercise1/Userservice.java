package basic.oop.Exception.Exercise1;

import java.util.Scanner;

public class Userservice  {
    static void creatUser() throws ExerciseException{
      User user = new User();
      user.setAge(89);
      checkAge(user.getAge());
      user.setName("Jack");
      checkName(user.getName());

   }

   public static void checkAge(int age) throws ExerciseException {
      if (age > 90 || age < 0 ) {
         throw new ExerciseException("Exception");
      }
   }
   public static void checkName(String name) throws ExerciseException {
       if (name.startsWith("J") || name.startsWith("V") ) {
          throw new ExerciseException("NameException");
       }
   }
}
