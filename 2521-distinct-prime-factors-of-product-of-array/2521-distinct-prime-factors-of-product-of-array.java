class Solution {
    public int distinctPrimeFactors(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i:nums)
        {
            if(i%2==0)
            {
                set.add(2);
                /* Until we get odd number the loop divides with prime number 2*/
                while(i%2==0)
                {
                    i=i/2;
                }
            }
            /* Now we have only have odd numbers upon above loop execution and now we divide with odd prime numbers*/
            for(int j=3;j<=Math.sqrt(i);j+=2) // j = j + 2 makes sure only odd numbers since initial value j = 3 is odd
            {
                while(i%j==0)
                {
                        set.add(j);           
                        i/=j;
                }
            }
            if(i>2) /* Now if we have the prime number greater than 2 then it is added to the set */
                set.add(i);
        }
        return set.size();
    }
}