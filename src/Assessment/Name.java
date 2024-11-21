package Assessment;

public class Name {

	String name ;
	
	public Name (String n ) {
		
		this.name = n;
		
	}
	//method for getting first name
		public String getFirstName() {
			
		    String words[] = name.split(" "); 
		    return words [0] ;
		}
	
	
	//method for getting initials of the name
	public String getInitials() {
		
	    String a = "" ;
	    String words[] = name.split(" "); 
	    for(String word : words) { 
	      a = a + word.charAt(0);
	      
	    } 
	    
	    return a ;
	}
	
}
