// Suresh Shrestha
// 5/15/2026
// Module-10.2 Assignment

public abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    // Constructor
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method
    public abstract void display();
}