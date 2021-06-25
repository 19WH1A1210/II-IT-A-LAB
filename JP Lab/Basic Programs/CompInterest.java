public class CompInterest{

    public void calculate(int p, int t, double r, int n) {
        double amt = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amt - p;
        System.out.println("Compound Interest after " + t + " years: "+cinterest);
        System.out.println("Amount after " + t + " years: "+amt);
    }
    public static void main(String args[]) {
    	CompInterest obj = new CompInterest();
    	obj.calculate(3000, 4, .08, 10);
    }
}