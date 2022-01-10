import java.util.*;

public class priority_Names{
	public static void main(String[] args) {
		PriorityQueue<String> queue1 = new PriorityQueue<>(Arrays.asList("Darshan", "Rohan", "Anirban", "Sankalp", "Sanskrita", "Atrijo"));
		PriorityQueue<String> queue2 = new PriorityQueue<>(Arrays.asList("Anirban", "Palak", "Rohan", "Shruti", "Satya"));

		System.out.println("Set 1 : " + queue1);
		System.out.println("Set 2 : " + queue2);
		System.out.println("Union of sets: " + union(queue1, queue2));
		System.out.println("Difference of sets: " + difference(queue1, queue2));
		System.out.println("Intersection of sets: " + intersection(queue1, queue2));
	}
	private static <T> PriorityQueue<T> union(PriorityQueue<T> set1, PriorityQueue<T> set2) {
		PriorityQueue<T> union = new PriorityQueue<>(set1);
		union.addAll(set2); 
		return union;
	} 

	private static <T> PriorityQueue<T> difference(PriorityQueue<T> set1, PriorityQueue<T> set2) {
		PriorityQueue<T> difference = new PriorityQueue<>(set1);
		difference.removeAll(set2);
		return difference;
	}
	private static <T> PriorityQueue<T> intersection(PriorityQueue<T> set1, PriorityQueue<T> set2) {
		PriorityQueue<T> intersection = new PriorityQueue<>(set1);
		intersection.retainAll(set2);
		return intersection;
	}
}