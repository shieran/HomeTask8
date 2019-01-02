import java.util.ArrayList;
import java.util.Scanner;


public class Queue {
    public static void addFirst(ArrayList<String> strings, Scanner scanner){
        System.out.println("введите 10 строк");
        for (int i = 0; i < 10 ; i++) {
            strings.add(0, scanner.next());
        }
        System.out.println("строки записаны");

        for (String str: strings) {
            System.out.println(str);
        }
    }
}
