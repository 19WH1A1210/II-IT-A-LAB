import java.util.*;
public class RevArr {
   public static void main(String args[])
   {
	int c, i=0;
	int a[] = new int[100];
	Scanner scanner = new Scanner(System.in);
	System.out.print("Number of Elements: ");
	c = scanner.nextInt();

	System.out.print("Enter Array Elements: ");
	for(i=1; i<=c; i++)
	{
	    a[i] = scanner.nextInt();
	}
        
	scanner.close();
	System.out.print("Reversed array: ");
	for(i=c; i>0; i--)
	{
	   System.out.print(a[i]+ "  ");
	}       
   }
     }
