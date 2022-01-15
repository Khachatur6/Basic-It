package basic.oop;

public class Cat {
    private int age;

    public Cat() {

    }

    public void getVoice() {
        if (age < 0) {
            System.out.println("notbornyet");
        }else if (age>0 && age<=3) {
            System.out.println("mau mau");
        }else if (age > 3 && age <=6) {
            System.out.println("meow meow");;
        }else if (age > 6){
            System.out.println("geow geow");;
        }
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
}
