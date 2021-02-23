package ua.hilel.hw1;

public class Task2 {
    public static void main(String[] args) {

        int a = 5;
        int b = 11;
        int random_number = a + (int) (Math.random() * b);
        System.out.println(random_number);

        int[] Array1 = new int[random_number];
        int[] Array2 = new int[random_number];

        for (int i = 0; i < Array1.length; i++) {
            for (int j = 0; j < Array2.length; j++) {
                int r = (int) (Math.random() * 100);
                if (r % 2 == 0)
                    Array1[i] = r;
                else
                    Array2[j] = r;
            }
        }

        System.out.println("Четные:");
        for (int k : Array1) {
            System.out.print(k + " ");
        }

        boolean sorted1 = false;
        int temp1;

        while (!sorted1) {
            sorted1 = true;
            for (int i = 0; i < Array1.length - 1; i++) {
                if (Array1[i] > Array1[i + 1]) {
                    temp1 = Array1[i];
                    Array1[i] = Array1[i + 1];
                    Array1[i + 1] = temp1;
                    sorted1 = false;
                }
            }
        }

        int min1 = Array1[0];
        int max1 = Array1[Array1.length - 1];
        System.out.println("\nMax:" + max1);
        System.out.println("Min:" + min1);

        System.out.println("Нечетные:");

        for (int k : Array2) {
            System.out.print(k + " ");
        }

        boolean sorted2 = false;
        int temp2;

        while (!sorted2) {
            sorted2 = true;
            for (int j = 0; j < Array2.length - 1; j++) {
                if (Array2[j] > Array2[j + 1]) {
                    temp2 = Array2[j];
                    Array2[j] = Array2[j + 1];
                    Array2[j + 1] = temp2;
                    sorted2 = false;
                }
            }
        }

        int min2 = Array2[0];
        int max2 = Array2[Array2.length - 1];
        System.out.println("\nMax:" + max2);
        System.out.println("Min:" + min2);
    }
}
