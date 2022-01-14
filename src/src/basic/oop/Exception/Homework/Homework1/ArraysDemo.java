package basic.oop.Exception.Homework.Homework1;

public class ArraysDemo {
    public static void main(String[] args) throws MyBadException {
        Arrays arrays = new Arrays();
        arrays.setInts();
        chechkints(arrays.getInts());

    }

    public static void chechkints(int[] ints) throws MyBadException {
        for (int i = 0; i < ints.length; i++ ) {
            if (ints[i] % 2 != 0) {
                throw new MyBadException("BadArrayException");
            }
        }
    }
}
