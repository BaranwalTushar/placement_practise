package jdbcConnecter;

public class Roots {
    public static void main(String[] args) {
        double a=1;
        double b=-3;
        double c =-10;
        double root1,root2;

        root1 = (-b+Math.sqrt(b*b-4*a*c))/2*a;
        root2 = (-b-Math.sqrt(b*b-4*a*c))/2*a;

        System.out.println("Root1 = "+root1 +" Root2 = "+root2);
        



    }
    
}
