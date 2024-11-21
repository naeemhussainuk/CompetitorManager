package Assessment;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		Competitor c1 = new Competitor(100, 22, new Name("Alice Green"), "UK" ) ;
	
		

		System.out.println(c1.getFullDetails());
		

		System.out.println(c1.getShortDetails());
		
		
		ArrayList <Integer> myScores = new ArrayList();
		ArrayList <Integer> returnedScores  = new ArrayList();

		for (int i = 0 ; i < 5 ; i ++ ) {
			
		// .add (index , integer value)
			myScores.add(i , i*3);
		}
	
	//System.out.println(myScores);
	
		
		c1.setScoreArray(myScores);
		returnedScores = c1.getScoreArray() ;
		
		System.out.println(returnedScores);
	}

	// Initialized GUI
		
}


