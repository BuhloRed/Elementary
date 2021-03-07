package ua.hilel.hw5;

import java.util.Scanner;

public class stringOperations {

        private String string1;

        public void stringInput() {
                Scanner in = new Scanner(System.in);
                System.out.print("Input string: ");
                string1 = in.nextLine();
        }
        public void evenCounter() {
                int count = 0;
                for (int i = 0; i < string1.length(); i++) {
                        count++;
                }
                System.out.println(count);
        }
        public void middleSymbol() {

        }
}
