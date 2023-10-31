package jdbcConnecter;

public class card_pyramid {

    public static int card(int n ,int[] arr){
        int card_num =0;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 2;
        }
        
        arr[0] = 0;
        arr[1] = 2;
        for(int i=2;i<=n;i++){
      
            arr[i] = ((2*i) + i-1+ arr[i-1])%1000007;
        }
        return card_num;

        
    }
    public static void main(String[] args) {
        int n =3;
        int []arr = {2};
        System.out.println(card(n, arr));
        

        
    }
    
}
