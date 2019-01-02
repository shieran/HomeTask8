import java.util.ArrayList;
import java.util.Scanner;

public class Length {

    public static void addString(ArrayList<String> strings, Scanner scanner){
        System.out.println("введите 10 слов");
        for (int i = 0; i < 10 ; i++) {
            strings.add(scanner.next());
        }
        System.out.println("слова записаны");
    }

    public static void checkLength(ArrayList<String> strings){
        for (int i = 0; i < strings.size() - 1; i++) {
            if (strings.get(i + 1).length() < strings.get(i).length()){
                System.out.println("список не упорядочен по возрастанию длины строки элементов, индекс первого элемента, нарушающего порядок: " + strings.indexOf(strings.get(i + 1)));
                break;
            }
        }
    }
}
