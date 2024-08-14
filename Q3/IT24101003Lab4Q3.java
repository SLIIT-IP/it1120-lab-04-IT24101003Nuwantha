import java.util.Scanner;

public class IT24101003Lab4Q3{
	public static void main (String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");	
		int number = scanner.nextInt();
		String message = number== 0? "The number is zero": number > 0 ?"The number is Positive": "The number is Negative";
		System.out.print(message);
	}
}
