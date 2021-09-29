package day6Quiz;
import java.util.*;

public class QuizApp 
{
	String questions[] =new String[3];
	String options[][] =new String[3][4]; 
	int answer[] =new int[3];
	
	
	public float playQuiz()
	{
		float point = 0;
		Scanner sc = new Scanner(System.in);
		
	questions[0] = "what is capital of india ?";
			
		options[0][0] = "delhi";
		options[0][1] = "mumbai";
		options[0][2] = "gujrat";
		options[0][3] = "up";
		
		answer[0] = 1;
		
	questions[1] = "what is capital of UP ?";
		
		options[1][0] = "mathura";
		options[1][1] = "agra";
		options[1][2] = "ghaziabad";
		options[1][3] = "lucknow";
		
		answer[1] = 4;
		
	questions[2] = "what is capital of Gujrat ?";
			
		options[2][0] = "delhi";
		options[2][1] = "mumbai";
		options[2][2] = "gandhiNagar";
		options[2][3] = "up";
		
		answer[2] = 3 ;
	
		for(int i = 0 ; i < questions.length ; i++)
		{
			System.out.println(questions[i]);
			System.out.println(options[i][0] + " : press 1");
			System.out.println(options[i][1] + " : press 2") ;
			System.out.println(options[i][2] + " : press 3");
			System.out.println(options[i][3] + " : press 4");
			
			int option = Integer.parseInt(sc.nextLine());
			
			if(option == answer[i]) point++;
			else point = point - 0.5f;
		}
		
		return point;
	}
	
	public static void main(String[] args) {
		
		System.out.println("********* lets play  **********");
		QuizApp p = new QuizApp();
		System.out.print(p.playQuiz());
		
	}
}