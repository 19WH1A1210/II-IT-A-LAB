import java.util.*;
class EvenOdd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter a number: ");
n = sc.nextInt();
if(n%2==0){
System.out.println("It is EVEN");
}
else{
System.out.println("It is ODD");
}
}
}