package jdbcConnecter;

public class removeduplicatechar_fromtwostring {
    
       
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "cefz";
        String result = str1+str2;

        String newstring = "";
        for(int i=0;i<result.length();i++){
            char ch = result.charAt(i);
            if(newstring.indexOf(ch)==-1){
                newstring += ch;
            }
        }
        System.out.println(newstring);
        

        
    }
    
        

       

       

    }
    

