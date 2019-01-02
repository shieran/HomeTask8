import java.util.ArrayList;
import java.util.Scanner;

public class Echo {

    public static void addString(ArrayList<String> strings, Scanner scanner){
        System.out.println("введите 10 слов");
        for (int i = 0; i < 10 ; i++) {
            strings.add(scanner.next());
        }
        System.out.println("слова записаны");
    }

    public static void echoMeth(ArrayList<String> strings){
        int iter = strings.size();
        for (int i = 0; i < iter ; i++) {
            strings.add(strings.get(i));
        }
        for (String str: strings) {
            System.out.println(str);
        }
    }
}
