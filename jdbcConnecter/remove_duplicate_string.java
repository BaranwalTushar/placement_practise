package jdbcConnecter;

public class remove_duplicate_string {
    public static String removeduplicate(String str){
        String newstring ="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(newstring.indexOf(ch)==-1){
                newstring += ch;

            }
        }
        return newstring;
    }

    public static void main(String[] args) {
        String str = "pallindromep";
        System.out.println(removeduplicate(str));
        

        
    }
    
}
