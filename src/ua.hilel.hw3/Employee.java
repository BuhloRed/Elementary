package ua.hilel.hw3;

public class Employee {

    private static int USER_ID = 1;

    private final int id;
    private final String firstName;
    private final String secondName;
    private final double salary;

//    Never used, but should
//    public Employee (String firstName, String secondName){
//        this.firstName = firstName;
//        this.secondName = secondName;
//    }

    public Employee(String firstName, String secondName, double salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
        this.id = USER_ID;
        USER_ID++;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Name:" + firstName + ", Second Name: " + secondName + ", salary: " + salary + " UAH";
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public double getSalary() {
        return salary;
    }
}
