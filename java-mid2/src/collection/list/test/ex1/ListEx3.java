package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int input=0;
        int total =0;
        int cnt =0;

        while (true) {
            input = scanner.nextInt();
            if(input == 0) break;
            list.add(input);
            total += input;
            cnt++;
        }
        System.out.println("sum : " + total);
        System.out.println("avg : " + (double)total/cnt);



    }
}
