package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int input=0;

        while (true) {
            input = scanner.nextInt();
            if(input == 0) break;
            list.add(input);
        }
        System.out.println("list.toString() = " + list.toString());
        for (int i = 0; i < list.size()-1; i++) {
            System.out.print(list.get(i)+", ");

        }
        System.out.println(list.get(list.size()-1));
    }
}
