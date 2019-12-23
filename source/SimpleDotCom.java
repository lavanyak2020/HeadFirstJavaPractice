import java.util.*;
import java.lang.Math.*;
public class SimpleDotCom{
	int[] locationCells;
	int numOfHits;

	String checkYourself(String guess){
		int g = Integer.valueOf(Integer.parseInt(guess));
		boolean hit = false;
		int len = locationCells.length;

		for(int i=0;i<len;i++){
			if(g == locationCells[i]){
				locationCells[i] = -1;
				numOfHits ++;
				if(numOfHits == len){
					return "kill";
				}else{
					return "hit";
				}
			}
		}
		return "miss";

	}

	void setLocationCells(int[] loc){
		int len = loc.length;
		locationCells = new int[len];
		for(int i=0;i<len;i++){
			locationCells[i] = loc[i];
		}
	}
}

class SimpleDotComTestDriven{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		SimpleDotCom sdc = new SimpleDotCom();
		int random = (int) (Math.random()*5);
		int[] loc = {random,random+1,random+2};
		sdc.setLocationCells(loc);
		int numOfGuess = 0;
		do{
			numOfGuess++;
			System.out.print("Enter your guess:");
			String guess = scan.next();
			String res = sdc.checkYourself(guess);
			System.out.println(res);
			if(res == "kill"){
				System.out.println("You took "+numOfGuess+" guesses");
				break;
			}
		}while(true);

	}
	
}