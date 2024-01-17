/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
        double a= Double.parseDouble(args[0]);
        double b= Double.parseDouble(args[1]);
        double c= Math.min (a,b);
        double d= Math.max (a,b);
        double x1 = ((Math.random() * (d-c)) + c);
        double x2 = ((Math.random() * (d-c)) + c);
        double x3 = ((Math.random() * (d-c)) + c);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3); 

        System.out.println("The minimal generated number was " + Math.min(x1, Math.min (x2,x3)));
 
	}
}
