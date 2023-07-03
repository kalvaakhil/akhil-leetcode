class Solution {
    public boolean isItPossible(String word1, String word2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i = 0; i < word1.length(); i++){
            char ch = word1.charAt(i);
            int idx = ch - 'a';
            arr1[idx] = arr1[idx] + 1;     // count the frequency of character in word1
        }
        for(int i = 0; i < word2.length(); i++){
            char ch = word2.charAt(i);
            int idx = ch - 'a';
            arr2[idx] = arr2[idx] + 1;  // count the frequency of character in word2
        }

        
        for(int i = 0; i < 26; i++){
            for(int j = 0; j < 26; j++){
                if(arr1[i] > 0 && arr2[j] > 0){                  // both indices should have frequency greater than 0 for swapping
						arr1[j] = arr1[j] + 1;                        // take the one character of  word2 from arr2 and put into arr1              
                    arr1[i] = arr1[i] - 1;                          // basically we are swapping here 
                    arr2[i] = arr2[i] + 1;
                    arr2[j] = arr2[j] - 1;
                    int temp1 = 0;
                    int temp2 = 0;
                    for(int k = 0; k < 26; k++){
                        if(arr1[k] != 0){                                // here checking number of different characters
                            if(arr1[k] > 0)
                            temp1++;
                        }
                        if(arr2[k] != 0){
                            if(arr2[k] > 0)
                            temp2++;
                        }
                        
                    }
                    if(temp1 == temp2){ 
                          return true;
                    }
                    arr1[j] = arr1[j] - 1;
                    arr1[i] = arr1[i] + 1;
                    arr2[i] = arr2[i] - 1;
                    arr2[j] = arr2[j] + 1;
                }
            }
        }
        return false;
        
    }
}