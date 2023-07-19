package jdbcConnecter;

public class octal_to_decimal {
    public static void main(String[] args) {
        String str = "345";
        int decimal = Integer.parseInt(str,8);
        System.out.println(decimal);
    }
    
}
