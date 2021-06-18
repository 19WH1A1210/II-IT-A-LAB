import java.util.*;
class AddElem
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n, i, sum = 0;
System.out.println("Enter no. of elements: ");
n = sc.nextInt();
int a[] = new int[n];
System.out.println("Enter the elements: ");
for(i = 0; i < n; i++)
{
a[i] = sc.nextInt();
}
for(i = 0; i < n; i++)
{
sum += a[i];
}
System.out.println("Sum of elements = "+sum);
}
}
 