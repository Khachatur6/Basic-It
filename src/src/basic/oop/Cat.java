package basic.oop;

public class Cat {
    private int age;

    public Cat() {

    }

    public void getVoice() {
        System.out.println(sayMeow());
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        }else {
            System.out.println("please put positive number");
        }
    }
    private String sayMeow() {
        if (age>0 && age<=3) {
            return "mau mau";
        }else if (age > 3 && age <=6) {
            return "meow meow";
        }else {
            return "geow geow";
        }
    }
}
