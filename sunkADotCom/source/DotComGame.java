import java.util.*;

public class SimpleDotCom{
	int[] locationCells;
	int numOfHits;

	String checkYourself(String guess){
		int g = Integer.valueOf(Integer.parseInt(guess));
		boolean hit = false;
		int len = locationCells.length;

		for(int i=0;i<len;i++){
			if(g == locationCells[i]){
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