/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
        int a= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        int c= Math.min (a,b);
        int d= Math.max (a,b);
        int x1 = (int)((Math.random() * (d-c)) + c);
        int x2 = (int)((Math.random() * (d-c)) + c);
        int x3 = (int)((Math.random() * (d-c)) + c);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3); 
		int smallnum = Math.min(x1, x2);
		int smallestnum =Math.min(smallnum, x3);

        System.out.println("The minimal generated number was " + smallestnum);
 
	}
}
