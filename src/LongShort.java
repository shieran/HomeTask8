import java.util.ArrayList;
import java.util.Scanner;

public class LongShort {


    public static void addString(ArrayList<String> strings, Scanner scanner){
        System.out.println("введите 5 строк");
        for (int i = 0; i < 5 ; i++) {
            strings.add(scanner.next());
        }
        System.out.println("строки записаны");
    }

    public static void findShortLong(ArrayList<String> strings){
        int max = 0;
        int min = strings.get(0).length();
        for (int i = 0; i < strings.size() ; i++) {
            if (strings.get(i).length() >= max){
                max = strings.get(i).length();
            }
            if (strings.get(i).length() <= min){
                min = strings.get(i).length();
            }
        }
        System.out.println("Самые длинные строки");
        for (String str: strings){
            if (str.length() == max){
                System.out.println(str);
            }
        }
        System.out.println("Самые короткие строки");
        for (String str: strings){
            if (str.length() == min){
                System.out.println(str);
            }
        }



    }
}
