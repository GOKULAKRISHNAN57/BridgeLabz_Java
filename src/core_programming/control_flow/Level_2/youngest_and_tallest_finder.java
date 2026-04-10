package core_programming.control_flow.Level_2;

import java.util.Scanner;

class youngest_and_tallest_finder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ageAmar = input.nextInt();
        int ageAkbar = input.nextInt();
        int ageAnthony = input.nextInt();

        double heightAmar = input.nextDouble();
        double heightAkbar = input.nextDouble();
        double heightAnthony = input.nextDouble();

        String youngest;
        String tallest;

        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            youngest = "Amar";
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            tallest = "Amar";
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        System.out.println(youngest);
        System.out.println(tallest);

        input.close();
    }
}