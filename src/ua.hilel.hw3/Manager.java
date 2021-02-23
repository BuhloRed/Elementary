package ua.hilel.hw3;

import java.util.Arrays;

public class Manager extends Employee {

    private final int[] subordinates;

    public Manager(String firstName, String secondName, double salary, int[] subordinates) {
        super(firstName, secondName, salary);
        this.subordinates = subordinates;
    }

    @Override
    public String toString() {
        return "Id: " + getId() + ", Name:" + getFirstName() + ", Second Name: " + getSecondName() + ", salary: " +
                +getSalary() + " UAH" + ", Subordinates id:" + Arrays.toString(subordinates);
    }
}
