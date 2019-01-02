import java.util.Scanner;
import java.util.ArrayList;


public class FixClass {

        public static void addString(ArrayList<String> strings, Scanner scanner){
            System.out.println("введите 5 слов");
            for (int i = 0; i < 5 ; i++) {
                strings.add(scanner.next());
            }
            System.out.println("слова записаны");
        }

        public static void fixMeth(ArrayList<String> strings){
            int iter = 0;
                for (int i = 0; i < strings.size() ; i++) {
                    String str = strings.get(i);
                    if (str.contains("р") && str.contains("п")){
                        continue;
                    }else if (str.contains("р")){
                        strings.add(str);
                    }else if (str.contains("п")){
                        strings.remove(str);
                        i--;
                    }
                    iter++;
                    if (iter == 4){
                        break;
                    }
                }
            for (String str: strings) {
                System.out.println(str);
            }

        }


}
