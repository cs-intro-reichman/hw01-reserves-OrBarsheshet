public class Coins {
    public static void main(String[] args) {
        int cents= Integer.parseInt(args[0]);
        int quarter = cents/25; 
        int cent= cents % 25; 
        System.out.println("use " + quarter + " quarters " + "and " + cent + " cents");
    }
    
}
