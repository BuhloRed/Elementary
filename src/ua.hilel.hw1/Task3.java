package ua.hilel.hw1;

public class Task3 {
    public static void main(String[] args) {
        showString();
    }

    static void showString() {
        String[] str = new String[]{"Winter", "Spring", "Summer", "Autumn"};

        String result = String.join("|", str);
        System.out.println(result);
    }
}
