package jdbcConnecter;

public class String_intersection {
    public static void main(String[] args) {
        String str1[] = {"one","two","three","four","five"};
        String str2[] = {"six","seven","one","two","ten"};
        for(int i=0;i<str1.length;i++){
            for(int j=0;j<str2.length;j++){
                if(str1[i] == str2[j]){
                    System.out.println("Intersection = "+str1[i]);
                }
            }
        }
    }
    
}
