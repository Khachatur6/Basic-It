package basic.oop;

public class Dog {
    private int age;

    public Dog() {
    }


    public void getVoice(){
        System.out.println(sayHaf());
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        }else {
            System.out.println("please put positive number");
        }
    }

    private String sayHaf() {
        if (age>0 && age<=3) {
            return "luf luf";
        }else if (age > 3 && age <=6) {
            return "haf haf";
        }else {
            return "gaf gaf";
        }
    }
}
