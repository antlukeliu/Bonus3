import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		int ranNum = (int)(Math.random()*100) + 1;
		int count = 0;
		boolean goOn = true;
		Validate validNum = new Validate();
		do{
			
			int guessNum = validNum.numCheck(); 
			count++;
			validNum.positionCheck(ranNum, guessNum, count);
			
			if(ranNum == guessNum){
				char response = validNum.checkingForYesOrNo();
				goOn = validNum.loopingAgain(response);
				validNum.exitting(goOn);
			}
		}while(goOn);
	}
}
