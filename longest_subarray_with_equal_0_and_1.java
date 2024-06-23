package Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class longest_subarray_with_equal_0_and_1 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter length of array");
        int n=ob.nextInt();
        System.out.println("enter binary array");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        //naive method
        //consider every sub array and for every subarray find if it has equal 0 and 1
      /*  int res=0;
        for(int i=0;i<n;i++)
        {  int c0=0,c1=0;
            for(int j=i;j<n;j++)
            {
               if(a[j]==0)
               {
                   c0++;
               }
               else {
                   c1++;
               }
               if(c0==c1)
               {
                   res=Math.max(res,c0+c1);
               }
            }
        }
        System.out.println(res);
        */

       //optimised
        //replace every 0 with -1. Then find the length of longest subarray with zero sum
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                a[i]=-1;
            }
        }
        HashSet<Integer> nums= new HashSet<>();
        int prefix_sum=0; int c=0;
        for(int i=0;i<a.length;i++)
        {
            prefix_sum=prefix_sum+a[i];
            if(nums.contains(prefix_sum))
            {
                c++;
            }
            if(prefix_sum==0)
            {
               c++;
            }
            else
            {
                nums.add(prefix_sum);
            }
        }
        System.out.println(c);
    }
}
