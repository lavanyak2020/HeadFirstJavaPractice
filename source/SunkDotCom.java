import java.util.*;
import java.lang.Math.*;
class DotCom{
	private ArrayList<String> locationCells;
	private String name;
	int numOfHits;
	void setName(String name){
		this.name = name;
	}
	String getName(){
		return name;
	}
	String checkYourself(String guess){
		int index = locationCells.indexOf(guess);
		if(index >= 0){
			numOfHits ++;
			locationCells.remove(index);
			if(locationCells.isEmpty()){
				return "Ouch! You reached "+name;
			}
			return "hit";
		}
		return "miss";

	}

	void setLocationCells(ArrayList<String> loc){
		locationCells = loc;
	}
}

class DotComBust{
	ArrayList<DotCom> d = new DotCom[3];
	int reachedCount = 0;

	void setUpGame(){
		ArrayList<String> loc = new ArrayList<>();
		loc.add("B0");
		loc.add("C0");
		loc.add("D0");

		d[0] = new DotCom();
		d[0].setName("google.com");
		d[0].setLocationCells(loc);
		loc.clear();

		loc.add("D2");
		loc.add("D3");
		loc.add("D4");

		d[1] = new DotCom();
		d[1].setName("yaahoo.com");
		d[1].setLocationCells(loc);
		loc.clear();

		loc.add("G3");
		loc.add("G4");
		loc.add("G5");
		d[2] = new DotCom();
		d[2].setName("youtube.com");
		d[2].setLocationCells(loc);

	}
	boolean checkUserGuess(){
		boolean completed = false;
		for(DotCom dc:d){
			String res = dc.checkYourself(guess);
			if(res == "miss"){
				continue;
			}else if( res != "hit"){
				reachedCount ++;
			}
			System.out.println(res);
			if(reachedCount == 3){
				return true;
			}
		}
	}
}

class SimpleDotComTestDriven{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		DotComBust dcb = new DotComBust();
		int numOfGuess = 0;
		dcb.createGame();
		do{
			numOfGuess++;
			System.out.print("Enter your guess:");
			String guess = scan.next();
			String res = dcb.playGame(guess);
			System.out.println(res);
			if(res == "kill"){
				System.out.println("You took "+numOfGuess+" guesses");
				break;
			}
		}while(true);

	}
	
}