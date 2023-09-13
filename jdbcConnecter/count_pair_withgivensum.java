package jdbcConnecter;

import java.util.Arrays;
import java.util.HashMap;

public class count_pair_withgivensum {
    public static int Count(int k,int arr[]){
       
        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(k<arr[i]){
                int ele = k-arr[i];

                if(map.containsKey(ele)){
                    count += map.get(ele);
                }
                if(map.get(arr[i])==null){
                    map.put(arr[i],0);
                }
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int arr[] = {1,5,7,1};
        int k = 6;
        System.out.println(Count(k, arr));
        
    }
    
}
