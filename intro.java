package Hashing;
import java.util.*;
public class intro {
    public static void main(String[] args) {
        HashSet<String> nums=new HashSet<String>();
        nums.add("Hello");
        nums.add("gfg");
        nums.add("amity");

        //printing nums
        System.out.println(nums);
        //contains function-> returns a boolean value
        System.out.println(nums.contains("gfg"));
        //getting size
        System.out.println("size is "+ nums.size());
        //removing an item
        nums.remove("amity");
        System.out.println("size after removing is "+nums.size());
        //for each loop traversal of every element
        for(String k:nums)
        {
            System.out.println(k);
        }
        //to check if the hashset is empty
        System.out.println(nums.isEmpty()); //returns true or false

        //clear()-> clearing all the content from hashset
       nums.clear();
       for(String g:nums)
       {
           System.out.println(g);
       }

       /* DIFFERENCE BETWEEN HASHSET AND HASHMAP
       HASHSET->STORES ONLY KEYS
       HASHMAP-> STORES KEY VALUE PAIRS
        */
    }
}
