package jdbcConnecter;

import java.util.Arrays;
import java.util.HashSet;

public class Array_intersection {
    public static  HashSet<Integer> intersection(int nums1[],int nums2[]){
         HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums1[i])){
                set1.add(nums2[i]);
            }
        }
        return set1;
    }
       
        
        


    
   
    public static void main(String[] args) {
        int nums1[] ={4,9,5};
        int nums2[] = {9,4,9,8,4};
        System.out.println(intersection(nums1, nums2));
        
       
    }
    
}
