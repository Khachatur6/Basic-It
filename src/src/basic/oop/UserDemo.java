package basic.oop;

import java.util.Arrays;

import static basic.oop.User.bubble;

public class UserDemo {
    public static void main(String[] args) {
        int[] ints = {16, 10, 8, 25, 6, 1};
        System.out.println(Arrays.toString(ints));

        bubble(ints);

        System.out.println(Arrays.toString(ints));
        }


    static void bubble(int[] ints) {

        for (int j = 0; j < ints.length; j++) {
            for (int i = 0; i < ints.length; i++){
                if (i + 1 == ints.length) {
                    break;
                }

                if (ints[i] > ints[i+1]){
                    int x = ints[i];
                    ints[i] = ints[i+1];
                    ints[i+1] = x;
                }

            }

        }



    }

    }

