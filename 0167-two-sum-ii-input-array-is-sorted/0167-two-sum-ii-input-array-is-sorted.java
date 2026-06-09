class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int sum=0;
        int start=0;
        int end=n-1;
        while(start < end){
             sum=numbers[start]+numbers[end];

            if(sum==target){
                return new int[] {start+1, end+1};
            }
 
           else if(sum<target){
                start++;
            }
            else{
                end--;
            }
        }
        return new int[]{n};
    }
}
