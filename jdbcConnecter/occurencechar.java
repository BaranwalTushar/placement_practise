package jdbcConnecter;

public class occurencechar {
    public static void main(String[] args) {
        String str = "1 2 3 4 5 6 1";
        char ch = '1';
        

        int frequency =0;
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                frequency ++;
            }

        }
        System.out.println("Frequency of "+ ch + " = "+frequency);
    }
    
}
