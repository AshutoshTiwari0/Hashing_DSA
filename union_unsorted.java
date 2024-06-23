package Hashing;
import java.util.*;
public class union_unsorted {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter length of array 1");
        int length1=ob.nextInt();
        int a[]=new int[length1];
        System.out.println("enter length of array 2");
        int length2=ob.nextInt();
        int b[]=new int[length2];
        System.out.println("enter elements in first array");
        for(int i=0;i<length1;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.println("enter elements in second array");
        for(int j=0;j<length2;j++)
        {
            b[j]=ob.nextInt();
        }
        /*
        problem statement -> we have two unsorted arrays
        merge them
        remove duplicates(put them in a set)
        print total no of elements
         */
            /*
            Naive approach
            make a distinct array
            traverse through all elements of array a
            if it is not in distinct then put it in distinct.
            same for array b.Traverse through each element of arrya b and check whether it is present in temp. If not put it in temp.
            print size of temp
             */
        //OPTIMISED SOLUTION
        /*
        Create a hashset and put all elements of a and b in it . Now return its size.
         */
        HashSet<Integer> nums=new HashSet<>();
        for(int i=0;i<length1;i++)
        {
            nums.add(a[i]);
        }
        for(int j=0;j<length2;j++)
        {
            nums.add(b[j]);
        }
        System.out.println(nums.size());
    }
}
