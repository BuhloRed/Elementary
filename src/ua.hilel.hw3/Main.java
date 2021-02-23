package ua.hilel.hw3;

public class Main {

    public static Employee[] emps;
    public static int[] sub1 = new int[]{3, 4};
    public static int[] sub2 = new int[]{5};

    public static void main(String[] args) {

        Manager mng1 = new Manager("Petro", "Poroshenko", 100, sub1);
        Manager mng2 = new Manager("Dmytro", "Turchinov", 75, sub2);
        System.out.println(mng1);
        System.out.println(mng2);

        Employee emp1 = new Employee("Vitaliy", "Klichko", 30);
        Employee emp2 = new Employee("Genadiy", "Kernes", 20);
        Employee emp3 = new Employee("Boris", "Filatov", 10);

        emps = new Employee[]{emp1, emp2, emp3};
        for (Employee emp : emps) {
            System.out.println(emp);
        }
    }
}
