package encap;

public class User {
    private String name;

    private int age;

    private int dayOfBirth;

    private int monthOfBirth;

    private int yearOfBirth;


    public int getAge() {
        return age;
    }


    public void setAge(int age) {

        boolean isPositive = check(age);

        if (isPositive) {
            this.age = age;
        } else {
            System.out.println("access denied");
        }
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        boolean isPositive = check(dayOfBirth);

    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    private boolean check(int value) {
        if (value<=0) {
            return false;
        }
        return true;
    }
}
