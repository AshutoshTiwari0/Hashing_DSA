package Hashing.Practice;
import java.util.*;
public class practice1 {
    public static void main(String[] args) {
        HashMap<String,Integer> nums=new HashMap<>();
        nums.put("Ashutosh",54);
        nums.put("Abhishek",96);
        nums.put("Krishna",99);
        //now trying to print our hashmap
        for(Map.Entry<String,Integer> e:nums.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
