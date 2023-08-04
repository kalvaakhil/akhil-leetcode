class Solution {
    HashMap<String,Boolean> hmap=new HashMap<>();
    public boolean wordBreak(String s, List<String> dict) {
        if(dict.contains(s)){
            return true;
        }
        if(hmap.containsKey(s)){
            return hmap.get(s);
        }
        for(int i=1;i<s.length();i++){
            String x=s.substring(0,i);
            if(dict.contains(x) && wordBreak(s.substring(i),dict))
            {
                hmap.put(s,true);
                return true;
            }
        }
        hmap.put(s,false);
        return false;
    }
}