import java.util.Scanner;
public class SmplInterest
{
    public static void main(String args[]) 
    {
        float p, r, t, si;
        Scanner scan = new Scanner(System.in);
        System.out.print("Principal : ");
        p = scan.nextFloat();
        System.out.print("Rate of interest : ");
        r = scan.nextFloat();
        System.out.print("Time period : ");
        t = scan.nextFloat();
        scan.close();
        si = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +si);
    }
}