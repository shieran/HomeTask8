import java.util.LinkedList;
import java.util.Scanner;

public class DelAndAddFirst {
    public static void delAndAdd(LinkedList<String> strings, Scanner scanner){
        System.out.println("введите 10 строк");
        for (int i = 0; i < 10; i++) {
            strings.add(scanner.next());
        }
        System.out.println("строки записаны");
    }
    public static void changeLastToFirst(LinkedList<String> strings){
        String str;
        for (int i = 0; i < 13 ; i++) {
            str = strings.getLast();
            strings.removeLast();
            strings.addFirst(str);
        }
        for (String string: strings) {
            System.out.println(string);
        }
    }
}


