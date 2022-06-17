import java.util.Comparator;

class Sortbyname implements Comparator<Student> 
	{ 
		// Sort by name in alpha order
		public int compare(Student a, Student b) 
		{ 
			return a.name.compareTo(b.name); 
		} 
	} 
