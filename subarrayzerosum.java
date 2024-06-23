package Hashing;
import java.sql.SQLOutput;
import java.util.*;
public class subarrayzerosum {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter length of array");
        int n=ob.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        /* Task is to find a sub array which has sum as zero*/
        //naive
        /*
        for(int i=0;i<n;i++)
        {
            int curr_sum=0;
            for(int j=i;j<n;j++)
            {
               curr_sum=curr_sum+a[j];
               if(curr_sum==0)
               {
                   System.out.println("present");
                   return;
               }
               else
               {
                   System.out.println("not present");
                   return;
               }
            }

        }
        */

         //idea is to use prefix sum along with hashing
        /*
        we find the prefix sum and put it in hashtable
        if we encounter a prefix sum which is already present in hashtable we return true

         */
        //create a hashtable
        HashSet<Integer> nums= new HashSet<>();
        int prefix_sum=0;
        for(int i=0;i<a.length;i++)
        {
            prefix_sum=prefix_sum+a[i];
            if(nums.contains(prefix_sum))
            {
                System.out.println("true");
                return;
            }
            if(prefix_sum==0)
            {
                System.out.println("true");
                return;
            }
            else
            {
                nums.add(prefix_sum);
            }
        }
        System.out.println("false");

    }
}
