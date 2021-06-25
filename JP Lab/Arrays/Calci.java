import java.util.Scanner;
public class Calci{
    public static void main(String[] args) {
    	double n1, n2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers:");       
        n1 = scanner.nextDouble();
        n2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double ans;

        switch(operator)
        {
            case '+':
            	ans = n1 + n2;
                break;
            case '-':
            	ans = n1 - n2;
                break;
            case '*':
            	ans = n1 * n2;
                break;
            case '/':
            	ans = n1 / n2;
                break;

            default:
                System.out.printf("You have entered wrong operator");
                return;
        }
        System.out.println(n1+" "+operator+" "+n2+": "+ans);
    }
  }      