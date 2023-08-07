class Solution {
    public String[] splitMessage(String message, int limit) {
        try{
            for(int parts=1;parts<=100000;parts++)
            {
                int extralen=(3+Integer.toString(parts).length())*parts;
                int extra=0;
                if(parts>=10000)
                    extra=9+90*2+900*3+9000*4+1*5;
                else if(parts>=1000)
                    extra=9+90*2+900*3+(parts-1000+1)*4;
                else if(parts>=100)
                    extra=9+90*2+(parts-100+1)*3;
                else if(parts>=10)
                    extra=9+(parts-10+1)*2;
                else
                    extra=parts;
                extralen+=extra;
                int totallen=extralen+message.length();
                if((limit*(parts-1)<totallen)&&(totallen-limit*(parts-1)<=limit))
                {
                    String ans[]=new String[parts];
                    int i=0;
                    for(int currpart=0;currpart<ans.length;currpart++)
                    {
                        String num=Integer.toString(currpart+1);
                        String deno=Integer.toString(parts);
                        String suffix="<"+num+"/"+deno+">";
                        int len=limit-suffix.length();
                        if(currpart==ans.length-1)
                            ans[currpart]=message.substring(i,message.length())+suffix;
                        else
                            ans[currpart]=message.substring(i,i+len)+suffix;
                        i+=len;
                    }
                    return ans;
                }
            }
        }catch(Exception e)
        {
            return new String[0];
        }
        return new String[0];
    }
}