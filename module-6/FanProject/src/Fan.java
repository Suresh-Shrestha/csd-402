// Suresh Shrestha
// 4/18/2026
// Module 6.2 Assignment
// Objects and Classes

public class Fan {

    // Four Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST =3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";

    }

    // Argument constructor
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;

    }

    // Getters and Setters
    public int getSpeed() {

        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {

        return on;
    }

    public void setOn(boolean on) {

        this.on = on;
    }
    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public String getColor()
    {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    // toString method
    public String toString() {
        if (on) {
            return "Fan is ON\nSpeed: " + speed +
                    "\nColor: " + color +
                    "\nRadius: " + radius;
        } else {
            return "Fan is OFF\nColor: " + color +
                    "\nRadius: " + radius;
        }
    }

    // Main method for testing
    public static void main(String[] args) {

        // object using default constructor
        Fan fan1 = new Fan();

        // object using argument constructor
        Fan fan2 = new Fan(FAST, true, 10, "blue");

        // Display objects
        System.out.println("Fan 1 Details:");
        System.out.println(fan1);

        System.out.println("\nFan 2 Details:");
        System.out.println(fan2);

        // Test setter methods
        fan1.setOn(true);
        fan1.setSpeed(MEDIUM);
        fan1.setColor("yellow");
        fan1.setRadius(8);

        System.out.println("\nFan 1 After Changes:");
        System.out.println(fan1);
    }
}