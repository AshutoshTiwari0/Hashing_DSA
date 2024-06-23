package Hashing;
import java.util.*;
public class longestsubarraywithsamesum {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter length of array 1");
        int n1=ob.nextInt();
        System.out.println("enter binary array 1");
        int a[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.println("enter length of array 2");
        int n2=ob.nextInt();
        System.out.println("enter binary array 2");
        int b[]=new int[n2];
        for(int i=0;i<n2;i++)
        {
            b[i]=ob.nextInt();
        }
        //naive solution
        /*
        int res=0;
        for(int i=0;i<n1;i++) {
            int sum1 = 0, sum2 = 0;
            for (int j = i; j < n2; j++) {
                sum1 = a[j] + sum1;
                sum2 = sum2 + b[j];
                if (sum1 == sum2) {
                    res = Math.max(res, j - i + 1);
                }

            }
        }
            System.out.println(res);

*/
        //optimised solution
        int diff[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            diff[i]=a[i]-b[i];
        }
        //now find the length of longest subarray with sum as zero in temp
        Set<Integer> nums=new HashSet<>();
        int prefix_Sum=0;
        int target=0;
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

