package jdbcConnecter;

import java.util.Stack;

public class Accenture_Bracket_2 {

    public static int equallity(String str){

        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='('){
                st.push(ch);
            }

            else if(ch==')'){
                if(st.empty()||st.peek()!='('){
                   return 1;
                }
                st.pop();
            }
        }
        if(st.empty()){
            return 0;
        }
       else{
        return 1;
       }
    }
    public static void main(String[] args) {
        String str = "Hello and (wlecomee(to thr) ce(cont) to)id(sta)";
        System.out.println(equallity(str));
    }
    
}
