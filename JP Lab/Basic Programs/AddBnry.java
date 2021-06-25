import java.util.Scanner;
class AddBnry{
public static void main(String args[]){
int i=0, c =0;
int[] sum = new int[10];
Scanner sc = new Scanner(System.in);
System.out.print("Enter a binary numbers : ");
long n1 = sc.nextLong();
long n2 = sc.nextLong();
while (n1 != 0 || n2 != 0) 
{
sum[i++] = (int)((n1 % 10 + n2 % 10 + c) % 2);
c = (int)((n1 % 10 + n2 % 10 + c) / 2);
n1 = n1 / 10;
n2 = n2 / 10;
}
if (c != 0) {
sum[i++] = c;
}
--i;
System.out.print("Total: ");
while (i >= 0) {
System.out.print(sum[i--]);
}
}
}