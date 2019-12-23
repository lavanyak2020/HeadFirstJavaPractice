import java.util.*;
import java.lang.Math.*;
public class DotCom{
	private ArrayList<String> locationCells;
	int numOfHits;

	String checkYourself(String guess){
		int index = locationCells.indexOf(guess);
		if(index >= 0){
			numOfHits ++;
			locationCells.remove(index);
			if(locationCells.isEmpty()){
				return "kill";
			}
			return "hit";
		}
		return "miss";

	}

	void setLocationCells(ArrayList<String> loc){
		locationCells = loc;
	}
}

class SimpleDotComTestDriven{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		DotCom dc = new DotCom();
		int random = (int) (Math.random()*5);
		//ArrayList<String> loc = {random,random+1,random+2};
		ArrayList<String> loc = new ArrayList<String>();
		loc.add("2");
		loc.add("3");
		loc.add("4");
		dc.setLocationCells(loc);
		int numOfGuess = 0;
		do{
			numOfGuess++;
			System.out.print("Enter your guess:");
			String guess = scan.next();
			String res = dc.checkYourself(guess);
			System.out.println(res);
			if(res == "kill"){
				System.out.println("You took "+numOfGuess+" guesses");
				break;
			}
		}while(true);

	}
	
}