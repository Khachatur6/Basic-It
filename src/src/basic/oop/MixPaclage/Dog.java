package basic.oop.MixPaclage;

public class Dog {
    private int age;
    private String voice;

    public Dog() {
    }
    public void getVoice(){
        if (age < 0) {
            System.out.println("notbornyet");
        } else if (age>0 && age<=3) {
            voice = "luf luf";
        }else if (age > 3 && age <=6) {
           voice = "haf haf";
        }else if (age > 6){
            voice = "gaf gaf";
        }
    }

    public int getAge(){
        return age;
    }

    public String getvoice() {
        return voice;
    }

    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        }else {
            System.out.println("please put positive number");
        }
    }

}
