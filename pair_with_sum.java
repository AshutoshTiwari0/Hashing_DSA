package Hashing;


import java.util.*;
import java.util.Scanner;

public class pair_with_sum {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter length of array");
        int n=ob.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.println("enter value of target sum");
        int target=ob.nextInt();
        /*
        Problem Statement
        arr[]=[3,2,8,15,-8]
        target=17
        output->true (2,15)

         */
        // naive
        /*
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]+a[j]==target)
                {
                    System.out.println("true");

                }
            }
        }

         */
        //optimised solution
        HashSet<Integer> nums=new HashSet<>();
        for(int g:a)
        {
            if(nums.contains(target-g)==true)
            {
                System.out.println("true");
            }
            else
            {
                nums.add(g);
            }
        }
    }
}
