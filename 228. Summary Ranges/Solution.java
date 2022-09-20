class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result= new ArrayList<>();
        if(nums.length==0) return result; // if the nums is empty then return just an empty result array
        int a=nums[0];
        for(int i=0; i<nums.length; i++){
            if(i== nums.length - 1||nums[i+1]!=nums[i]+1){
                if(nums[i]!=a) result.add(a+"->"+nums[i]);
                else result.add(a+"");
                if(i!= nums.length-1) a =nums[i+1];
            }
            }
        return result;
    }
}