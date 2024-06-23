package Hashing;
import java.util.*;
public class countdistinctelements {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter length of array");
        int n=ob.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();

        }
        //naive approach
        /*
        int number=0;
        for(int i=0;i<a.length;i++)
        { boolean flag=false;
            for(int j=0;j<i;j++)
            {
                if(a[i]==a[j])
                {
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                number++;
            }
        }
        System.out.println(number);
        */

         //optimised approach-> using a hashset-> TIME O(N) AUX SPACE O(N)
        HashSet<Integer> nums=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            nums.add(a[i]); //now all occurences are removed

        }
        //print size of nums
        System.out.println(nums.size());

    }
}
