package core_programming.programming_elements.Level1;

public class Kilometers_to_Meters_1 {
    public static void main(String[] args) {
        //Create a program to convert the distance of 10.8 kilometers to miles.
        //Hint: 1 km = 1.6 miles
        //I/P => NONE
        //O/P => The distance  ___ km in miles is ___

        final double distanceInKilometers = 10.8;
        double distanceInMiles = distanceInKilometers / 1.6;

        System.out.println("The distance  "+ distanceInKilometers +" km in miles is "+distanceInMiles);

    }
}
