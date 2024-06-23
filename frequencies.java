package Hashing;
import java.util.*;
/*
TASK-> COUNT FREQUENCY OF EVERY ELEMENT IN ARRAY
 */
public class frequencies {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter length of array");
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements in array");
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        //Naive
        /*
        for(int i=0;i<arr.length;i++)
        { boolean flag=false;
            for(int j=0;j<i;j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
                if (flag == true) {
                    continue;
                }
            }
                int freq=1;
                for(int j=i+1;j<n;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        freq++;
                    }
            }
            System.out.println("frequency of "+arr[i]+" is "+freq);
        }
*/
        //linear time solution by using hashmap
        HashMap<Integer,Integer> nums= new HashMap<>();
        //Traverse through each element
        for(int k:arr)
        {
            nums.put(k, nums.getOrDefault(k,0)+1);
        }
        //print hashmap content
        for(Map.Entry<Integer,Integer> e: nums.entrySet())
        {
            System.out.println(e.getKey()+ " "+ e.getValue());
        }



    }
}
