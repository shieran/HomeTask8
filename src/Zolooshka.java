import java.util.ArrayList;
import java.util.Scanner;

public class Zolooshka {
    static ArrayList<Integer> del2 = new ArrayList<>();
    static ArrayList<Integer> del3 = new ArrayList<>();
    static ArrayList<Integer> otherDel = new ArrayList<>();

    public static void sortNumbers(){
        System.out.println("введите 20 чисел");
        int number;
        for (int i = 0; i < 20; i++) {
            number = getNumber();
            if (number % 2 == 0) {
                del2.add(number);
            }
            if (number % 3 == 0) {
                del3.add(number);
            }
            if (number % 2 != 0 && number % 3 != 0){
                otherDel.add(number);
            }
        }
        System.out.println("числа, которые делятся на 2");
        printList(del2);
        System.out.println("числа, которые делятся на 3");
        printList(del3);
        System.out.println("числа, которые не делятся на 2 или 3");
        printList(otherDel);
    }

    public static int getNumber() {

        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.println("это не число");
                scanner.next();
            }
            number = scanner.nextInt();
            break;
        }
        return number;
    }

    public static void printList(ArrayList<Integer> integers){
        for (Integer i: integers) {
            System.out.println(i);
        }
    }
}
