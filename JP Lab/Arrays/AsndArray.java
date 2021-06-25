import java.util.Scanner;
public class AsndArray
{
    public static void main(String[] args) 
    {
    	int c, tmp;
    	
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        c = scan.nextInt();
    
        int a[] = new int[c];
        System.out.println("Enter array elements:");
        for (int i = 0; i < c; i++) 
        {
            a[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < c; i++) 
        {
            for (int j = i + 1; j < c; j++) { 
                if (a[i] > a[j]) 
                {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.print("Ascending Order: ");
        for (int i = 0; i < c - 1; i++) 
        {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[c - 1]);
    }
}