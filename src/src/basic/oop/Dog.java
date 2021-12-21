package basic.oop;

public class Dog {
    private String voice;
    private int age;

    public Dog(String voice, int age) {
        this.voice = voice;
        this.age = age;
    }

    public char sayHaf() {
        if (age>=1 && age<=3) {
            System.out.println("luf luf");
        }else if (age > 3 && age <=6) {
            System.out.println("haf haf");
        }else if (age > 6) {
            System.out.println("gaf gaf");
        }
        return 0;
    }
    public int getAge(){
        return age;
    }
    public void setAge() {
        String age;
    }


}
