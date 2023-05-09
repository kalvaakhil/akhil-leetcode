class Solution {
    public int countPrimes(int n) {
        
        int count = 0;
        
        boolean[] isprime = new boolean[n];
        
        Arrays.fill(isprime, true); //mark all numbers as prime
        
        for(int i=2; i*i<=isprime.length; i++){ //1 is not a prime number
            if(isprime[i]==true){
                //making multiples not prime
                for(int j=i+i; j<isprime.length; j=j+i){
                    isprime[j]=false; //not prime
                    }
                }
            }
        
        //count prime numbers
        for(int i=2; i<n; i++){
            if(isprime[i]==true){
                count++;
                }
            }
        return count;
    }
}