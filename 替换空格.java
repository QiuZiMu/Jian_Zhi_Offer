public class Solution {
    public String replaceSpace(StringBuffer str) {
        int count=0;
        int old=str.length()-1;
    	for(int i=0;i<=old;i++){
            if(str.charAt(i)==' '){
                ++count;
            }
        }
        int news=old+count*2;
        str.setLength(news+1);
        for(;old>=0&&old<=news;old--,news--){
            if(str.charAt(old)==' '){
                str.setCharAt(news--,'0');
                str.setCharAt(news--,'2');
                str.setCharAt(news,'%');
            }else{
                str.setCharAt(news,str.charAt(old));
            }
        }
        return str.toString();
    }
}