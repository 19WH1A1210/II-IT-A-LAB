import java.util.Scanner;
public class AvgArray {

    public static void main(String[] args) {
        System.out.println("Number of Elements: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
    
        double[] a = new double[n];
        double sum = 0;
	System.out.print("Enter Elements: ");
        for(int i=0; i<a.length; i++){
        	a[i] = scanner.nextDouble();
        }
        scanner.close();
        for(int i=0; i<a.length; i++){
        	sum = sum + a[i];
        }
        double avg = sum / a.length;
        
        System.out.format("The average is: %.3f", avg);
    }
}