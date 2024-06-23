package Hashing;
import java.lang.annotation.IncompleteAnnotationException;
import java.util.*;
public class more_than_n_by_k {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter length of array");
        int n=ob.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.println("enter value of k");
        int k=ob.nextInt();
        /*
        task-> print elements which occur more than n/k time
         */
        // sort then linearly find the number of occurences
        /*Arrays.sort(a);
        int i=1,count=1;
        while(i<n)
        {
            while(a[i-1]==a[i] && i<n) {
                count++;
                i++;
            }
                if(count>n/k)
                {
                    System.out.println(a[i-1]);
                }
                count=1;
                i++;
        }
    }
    */
         //optimised -> make a map with element as key and frequency as value. return key with value more than n/k
        HashMap<Integer,Integer> m= new HashMap<>();
        for(int i:a)
        {
            m.put(i,m.getOrDefault(i,0)+1);

        }
        //traverse through the hashmap
        for(Map.Entry<Integer,Integer> e:m.entrySet())
        {
            if(e.getValue()>(n/k))
            {
                System.out.println(e.getKey()+" ");
            }
        }

}
}