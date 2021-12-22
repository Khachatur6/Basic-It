package basic.oop;

public class Dog {
    private int age;

    public Dog() {
    }


    public void getVoice(){
        if (age < 0) {
            System.out.println("notbornyet");
        } else if (age>0 && age<=3) {
            System.out.println("luf luf");
        }else if (age > 3 && age <=6) {
            System.out.println("haf haf");
        }else if (age > 6){
            System.out.println("gaf gaf");
        };
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

}
