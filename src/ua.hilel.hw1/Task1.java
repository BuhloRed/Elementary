package ua.hilel.hw1;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Цикл for");
        for (int i = 30; i >= 0; i--) {
            if (i % 3 != 0)
                System.out.print(i + " ");
        }

        int j = 30;
        System.out.println("\nЦикл do-while");
        do {
            if (j % 3 != 0)
                System.out.print(j + " ");
            j--;
        }
        while (j >= 0);

        int k = 30;
        System.out.println("\nЦикл while");
        while (k >= 0) {
            if (k % 3 != 0)
                System.out.print(k + " ");
            k--;
        }
    }
}
