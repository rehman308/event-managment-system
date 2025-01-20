package ooplabproject;

//class to allocate seats for the event
public class Seats {
    //private class variables
//    private static int id=1;
    private int booked,
            remaining,
            total;

    //default constructor
    public Seats() {
    }


    //parameterized constructor
    public Seats(int booked, int total) {
        this.booked = booked;
        this.total = total;
    }


    //getters and setters
    public int getRemaining() {
        return this.total - this.booked;
    }

    public void setBooked(int booked) {
        this.booked = booked;
    }

    public int getBooked() {
        return booked;
    }

//    public String getId() {
//        return id;
//    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    //returns the total remaining seats
    public int count() {
        return this.getRemaining();
    }
}

