package core_programming.java_methods.Level3;

import java.util.*;

public class otp_generator_uniqueness_checker {

    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    public static boolean isUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otp = new int[10];

        for (int i = 0; i < 10; i++) {
            otp[i] = generateOTP();
        }

        System.out.println(Arrays.toString(otp));
        System.out.println("All Unique: " + isUnique(otp));
    }
}