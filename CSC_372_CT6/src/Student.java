
	import java.util.*; 
	import java.io.*; 

	// information needed for creating a student 
	class Student extends Main 
	{ 
		int rollno; 
		String name;
		String address; 

		// Constructor 
		public Student(int rollno, String name, String address) 
		{ 
			this.rollno = rollno; 
			this.name = name; 
			this.address = address; 
		} 
		
	    public String getName() {
	        return name;
	    }
	    public int getRollno() {
	    	return rollno;
	    }
	    public String getAddress() {
	    	return address;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	   
	    public void setRollno(int rollno) {
	        this.rollno = rollno;
	    }
	    public void setAddress(String address) {
	        this.address = address;
	    }
	   
		// Used to print student details in main() 
		public String toString() 
		{ 
			return this.rollno + " " + this.name + 
							" " + this.address; 
		} 
	} 



	


