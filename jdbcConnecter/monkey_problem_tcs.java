package jdbcConnecter;

public class monkey_problem_tcs {
    public static void main(String[] args) {
        int N = 20;
        int Banana_offered = 2;
        int epeanut_offered = 3;
        int total_banana = 12;
        int total_peanut = 12;

        if(N<1||Banana_offered<1||epeanut_offered<1||total_banana<1||total_peanut<1){
            System.out.println("Invalid Input");
        }
        else{
            int count_monkey_eat_banana = total_banana/Banana_offered;
            int count_monkey_eat_peanut = total_peanut/epeanut_offered;

            int total_monkey_eat = count_monkey_eat_banana+count_monkey_eat_peanut;
            System.out.println("Monkey left "+(N-total_monkey_eat));
        }
    }
    
}
