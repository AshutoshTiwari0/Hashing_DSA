package Hashing;
import java.util.*;
public class hashmap {
    public static void main(String[] args) {
      HashMap<String,Integer> nums=new HashMap<String,Integer>();
      nums.put("Ashutosh",71);
      nums.put("Krishna",89);
      nums.put("Abhishek",98);
      System.out.println(nums);
      System.out.println("size is "+ nums.size());
      //traversing a hashmap
        for(Map.Entry<String,Integer> e: nums.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
        //for checking a key is present in a hashmap or not
        System.out.println(nums.containsKey("Ashutosh"));
        //removing a key
        nums.remove("Ashutosh");

        System.out.println("after removing key size is "+ nums.size());
        //for checking whether a value is present or not
        System.out.println(nums.containsValue(89));
        //get()
        System.out.println(nums.get("Abhishek"));
    }
}
