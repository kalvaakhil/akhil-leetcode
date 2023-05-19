//{ Driver Code Starts
import java.util.*;
class GenIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Solution sln = new Solution();
            ArrayList<String> str = sln.genIp(s);
            Collections.sort(str);
            if(str.size() == 0)
                System.out.println(-1);
            else{
                for (String u : str) {
                    System.out.println(u);
                }
            }
        }
    }
}
// } Driver Code Ends


/*complete the Function*/

class Solution {
    public ArrayList<String> genIp(String s) {
        ArrayList<String> list = new ArrayList<>();
         if(s.length() < 4){ list.add("-1"); return list;}
        form("",s,list,0,0);
       if(list.isEmpty())list.add("-1");
       return list;
    }
    void form(String temp, String s, ArrayList<String> list,int index, int h){
        if(h == 4){
          if(temp.lastIndexOf(".") < temp.length()-1) list.add(temp);
            return;
        }
        if(index == s.length() && h < 4) return;
          for(int i = index; i < s.length(); i++){
                temp += s.charAt(i);
                int lastdotindex = temp.lastIndexOf(".");
                if(lastdotindex > -1){
                String tocheck = temp.substring(lastdotindex+1);
                if(tocheck.length() > 1 && tocheck.charAt(0) == '0') return;
                int Ipval = Integer.parseInt(tocheck);
                if( Ipval > 255) return;
                }
                else if(temp.length() > 1 && temp.charAt(0) == '0'|| Integer.parseInt(temp) > 255) return; 
                if(h < 3 || i != s.length()-1) temp +=".";
                form(temp,s,list,i+1,h+1);
                int lastdotpos = temp.lastIndexOf(".");
                temp = temp.substring(0,lastdotpos);
          }}}