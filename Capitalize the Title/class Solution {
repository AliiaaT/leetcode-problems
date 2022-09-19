class Solution {
    public String capitalizeTitle(String title) {
        // String result = "";
        StringBuffer result = new StringBuffer();
        String [] s=title.split(" ");
        // System.out.println(Arrays.toString(s));
        for(int i=0;i<s.length;i++){
            
            System.out.println(Arrays.toString(s));
            if(s[i].length() == 1 || s[i].length() == 2){
                
                // s[i] = s[i].toLowerCase();
                // result+=s[i]+" ";
                result.append(s[i].toLowerCase());
                result.append(" ");
            }else{
                // s[i] = s[i].substring(0,1).toUpperCase()+s[i].substring(1).toLowerCase();
                // result+=s[i]+" ";
                result.append(s[i].substring(0,1).toUpperCase()+s[i].substring(1).toLowerCase());
                result.append(" ");
            }
        }
        result.deleteCharAt(result.length()-1);  
        return result.toString();
        
    }
}