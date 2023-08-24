class Solution {
   
    public String reorderSpaces(String text) {
        //add space in end  & start:
        text= ' ' +text +' ';
        
// create string builder ans copy original string
        StringBuilder res = new StringBuilder(text);
        // this is for answer 
        StringBuilder ans = new StringBuilder();

// in --cnt -- we  count the _ _ _space; 
        int cnt =0;
        ArrayList<String> arr = new ArrayList<String>();

        int i=0;

        while(i<text.length()-1){

            if(res.charAt(i)==' ' && i!=0){
                cnt++;
            }


            if(res.charAt(i+1) !=' '){
                int ft =i+1;
                i+=1;
                while(res.charAt(i) !=' '){
                    i++;
                }
                String val = res.substring(ft, i);
                arr.add(val);

            }
            else{
                i++;

            }




        }
        int sp=0;
            if(arr.size()-1 !=0 &&text.length()-1 !=0){
         sp = cnt/(arr.size()-1); 
            }


        for(String j:arr){
            ans.append(j);
            for(int k =0; k<sp;k++){
                ans.append(' ');
            }
        }
         int rem =0;
if(arr.size()-1 !=0){
   rem = cnt%(arr.size()-1);
}
if(arr.size()==1) rem =cnt;
        String res1 = ans.toString().trim();
        for(int j =0; j<rem; j++){
            res1 +=' ';
        }
 return res1;


    }
}