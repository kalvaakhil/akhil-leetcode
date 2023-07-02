class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        boolean[] prime = new boolean[n + 1]; // Array to store whether a number is prime or not
        List<List<Integer>> ans = new ArrayList<>(); // List to store the pairs of prime numbers
        
        // Initializing all numbers as prime
        for (int i = 2; i <= n; i++) {
            prime[i] = true;
        }
        
        prime[1] = false; // 1 is not a prime number
        prime[0] = false; // 0 is not a prime number
        
        // Finding prime numbers using the Sieve of Eratosthenes algorithm
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                // Marking multiples of p as non-prime
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        
        for (int i = 2; i <= n - 1; i++) {
            int j = n - i; // Finding the complement of i to make the sum n
            if (prime[i] && prime[j] && i <= j) {
                List<Integer> temp = new ArrayList<>(); // Creating a pair of prime numbers
                temp.add(i);
                temp.add(j);
                ans.add(temp); // Adding the pair to the result list
            }
        }
        
        return ans; // Returning the list of prime pairs
    }
}