package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        System.out.println("input");
        while (true) {
            String input;
            String mean;
            System.out.print("english : ");
             input = scanner.nextLine();

            if (input.equals("q")) {
                break;
            }
            System.out.print("korean : ");
            mean = scanner.nextLine();

            map.put(input, mean);

        }

        System.out.println("search");
        while (true) {
            String input;
            String mean;
            System.out.print("english : ");
            input = scanner.nextLine();

            if (input.equals("q")) {
                break;
            }

            mean = map.get(input);
            if (mean == null) {
                System.out.println("not found");
                continue;
            }
            System.out.println("mean : "+ mean);

        }

    }


}
