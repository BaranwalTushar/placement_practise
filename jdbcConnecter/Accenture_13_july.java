package jdbcConnecter;

public class Accenture_13_july {

    public static int nucleous(int n, char ch[],int []arr){
        int sum =0;
           
        for(int i =0;i<n;i++){
            if(ch[i]=='P'){
            sum += arr[i];
            }
            else if(ch[i]=='N'){
                sum -= arr[i];
            }
        }
        return sum*100;
    }
    public static void main(String[] args) {

       int n=3;
       char ch[] = {'P','N','P'};
       int arr[] = {4,3,5};
       System.out.println(nucleous(n, ch, arr));


    }
    
}
