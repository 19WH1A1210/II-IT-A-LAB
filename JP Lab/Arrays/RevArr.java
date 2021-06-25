import java.util.*;
public class RevArr {
   public static void main(String args[])
   {
	int c, i=0, j=0, tmp;
	int a[] = new int[100];
	Scanner scanner = new Scanner(System.in);
	System.out.print("Number of Elements: ");
	c = scanner.nextInt();

	System.out.print("Enter Array Elements: ");
	for(i=0; i<c; i++)
	{
	    a[i] = scanner.nextInt();
	}

	j = i - 1;     
	i = 0;         
	scanner.close();
	while(i<j)
	{
  	   tmp = a[i];
	   a[i] = a[j];
	   a[j] = tmp;
	   i++;
	   j--;
	}

	System.out.print("Reversed array: ");
	for(i=0; i<c; i++)
	{
	   System.out.print(a[i]+ "  ");
	}       
   }
     }