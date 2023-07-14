package jdbcConnecter;

public class Tolowercase {
    public static void main(String[] args) {
        String name = "Tushar";
        String firstletter = name.substring(0, 1);//important
        String remainningletter = name.substring(1, name.length());

        firstletter = firstletter.toLowerCase();
        name = firstletter+remainningletter;
        System.out.println(name);
        
    }
    
}
