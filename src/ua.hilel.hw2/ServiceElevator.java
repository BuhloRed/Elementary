package ua.hilel.hw2;

import java.util.Scanner;

public class ServiceElevator implements Elevator{

    public final int floor;

    public ServiceElevator(int floor) {
        this.floor = floor;
    }

    public void showDataService() {

        System.out.println("Грузовой лифт\n");
        Scanner scf = new Scanner(System.in);
        System.out.println("Введите этаж:");
        int floor = scf.nextInt();

        Scanner scw = new Scanner(System.in);
        System.out.println("Введите вес (кг):");
        int weight = scw.nextInt();

        double d = getDistanceBetweenFloors();

        if (moveToFloor(floor, weight)){
            System.out.println("Время, за которое лифт доедет до этажа: " + getTime(floor, d) + " мин");
        }
    }

    @Override
    public int getNumberOfFloors() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во этажей:");

        return sc.nextInt();
    }

    @Override
    public int getMaxWeight() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите максимальный вес, который сможет поднять лифт (кг):");

        return sc.nextInt();
    }

    @Override
    public int getDistanceBetweenFloors() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите расстояние между этажами:");

        return sc.nextInt();
    }

    @Override
    public double getSpeed() {
        return 11.4;
    }

    @Override
    public boolean moveToFloor(int floor, int weight) {

        int a = getNumberOfFloors();
        int b = getMaxWeight();

        if (a > floor && floor !=1) {
            if (b >= weight) {
                System.out.println("Ехать можно");
                return true;
            }
            else {
                System.out.println("Ехать нельзя");
                return false;
            }
        }
        else if (floor >= -1){
            System.out.println("Ехать можно");
            return false;
        }
        else if (floor > a) {
            System.out.println("Ехать нельзя");
            return false;
        }
        else {
            System.out.println("Ехать нельзя");
            return false;
        }
    }

    @Override
    public double getTime(int floor, double d) {
        double speed = getSpeed();
        double l = d * floor;
        return speed * l;
    }
}
