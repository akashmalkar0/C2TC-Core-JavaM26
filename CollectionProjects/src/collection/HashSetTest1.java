package collection;
import java.util.*;
//program to copy element hashset to array element
public class HashSetTest1 {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>(); 
        set.add("1"); 
        set.add("13"); 
        set.add("27"); 
        set.add("87"); 
        set.add("19");         
        System.out.println("Hash Set Elements :" + set); 
        String arr[] = new String[set.size()]; 
        
        // toArray() method converts the set to array 
        set.toArray(arr); 
  
     

        for(int i = 0;i<arr.length;i++) {
        	System.out.println("Arrays at "+i+" : "+arr[i]);
        }

	}

}
