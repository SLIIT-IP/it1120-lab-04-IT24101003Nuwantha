import java.util.Scanner;

public class IT24101003Lab4Q1{
	public static void main (String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");	
		int number = scanner.nextInt();
		if(number== 0){
 			System.out.println("The number is zero");
		}else if(number > 0){
			System.out.println("The number is Positive");
		}else{
			System.out.println("The number is Negative");
		}
	
	}
}
