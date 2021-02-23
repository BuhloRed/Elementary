package ua.hilel.hw2;

public interface Elevator {

    int getNumberOfFloors();

    int getMaxWeight();

    int getDistanceBetweenFloors();

    double getSpeed();

    boolean moveToFloor(int floor, int weight);

    double getTime(int floor, double d);
}
