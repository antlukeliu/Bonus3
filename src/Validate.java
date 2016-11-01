import java.util.InputMismatchException;
import java.util.Scanner;

public class Validate {
    
	public int numCheck(){
    	int num;
    	while(true){
    		try{
    	        Scanner sc = new Scanner(System.in);
    	        System.out.print("Enter your guess a number from 1 to 100: ");
    	        num = sc.nextInt();
 
    			if (num <= 0 || num > 100) continue;
    			else break;
    			
    		}catch(InputMismatchException ime){
    			System.out.println("You made an error, get the a number from 1 to 100");
    		}
			
		}
		return num;
    }
	public boolean positionCheck(int ranNum, int guessNum, int count){
		if (ranNum == guessNum){
		System.out.printf("You guessed correctly and it took you %d guesses.", count);
		return false;
		}
	else if (ranNum > guessNum){
		if (ranNum > guessNum + 10){
			System.out.println("You are way too low");
		}else {
			System.out.println("You are sort of low");
			  }
	}else{
		if (ranNum + 10 < guessNum){
			System.out.println("You are way too high");
		}else {
			System.out.println("You are sort of high");
			  }
		}
	return true;
	}
	public char checkingForYesOrNo(){
		Scanner sc = new Scanner(System.in);
		
		String response = "";
		boolean cont = true;
		while(cont){
			System.out.print("\nContinue to play? (y/n): ");
			response = sc.nextLine();
			if(response.length() != 1){
				continue;
			}
			else if (response.toLowerCase().charAt(0) != 'y' && response.toLowerCase().charAt(0) != 'n'){
				continue;
				}
			else{
				break;
			}
		}
		return response.toLowerCase().charAt(0);
	}
	//Breaking while loop if false 
	public boolean loopingAgain(char response){
		if (response == 'y'){
			return true;
		} else{
			return false;
		}
	}
	
	//Closing message
	public void exitting(boolean cont){
		if (cont == false){
			System.out.println(	"\nGoodbye =)");
		}
	}
}
