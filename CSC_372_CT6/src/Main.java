import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Main //Driving class from other java files
{ 
	public static void main (String[] args) 
	{ 
		ArrayList<Student> arrayList = new ArrayList<Student>(); 
		arrayList.add(new Student(700953756, "Fred Q", "Liverpool,UK")); 
		arrayList.add(new Student(701005589, "Meghan X", "Brewer,ME")); 
		arrayList.add(new Student(700953856, "Cleetus M", "Tampa Bay,FL")); 
		arrayList.add(new Student(699975221, "Joe S", "Buffalo,NY")); 
		arrayList.add(new Student(702635659, "Kylie M", "San Degio, CA")); 
		arrayList.add(new Student(789126823, "Rose S", "Syracuse,NY")); 
		arrayList.add(new Student(700789456, "Bob Z", "Denver,CO")); 
		arrayList.add(new Student(701637759, "Jacob M", "Hobart,TAS ")); 
		arrayList.add(new Student(789126823, "Bri D", "Montreal,QB")); 
		arrayList.add(new Student(700789456, "Tony S", "Manhattan,NY")); 


		System.out.println("Unsorted"); 
		for (int i=0; i<arrayList.size(); i++) 
			System.out.println(arrayList.get(i)); 

		Collections.sort(arrayList, new SortByRoll()); 

		System.out.println("\nSorted by rollno"); 
		for (int i=0; i<arrayList.size(); i++) 
			System.out.println(arrayList.get(i)); 

		Collections.sort(arrayList, new Sortbyname()); 

		System.out.println("\nSorted by name"); 
		for (int i=0; i<arrayList.size(); i++) 
			System.out.println(arrayList.get(i)); 
	} 
} 
