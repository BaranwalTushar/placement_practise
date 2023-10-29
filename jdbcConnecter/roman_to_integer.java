package jdbcConnecter;

import java.util.HashMap;

public class roman_to_integer {
    public static  int romanToInt(String s) {
       HashMap<Character,Integer> result = new HashMap<>();
       result.put('I',1);
       result.put('V',5);
       result.put('X',10);
       result.put('L',50);
       result.put('C',100);
       result.put('D',500);
       result.put('M',1000);

       int current_value = result.get(s.charAt(s.length()-1));
       for(int i=s.length()-2;i>=0;i--){
        if(result.get(s.charAt(i) < result.get(s.charAt(i+1))) != null){

            current_value -= result.get(s.charAt(i));
        }
        else{
            current_value += result.get(s.charAt(i));
        }
       }
       return current_value;
        
        
      
    }
    public static void main(String[] args) {
         
        String s = "MC";
        int Answer = romanToInt(s);
        System.out.println(Answer);
    }
    
}
