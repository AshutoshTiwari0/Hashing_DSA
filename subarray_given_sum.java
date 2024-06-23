package Hashing;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.*;
public class subarray_given_sum {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter length of array");
        int n=ob.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.println("enter target sum");
        int target=ob.nextInt();
        //naive consider every sub array
        /*
        for(int i=0;i<n;i++)
        {
            int curr_sum=0;
            for(int j=i;j<n;j++)
            {
                curr_sum=curr_sum+a[j];
                if(curr_sum==target)
                {
                    System.out.println("true");
                    return;
                }

            }
        }
*/
        //optimised-> we find prefix sum
        /*
        check if prefix sum - target sum is present in hashtable
         */
        Set<Integer> nums=new HashSet<>();
        int prefix_Sum=0;
        for(int x:a)
        {
            prefix_Sum=prefix_Sum+x;
            if(target==prefix_Sum)
            {
                System.out.println("true");
                return;
            }
             if(nums.contains(prefix_Sum-target)) {
                System.out.println("true");
                return;
            }
            nums.add(prefix_Sum);
        }
        System.out.println("false");
        
    }
}