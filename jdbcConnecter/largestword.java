package jdbcConnecter;

public class largestword {

    public static String findlargestword(String str){
        String [] word = str.split(" ");
        String largestword = "";

        for(String words : word){
            if(words.length()>largestword.length()){

                largestword = words;
            }
        }
        return largestword;

    }
    public static void main(String[] args) {
        String str = "Tushar is a good boy";
        String largestword = findlargestword(str);
        System.out.println(largestword);
        
    
    
}
}
