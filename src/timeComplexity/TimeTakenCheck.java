package timeComplexity;

import java.util.HashMap;

public class TimeTakenCheck {
//https://algorithms.tutorialhorizon.com/find-duplicates-in-an-given-array-in-on-time-and-o1-extra-space/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 16, 2, 4, 5, 2, 6, 7, 3, 8, 3, 4, 16 };
		// {2,3,4}
		find(arr);
	}

	public static void find(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>(); // space complexity O(n)

		for (int i = 0; i < arr.length; i++) {   //time complexity O(n)
			if (map.containsKey(arr[i])) {
				System.out.println("Array has duplicates : " + Math.abs(arr[i]));
			} else {
				map.put(arr[i], 1);
			}
		}

	}

}
