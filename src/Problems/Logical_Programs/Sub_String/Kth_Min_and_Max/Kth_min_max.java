/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problems.Logical_Programs.Sub_String.Kth_Min_and_Max;

/**
 *
 * @author agilan
 */

// Java code to implement the approach
import java.util.*;

//Custom comparator class to form the Max heap
class MinHeapComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer number1, Integer number2) {
		int value = number1.compareTo(number2);
	
		// Elements are sorted in reverse order
		if (value > 0) {
			return -1;
		}
		else if (value < 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
class MaxHeapComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer number1, Integer number2) {
		int value = number2.compareTo(number1);
	
		// Elements are sorted in reverse order
		if (value > 0) {
			return -1;
		}
		else if (value < 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
class Kth_min_max{

// Function to find kth smallest array element
static void kthSmallest(int []input, int N, int K)
{
	//For finding min element we need priority queue
	PriorityQueue<Integer> min_heap = new PriorityQueue<>(new MinHeapComparator());
        PriorityQueue<Integer> max_heap = new PriorityQueue<>(new MaxHeapComparator());
	
	for (int i = 0; i < N; ++i) {

		min_heap.add(input[i]);
               	max_heap.add(input[i]);	
                
		if (min_heap.size() > K) {                   
			min_heap.remove();
                        max_heap.remove();
		}
	}

	//Return the top of the heap as kth smallest element
        System.out.println(K+"th Smallest Element: " +min_heap.peek()) ;
        System.out.println(K+"th Largest Element: " +max_heap.peek()) ;

}

// Driver code
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter the length of the input");
        int N=scan.nextInt();
        
//	int []input = {10, 5, 4 , 3 ,48, 15, 6 , 2 , 33, 53, 10};
          int[] input=new int[N];
        System.out.println("\nEnter the Array Elements:");
        for(int i=0;i<N;i++){
            input[i]=scan.nextInt();
        
        }

        System.out.println("\nEnter the K Value");
        int K=scan.nextInt();

	// Function Call
	kthSmallest(input, N, K) ;
}
}

