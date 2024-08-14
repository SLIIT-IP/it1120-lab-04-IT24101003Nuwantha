import java.util.Scanner;

public class IT24101003Lab4Q2{
	public static void main (String []args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter exam marks (out of 100): ");
		double examMarks = scanner.nextDouble();
		if(examMarks < 0 || examMarks > 100 ){
		System.out.print("Invalid input for exam marks. Terminating program.");
		System.exit(1);
		}

		System.out.print("Please enter lab submission marks (out of 100): ");
		double labMarks = scanner.nextDouble(); 	
		if(labMarks < 0 || labMarks > 100 ){
		System.out.print("Invalid input for lab marks. Terminating program.");
		System.exit(1);
		}

		System.out.print("Enter the prercentage given for exam:");
		double examPercentage = scanner.nextDouble(); 	
		
		System.out.print("Enter the prercentage given for lab:");
		double labPercentage = scanner.nextDouble();

		examMarks = examMarks *(examPercentage/100);
		labMarks = labMarks*(labPercentage/100);
		double finalMarks = examMarks+ labMarks;

		if(finalMarks > 100){
		System.out.print("The precentages must add up to 100. Terminating program.");
		System.exit(1);
		}
		
		System.out.print("Final exam mark is : "+finalMarks );

		
		
		
		
	}
}
