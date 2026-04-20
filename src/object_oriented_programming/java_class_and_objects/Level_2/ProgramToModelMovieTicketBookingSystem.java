package object_oriented_programming.java_class_and_objects.Level_2;

class ProgramToModelMovieTicketBookingSystem {

    // Inner class
    static class MovieTicket {
        String movieName;
        int seatNumber;
        double price;
        boolean isBooked = false;

        //Constructor
        MovieTicket(String movieName, double price) {
            this.movieName = movieName;
            this.price = price;
        }

        void bookTicket(int seatNumber) {
            if (!isBooked) {
                this.seatNumber = seatNumber;
                isBooked = true;
                System.out.println("Ticket booked successfully!");
            } else {
                System.out.println("Seat already booked!");
            }
        }

        void displayDetails() {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        }
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Avengers", 250);

        ticket.bookTicket(12);
        ticket.displayDetails();
    }
}