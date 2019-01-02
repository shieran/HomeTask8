import java.util.ArrayList;
import java.util.Scanner;

public class Del3 {
    public static void addString(ArrayList<String> strings, Scanner scanner){
        System.out.println("введите 5 слов");
        for (int i = 0; i < 5 ; i++) {
            strings.add(scanner.next());
        }
        System.out.println("слова записаны");

    }

    public static void del3Print(ArrayList<String> strings){
        strings.remove(2);
        for (int i = strings.size() - 1; i >= 0 ; i--) {
            System.out.println(strings.get(i));
        }
    }
}
