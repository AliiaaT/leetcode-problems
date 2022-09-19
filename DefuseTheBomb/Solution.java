class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        // each element
        for(int i=0; i<code.length; i++){
            if(k==0) {
                result[i]=0;
            }else if(k>0){
                // calculate sume for each element
                int j=0;
                int temp_sum=0;
                
                // for int i = current; i < length; i++;
                // for int j = 0; j < current; j++;
                while(j<k){
                    int currentIndex = ((i+1)+j) % code.length;
                    temp_sum += code[currentIndex];
                    j++;
                }
                result[i] = temp_sum;
                //////////
                for (int g=0; g < code.length; g++) {
                    System.out.print(result[g]);
                    
                    System.out.print(" ");
                }
                
                
                System.out.print("\n");
                //////
                
            }else{
                int j=0;
                int temp_sum=0;
                while(j<-1*k){
                    int currentIndex = ((i+1)+j) % code.length;
                    temp_sum += code[code.length-1-currentIndex];
                    j++;
                }
                result[code.length-1 - i] = temp_sum;
                //////////
                for (int g=0; g < code.length; g++) {
                    System.out.print(result[g]);
                    
                    System.out.print(" ");
                }
                
                
                System.out.print("\n");
                //////
            }
        }
        return result;
    }
}