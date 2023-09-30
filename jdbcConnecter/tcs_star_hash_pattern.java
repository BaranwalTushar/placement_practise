package jdbcConnecter;

public class tcs_star_hash_pattern {
    public static void main(String[] args) {
       String str = "helloo";
       int count =0;
       int count1 =0;

      for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch=='*'){
            count++;
        }
        else if(ch=='#'){
            count1++;
        }
       
      }
       System.out.println(count-count1);
        
    }
    
}
