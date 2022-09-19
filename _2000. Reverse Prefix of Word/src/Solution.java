class Solution {
    public String reversePrefix(String word, char ch) {
        String s  =word.substring(0,word.indexOf(ch)+1);
        String result="";
        for(int i=s.length()-1; i>=0;i--){
            result+=s.charAt(i);
        }
        return result+word.substring(word.indexOf(ch)+1);
    }
}