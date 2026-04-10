package core_programming.programming_elements.Level1;

public class Volume_Of_Earth {

    public static void main(String[] args) {

        final int radiusOfEarth = 6378;
        final double pi = 3.14;

        double volumeOfSphereInKilometer = (4.0/3.0) * pi * Math.pow(radiusOfEarth,3);

        double volumeOfSphereInMiles = volumeOfSphereInKilometer * 0.621;
        System.out.println("The volume of earth in cubic kilometers is "+volumeOfSphereInKilometer);
        System.out.println("The volume of earth in cubic miles is "+volumeOfSphereInMiles);

    }
}
