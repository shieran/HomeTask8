import java.util.ArrayList;
import java.util.Scanner;

public class LongOfShortFirst {

    public static void addAndFind(ArrayList<String> strings, Scanner scanner){
        System.out.println("введите 10 строк");
        for (int i = 0; i < 10 ; i++) {
            strings.add(scanner.next());
        }
        System.out.println("строки записаны");

        int indMax = 0;
        int indMin = 0;
        int min = strings.get(0).length();
        int max = strings.get(0).length();

        for (int i = 0; i < strings.size() ; i++) {
            if (strings.get(i).length() < min){
                indMin = i;
                min = strings.get(i).length();
            }
        }

        for (int i = 0; i < strings.size() ; i++) {
            if (strings.get(i).length() > max){
                indMax = i;
                max = strings.get(i).length();
            }
        }

        if (indMax < indMin){
            System.out.println("самая длинная строка встретилась раньше");
        }else if (indMax > indMin){
            System.out.println("самая короткая строка встретилась раньше");
        }

    }
}
