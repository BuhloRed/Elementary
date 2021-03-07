package ua.hilel.hw5;

public class Calculator {

    public int plus(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        return sum;
    }
    public double multiply(double a, double b) {
        return (a * b);
    }
}
