package basic.oop;

public class Dog {
    private int age;

    public Dog(int age) {
    }

    private void sayHaf(int age) {
        if (age>=1 && age<3) {
            System.out.println("luf luf");
        }else if (age >= 3 && age <6) {
            System.out.println("haf haf");
        }else if (age >= 6) {
            System.out.println("gaf gaf");
        }
    }
    public int getAge(){
        return age;
    }
    public void setAge() {
        String age;
    }
    public String getVoice() {
        sayHaf(age);
    }
}
