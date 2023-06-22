package DSA1;
import java.util.Collections;
import java.util.PriorityQueue;

public class performRepeatedSubstractionInArr {
		// TODO Auto-generated method stub
	public static void main(String[] args) {
			int[] arr= {2,1,11,7,13};
			System.out.println(reducedArray(arr));
		}
	static int reducedArray(int[] arr) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		int diff=0;
		while(!pq.isEmpty()) {
			int highNum=pq.poll();
			int lowNum=pq.poll();
			diff=highNum-lowNum;
			if(pq.isEmpty()) {
				break;
			}
			pq.add(diff);
		}
		return diff;
	}
}


/*Problem Description
There is an array of N elements. Perform the following operation until there are one or no elements left in the array :

Remove the largest and second largest element from the array and insert their absolute difference back in the array.

Input format
There are two lines of input.

First line contains N, the number of elements.

Second line contains N space separated integers.

Output format
Print the last element left in the array.

Sample Input 1
5

2 1 11 13 7

Sample Output 1
2
 */

