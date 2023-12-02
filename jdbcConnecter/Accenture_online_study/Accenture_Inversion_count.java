package jdbcConnecter.Accenture_online_study;

public class Accenture_Inversion_count {

    public static int inversion_count(int[]A,int n){
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(A[i]>A[j]){
                    count++;
                }
            }
          
    }
    return count;
}
    public static void main(String[] args) {
        int []A = {13,10,9,6,21,15,14};
        int n=7;
        System.out.println(inversion_count(A, n));
        
    }
    
}
