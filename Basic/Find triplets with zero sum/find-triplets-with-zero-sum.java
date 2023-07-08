//{ Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/

// { Driver Code Starts
// import java.util.*;
// class Triplets{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int t=sc.nextInt();
//         while(t-->0){
//             int n=sc.nextInt();
//             int[] a=new int[n];
//             for(int i=0;i<n;i++){
//                 a[i]=sc.nextInt();
//             }
//             Solution g=new Solution();
//             if(g.findTriplets(a,n))
//                 System.out.println("1");
//             else
//                 System.out.println("0");
//         }
//     }
// }
// } Driver Code Ends

/*Complete the function below*/

class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
    public boolean findTriplets(int arr[] , int n)
    {
        // Sorting the array in ascending order.
        Arrays.sort(arr);

        // Fixing the first element and using two-pointer approach
        // for the remaining elements.
        for (int i = 0; i < n - 2; i++) {
            // Two pointers, one pointing to the next element and
            // the other pointing to the last element.
            int left = i + 1;
            int right = n - 1;

            // Checking for triplets with the current fixed element.
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0)
                    return true; // Triplet with zero sum found.

                if (sum < 0)
                    left++; // Sum is less than zero, incrementing left pointer.
                else
                    right--; // Sum is greater than zero, decrementing right pointer.
            }
        }

        return false; // No triplet with zero sum found.
    }
}