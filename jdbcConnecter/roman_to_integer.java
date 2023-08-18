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
        
        int romanvalue = 0;
        int prevvalue = 0;
        for(int i =s.length()-1;i>=0;i--){
            int currentvalue =result.get(s.charAt(i));
            if(currentvalue<prevvalue){
                romanvalue -= currentvalue;
            } 
            else{
                romanvalue += currentvalue;
            }
            currentvalue = prevvalue;

        }
        return romanvalue;
    }
    public static void main(String[] args) {
         
        String s = "MCMXCIV";
        int Answer = romanToInt(s);
        System.out.println(Answer);
    }
    
}
