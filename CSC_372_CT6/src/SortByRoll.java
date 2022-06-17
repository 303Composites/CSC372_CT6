import java.util.Comparator;

class SortByRoll implements Comparator<Student> 
	{ 
		//Sort by student id number
		public int compare(Student a, Student b) 
		{ 
			return a.rollno - b.rollno; 
		} 
	} 