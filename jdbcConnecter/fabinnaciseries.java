package jdbcConnecter;

public class fabinnaciseries {
    public static void fabinnaci(int n){
          int a =0;
          int b =1;
          int c =1;

          for(int i=0;i<=n;i++){
            System.out.println(a);
            a=b;
            b=c;
            c=a+b;
          } 
    }
    public static void main(String[] args) {
        fabinnaci(5);
    }
    
}
