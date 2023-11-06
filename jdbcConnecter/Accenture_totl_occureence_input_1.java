package jdbcConnecter;

public class Accenture_totl_occureence_input_1 {
        public static void main(String[] args) {
        int input1 = 2;
        int input2 = 22;

        int count =0;
        for(int i=1;i<=input2;i++){
           int temp =i;
           while(temp>0){
            if(temp%10==input1){
                count++;
            }
             temp = temp/10;//20/10=2 its goes to linee 11 and again check
           }
          
        }
        System.out.println(count);
       
    }
    
}
