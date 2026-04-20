package object_oriented_programming.java_class_and_objects.Level_1;

public class Program_to_Compute_Area_of_Circle {

    //Circle Class
     static class Circle{

        double radius;

        //Constructor
        Circle(double radius){
            this.radius = radius;
            System.out.println("wow");
        }

        //Circumference And Area Calculation Method
        void circumferenceAndArea(){
            System.out.print("Circumference of circle = ");
            double circumference = 3.14 * (radius * radius);
            System.out.print(circumference);

            System.out.print("\n Area of circle = ");
            double area = 2 * 3.14 * radius;
            System.out.print(area);
        }

    }
    public static void main(String[] args) {

         //Object Creation
        Circle circle = new Circle(14);

        circle.circumferenceAndArea();

    }
}
