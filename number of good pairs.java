class Solution {
    public int numIdenticalPairs(int[] nums) {
        int arrlength = nums.length;
        int i=0, j=0;
        int count = 0;
       for(i=0; i<arrlength; i++){

        for(j=i+1; j<arrlength; j++){
            if(nums[i]==nums[j])
            {
                count++;
                
            }         
        }
       }
        return count;
    }
}
