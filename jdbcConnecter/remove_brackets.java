package jdbcConnecter;

public class remove_brackets {
    public static void main(String[] args) {
        String str = "a+((b-c)+d)";
        String s = str.replaceAll("[()]", "");
        
        System.out.println(s);
        
    }
    
}
