import java.util.ArrayList;

public class AddExactly {
    public static void addExactly(ArrayList<String> strings){
        int num = strings.size();
        int k = 0;
        for (int i = 0; i < num; i++) {
            strings.add(k+1, "именно");
            k += 2;
        }

        for (String str: strings) {
            System.out.println(str);
        }
    }
}
