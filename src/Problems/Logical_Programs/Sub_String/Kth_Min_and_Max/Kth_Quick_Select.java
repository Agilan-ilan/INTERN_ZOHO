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

// Java code for kth smallest element in an array


class Kth_Quick_Select {
	
    static int MAX=999;
	// pivot - last element 
	
	public static int partition(Integer[] arr, int l,int r,int mode)
	{
		int x = arr[r], i = l;
		for (int j = l; j <= r - 1; j++) {
                    if(mode==1){
                        if (arr[j] > x) {
				// Swapping arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				i++;
			}
                    }else{
                        if (arr[j] <= x) {
				// Swapping arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				i++;
			}
                    }
			
		}

		// Swapping arr[i] and arr[r]
		int temp = arr[i];
		arr[i] = arr[r];
		arr[r] = temp;

		return i;
	}

	
	public static int kthElement(Integer[] arr, int l,int r, int k,int mode)
	{
		// If k is less than number of elements in array
		if (k > 0 && k <= r - l + 1) {
			
			int pos = partition(arr, l, r,mode);

			// If position is same as k
			if (pos - l == k - 1)
				return arr[pos];

			// If position is more-left subarray
			if (pos - l > k - 1)
				return kthElement(arr, l, pos - 1, k,mode);

			// Else recur for right subarray
			return kthElement(arr, pos + 1, r, k - pos + l - 1,mode);
		}

		// If k is more than number of elements in array
		return MAX;
	}

        
        
	// Driver program to test above methods
	public static void main(String[] args)
	{       
                int smallest=0,largest=1;
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 4, 19, 26 };
		int k = 3;
		System.out.println(k+"' Smallest element is " + kthElement(arr, 0, arr.length - 1, k,smallest));
		System.out.println(k+"' Largest element is " + kthElement(arr, 0, arr.length - 1, k,largest));

        }
}



