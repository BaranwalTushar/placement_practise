/*Write a program to print all the unique characters in a String. For instance, 
if the input string is “abcb”, the output will be the characters ‘a’ and ‘c’ as they are unique.
 The character ‘b’ repeats twice and so it will not be printed.*/
package jdbcConnecter;

public class Unique_Characters {

    public static boolean unique_char(String str){
         
        char[]ch = str.toCharArray();//important
        for(int i=0;i<str.length()-1;i++){
            if(ch[i]==ch[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        String str = "abbc";
        System.out.println("the unique characters are "+unique_char(str));
       
            
        }
        
    }
    

