/*
package Hashing;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class longest_subarray_with_given_sum {
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
        System.out.println("enter target sum");
        int target=ob.nextInt();
        /*task->
        find the length of the longest subarray which has the given sum
        1) [5,8,-4,-4,9,-2,2]
        target=0
        output->3 [[8,-4,-4] or [-2,2]]*/
        /* NAIVE
         int res=0;
        for(int i=0;i<n;i++)
        { int curr=0;
            for(int j=i+1;j<n;j++)
            {
                curr=curr+a[j];

                if(curr==target)
                {

                   res=Math.max(res,j-i+1);

                }

            }
        }
        System.out.println(res);

        //OPTIMISED
        HahsMap<Integer,Integer> nu=new HashMap<>();
        int pre_sum=0,res=0;
        for(int i=0;i<n;i++)
        {
            pre_sum+=a[i];
            if(pre_sum==target)
            {
                res=i+1;
            }
            if(!nu.containsKey(pre_sum))
            {
                nu.put(pre_sum,i);
            }
            if(nu.containsKey(pre_sum-target))
            {
                res=Math.max(res,i-nu.get(pre_sum-target));
            }
        }
        System.out.println(res);
    }
}
*/