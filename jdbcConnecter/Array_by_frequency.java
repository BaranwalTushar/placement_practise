package jdbcConnecter;

import java.util.HashMap;
import java.util.Map;

public class Array_by_frequency {
    public static void main(String[] args) {
        int [] arr = {1,2,1,3,4,5,6,5,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry entry: map.entrySet()){
            System.out.println("Element | Frequency");
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
    }
    
}
