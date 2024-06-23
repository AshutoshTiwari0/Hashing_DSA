package Hashing;
import java.util.*;
public class count_distinct_in_every_window_of_size_k {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter length of array");
        int n = ob.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ob.nextInt();
        }
        System.out.println("enter length of k");
        int k = ob.nextInt();
        /*
        task-> find number of unique elements in every window of size K
        [10,20,20,10,30,40,10] k=4
        first window->[10,20,20,10] -> number of unique elements->2.
        second window->[20,20,10,30]-> number of unique elements->3.
        third window->[20,10,30,40]-> number of unique elements->4.
        fourth window->[10,30,40,10]-> number of unique elements->3.
             output-> 2 3 4 3
             */
//naive solution
     /*   for (int i = 0; i <= n - k; i++) {
            int count = 0;
            for (int j = 0; j < k; j++) {
                boolean flag = false;
                for (int p = 0; p < j; p++) {
                    if (a[i + j] == a[i + p]) {
                        flag = true;
                        break;

                    }
                }
                if (flag == false) {
                    count++;
                }
            }


        System.out.println("frequency of " + a[i] + "is " + count);
    }
    */

        //optimised
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < k; i++) {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        }

        System.out.print(m.size() + " ");

        for (int i = k; i < n; i++) {

            m.put(arr[i - k], m.get(arr[i - k]) - 1);

            if (m.get(arr[i - k]) == 0) {
                m.remove(arr[i - k]);
            }
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);

            System.out.print(m.size() + " ");
        }
    }
}

