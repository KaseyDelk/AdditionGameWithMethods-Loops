import java.util.Scanner;

public class AdditionGameWithMethodsLoops {
	public static void main(String[] args) {

		int score;
		// Call the addition game method
		additionGameMethod();	
		
		System.out.println("All done.");
	}
	public static void additionGameMethod() {

		int score 	  = 0;
		int hardness  = 5;
		int stopIndex = 2;
		boolean isAnswerCorrect;
		
		for (int index = 0; index < stopIndex; index = index + 1){
			
		System.out.println("Hello!");
		isAnswerCorrect = checkAnswerMethod(hardness);
		if (isAnswerCorrect){
			System.out.println("It was correct.");
		}else{
			System.out.println("It was not incorrect.");
		}
		
	}
		return;
		
	}
	public static boolean checkAnswerMethod(int hardness) {
		
		return true;

		}
	}