package Assessment;

import java.util.ArrayList;
import java.sql.*;
public class Competitor {
	
	public int competitorID;
	public int competitorAge;
	public Name name;
	public String level []= { "Beginner" , "Intermediate" , "Advanced" } ;
	public String country;
	private ArrayList <Integer> CompetitorScores ;
	
	//public int Scores [] = { 2, 5 , 7, 9 } ;
	
	
	
	final mySQL =
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
	
	public String getCompetitorName() {
		return competitorName;
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
	// Get initials
	private String getInitials() {
		String[] names = competitorName.split(" ");
		StringBuilder initials = new StringBuilder();
		for (String name : names) {
			if (!name.isEmpty()) {
				initials.append(name.charAt(0));
			}
		}
		return initials.toString();
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
	public double getOverallScore() {
		if (scores == null || scores.length == 0) {
			return 0.0;
		}
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		return sum / (double) scores.length;
	}
		
	

		
