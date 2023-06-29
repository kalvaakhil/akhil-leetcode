//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.minSwaps(n, A);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends

class Pair{
    int ele;
    int index;
    public Pair(int ele, int index){
        this.ele=ele;
        this.index=index;
    }
}

class Solution {
    
    public static int minSwaps(int n, int[] A) {
        ArrayList <Integer> ino= new ArrayList <>();
        InOrder(ino, A, 0);
        return countSwaps(ino);
    }
    
    private static void InOrder(ArrayList <Integer> ino, int [] A, int i){
        if(i>=A.length) return;
        
        InOrder(ino, A, 2*i+1);
        ino.add(A[i]);
        InOrder(ino, A, 2*i+2);
        
    }
    
    private static int countSwaps(ArrayList <Integer> ino) {
        int n=ino.size(); 
        Pair [] arr= new Pair[n];
        
        for(int i=0; i<n; i++){
            arr[i]=new Pair(ino.get(i), i);
        }
        
        int c=0;
        
        Arrays.sort(arr, new Comparator <Pair>(){
            public int compare(Pair p1, Pair p2){
                return Integer.compare(p1.ele, p2.ele);
            }});
            
     for(int i=0; i<n; i++){
         
        if(i==arr[i].index){
            continue;
        }
         else{
             c++;
             swap(arr, i, arr[i].index);
             i--;
         }
     }   
     return c;
    }
    
    private static void swap(Pair [] arr, int index1, int index2){
        
        int tempval=arr[index1].ele;
        int tempind=arr[index1].index;
        
        arr[index1].ele= arr[index2].ele;
        arr[index1].index=arr[index2].index;
        
        arr[index2].ele=tempval;
        arr[index2].index=tempind;
    }

}