package jdbcConnecter;

import java.util.Scanner;
import java.util.Stack;

public class Accenture_Bracket_Balanced {
    public static boolean Bracket(String str){
        
       char[] ch = str.toCharArray();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(ch[i]=='{'){
              st.push(ch[i]);
            }
            else{
                if(st.empty()){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        return st.empty();

    }
    public static void main(String[] args) {
       System.out.println( Bracket("{{{}}"));
    }
    
}
