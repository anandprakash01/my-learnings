package A_PracticeCode;

// import java.lang.reflect.Array;
import java.util.*;
//import java.util.HashMap;
//import java.util.Scanner;

public class anand10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int arr[]=new int[n];

        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (!hm.containsKey(x)) {
                hm.put(x, 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            System.out.print(e.getKey() + " ");
            list.add(e.getKey());
        }
        System.out.println();

        int maxOdd = Integer.MIN_VALUE;
        int secondOddMax = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) {
                if (list.get(i) > maxOdd) {
                    secondOddMax = maxOdd;
                    maxOdd = list.get(i);
                } else if (list.get(i) > secondOddMax) {
                    secondOddMax = list.get(i);
                }
            }
        }
        System.out.println(secondOddMax);
    }
}
