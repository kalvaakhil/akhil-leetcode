//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            List<Integer> ans = obj.maxCombinations(n, k, a, b);
            for (int e : ans) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        // code here
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        HashSet<Pair> set = new HashSet<>();
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0;i<N/2;i++) {
            swap(A, i, N-1-i);
            swap(B, i, N-1-i);
        }
        
        set.add(new Pair(0, 0));
        pq.add(new Triplet(A[0] + B[0], 0, 0));
        
        List<Integer> list = new ArrayList<>();
        
        for(int k=0;k<K;k++) {
            Triplet top = pq.remove();
            int i = top.i;
            int j = top.j;
            
            list.add(top.sum);
            
            if(i+1 < N && !set.contains(new Pair(i+1, j))) {
                set.add(new Pair(i+1, j));
                pq.add(new Triplet(A[i+1] + B[j], i+1, j));
            }
            
            if(j+1 < N && !set.contains(new Pair(i, j+1))) {
                set.add(new Pair(i, j+1));
                pq.add(new Triplet(A[i] + B[j+1], i, j+1));
            }
        }
        
        return list;
    }
    
    static class Triplet implements Comparable<Triplet> {
        int sum;
        int i;
        int j;
        
        Triplet(int sum, int i, int j) {
            this.sum = sum;
            this.i = i;
            this.j = j;
        }
        
        public int compareTo(Triplet t) {
            return t.sum - this.sum;
        }
    }
    
    public static class Pair {
        int i;
        int j;
        
        Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (!(obj instanceof Pair)) return false;
            Pair pair = (Pair) obj;
            return pair.i == i && pair.j == j;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }
    }
    
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
