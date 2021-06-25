import java.util.*;
class leap{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int yr = sc.nextInt();
		if(yr % 4 == 0){
			if(yr % 100 == 0){
				if(yr % 400 == 0){
					System.out.println("It is LEAP year");
				}
				else{
					System.out.println("It is not LEAP year");
				}
			}
			else{
				System.out.println("It is LEAP year");
			}
		}
		else{
			System.out.println("It is not LEAP year");
		}
	}
}	