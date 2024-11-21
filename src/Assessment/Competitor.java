package Assessment;

import java.util.ArrayList;

public class Competitor {
	
	public int competitorID;
	public int competitorAge;
	public Name name;
	public String level []= { "Beginner" , "Intermediate" , "Advanced" } ;
	public String country;
	private ArrayList <Integer> CompetitorScores ;
	
	//public int Scores [] = { 2, 5 , 7, 9 } ;
	
	
	
	
	public Competitor (int ID , int age, Name n, String country ) {
		
		this.competitorID = ID ; 
		this.competitorAge = age ;
		this.name= n ;
		this.country = country ;
		
		
	}
	
	//ID getter
	public int getCompetitorID() {
		return competitorID;
	}
	// age Getter
	
	public int getComptitorAge() {
		return  competitorAge ;
	
	}
	
	//name getters
	
	private  Name getName () {
		return name ;
	}

	// country getter
	
	public String getCountry() {
		return country ;
	}
	
	
	
	//Full Details Method
	
	public String getFullDetails() {
		
		String c_details = "Competitor number " + this.competitorID + ", " + " name " + this.name.name  + "," +  " country " + this.country  + " \n " + this.name.getFirstName()+ " , is a "+ this.level[0] +  " aged " + this.competitorAge +  " and has an overall score of " + getOverallScore () ;
		
		return c_details;
	}
	
	//Short Details Method
	public String getShortDetails() {
		
		double overallScore = getOverallScore();
		
		String shortDetails = "CN " + this.competitorID +  "(" + this.name.getInitials()+ ")" +" has overall score " + overallScore;
		
		return shortDetails;
		

}
	
	//Overall Score  Method
		public double getOverallScore(){
			
			return 5.0; 
}
		
	//Score Array
	 public void setScoreArray(ArrayList Scores) {
		 
		 this.CompetitorScores = Scores ;
		
	 }
 //Method for getting score array
	 
	 public ArrayList getScoreArray() {
		 return CompetitorScores ;
	 }

	
	
		
	}
		
	

		
