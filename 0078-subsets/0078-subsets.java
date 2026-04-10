class Solution {
    List<List<Integer>>res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        findsubset(nums,0,new ArrayList<>());
        return res;
    }

    public void findsubset(int nums[],int index,List<Integer>sublist){
        //basecase
        if(index==nums.length){
            res.add(new ArrayList<>(sublist));
            return;
        }
        //pick
        sublist.add(nums[index]);
        findsubset(nums,index+1, sublist);

        //while backtracking we need to remove last element 
        sublist.remove(sublist.size()-1);

        //no pick
        findsubset(nums,index+1,sublist);
    }
}