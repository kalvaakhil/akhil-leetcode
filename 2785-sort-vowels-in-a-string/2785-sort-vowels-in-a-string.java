class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> vow=new ArrayList<>();
        ArrayList<Integer> ind=new ArrayList<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char x=s.charAt(i);
            if(x=='a'|| x== 'e'|| x=='i' ||x=='o' || x=='u'|| x=='A'|| x=='E'
 ||    x=='I' || x=='O' || x=='U')
               {
                    vow.add(x);
                   ind.add(i);
               }
        }
         Collections.sort(vow);
       char arr[]=s.toCharArray();
        for(int i=0;i<ind.size();i++){
            arr[ind.get(i)]=vow.get(i);
        }
               return new String(arr);
    }
}