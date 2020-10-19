import java.util.Arrays;

public class Driver {

	public static void main(String[] args) 
	{
		Person p1 = new Person("Tim", 6);
		Person p2 = new Person("Sarah", 12);
		
		// Tim is younger, so a -1 should return
		System.out.println(p1.compareTo(p2));
		
		// Sarah is older, so 1
		System.out.println(p2.compareTo(p1));
		
		// Equal so 0
		System.out.println(p1.compareTo(p1));
		
		
		// Example of compareTo with Arrays class
			Person[] people = {p2, p1};
			System.out.println(Arrays.toString(people));
			
			Arrays.parallelSort(people);
			System.out.println(Arrays.toString(people));
			
		// COmparator
			PersonComparator comparator = new PersonComparator();
			
		// Sort by name because thats what the comparator is doing
		// Arrays.sort(array, howYouWantToSortTheArray);
			Arrays.sort(people, comparator);
			System.out.println(Arrays.toString(people));
	}

}
