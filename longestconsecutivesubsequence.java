package Hashing;
import java.util.*;
public class longestconsecutivesubsequence {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter length of array");
        int n=ob.nextInt();
        System.out.println("enter array");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        //naive -> by sorting-> all consective elemnets will come togehter
        /*Arrays.sort(a);
        int c=1; int res=1;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]+1==a[i+1])
            {
                c++;
            }
            else
            {
                res=Math.max(res,c);
                c=1;
            }
        }
        System.out.println(Math.max(c,res));
*/
        //optimised
        HashSet<Integer> nums=new HashSet<>();
        for(int i:a)
        {
            nums.add(i);
        }
        int res=1;
        for(Integer x:nums)
        {
            if(nums.contains(x-1)==false)
            {
                int curr=1;
                while(nums.contains(x+curr))
                {
                    curr++;
                }
                res=Math.max(res,curr);
            }
        }
        System.out.println(res);
    }
}
