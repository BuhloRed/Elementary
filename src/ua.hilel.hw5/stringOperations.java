package ua.hilel.hw5;

import java.util.Scanner;

public class stringOperations {

        private String string1;
        private boolean evenCheck;

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
                if (count % 2==0)
                        evenCheck = true;
                else
                        evenCheck = false;
                System.out.println(evenCheck);
        }
        public void middleSymbol() {

        }
}
