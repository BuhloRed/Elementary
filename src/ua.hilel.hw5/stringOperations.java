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
//        public void evenCounter() {
//                int count = 0;
//                for (int i = 0; i < string1.length(); i++) {
//                        count++;
//                }
//                evenCheck = count % 2 == 0;
//                System.out.println(count);
//                System.out.println(evenCheck);
//        }
        public void middleSymbol() {
                String ms;
                if (string1.length() % 2 == 0){
                        ms = string1.substring(string1.length()/2 - 1, string1.length()/2+1);
                }
                else {
                        ms = string1.substring(string1.length()/2, string1.length()/2+1);
                }
                System.out.println(ms);
        }
}
