package Hashing;
import java.util.*;
public class intersection {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter length of array 1");
        int n=ob.nextInt();
        int a[]=new int[n];
        System.out.println("enter array 1");
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.println("enter length of array 2");
        int n2=ob.nextInt();
        int b[]=new int[n2];
        System.out.println("enter array 2");
        for(int i=0;i<n2;i++)
        {
            b[i]=ob.nextInt();
        }
        /*task-> we are given two arrays
        a[]=[10,15,20,25,30,50]
        b[]=[30,5,15,80]
        output-> 15 30
        a[]=[10,20]
        b[]=[20,30]
        output-> 20
         */
        //arrays are unsorted
       //naive
        /*
        for(int i=0;i<a.length;i++) {
           boolean flag=false;
            for (int j = 0; j < b.length; j++) {

                if (a[i] == b[j]) {
                    flag = true;
                    break;

                }
            }
                if(flag==true)
                {
                    System.out.println(a[i]);
                }
            }
        */
        //optimised solution
        /*put the elements of second array in a hash set.
        traverse through array a and check if that element is present in hash table then print it otherwise skip it.
         */
        HashSet<Integer> nums=new HashSet<>();
        //adding b ele,ents in a hashset
        for(int i=0;i<b.length;i++)
        {
            nums.add(b[i]);
        }
        //if elements of a are present in b printing them
        for(int i=0;i<a.length;i++)
        {
            if(nums.contains(a[i]))
            {
                System.out.print(a[i]+" ");
            }
        }





        }
    }

