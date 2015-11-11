import java.util.Scanner;
public class AdditionGameWithMethodsLoops {
	public static void main(String[] args) {
		
		// call the addition game method
		additionGameMethod();	
		
		System.out.println("All done.");
	}
	public static void additionGameMethod() {
		System.out.println("Inside the addition game method.");
		
		// set up the for loop
		int numberOfRounds = 2;
		int hardness  = 5;

		for (int roundNumber = 1;
		roundNumber <= numberOfRounds;
		roundNumber = roundNumber + 1){
			System.out.println("Inside the for loop. Round : " + roundNumber);
			boolean isAnswerCorrect = getAndCheckStudentAnswer(hardness);
			
		System.out.println("Hello!");
		isAnswerCorrect = getAndCheckStudentAnswer(hardness);
		if (isAnswerCorrect){
			System.out.println("It was correct.");
		}else{
			System.out.println("It was not incorrect.");
		}
		
	}
		return;
		
	}
	public static boolean getAndCheckStudentAnswer(int hardness) {
		System.out.println("Inside get and check student answer method.");
		int number1 = (int)(Math.random()*hardness);
		int number2 = (int)(Math.random()*hardness);
		System.out.println("Add " + number1 + " + " + number2 + ":");
		Scanner input = new Scanner(System.in);
		int studentAnswer = input.nextInt();
		if (studentAnswer == (number1 + number2)){
			System.out.println("Good job! Your answer was correct.");
			return true;
		}else{
			System.out.println("Nice try, but the correct answer " +
					"was " + (number1 + number2));
			return false;
			}
		}
	}