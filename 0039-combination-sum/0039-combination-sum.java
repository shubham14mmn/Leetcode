class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>result=new ArrayList<>();
        backtrack(0,candidates,target,new ArrayList<>(),result);
        return result;
    }

    public void backtrack(int start, int[] candidates,int target,List<Integer>current, List<List<Integer>>result){

        //base case
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }

        //invalid case
        if(target<0){
            return;
        }

        for(int i=start; i<candidates.length; i++){
            //choose element
            current.add(candidates[i]);

            //stay on same index
            backtrack(i,candidates,target-candidates[i],current, result);

            //backtrack
            current.remove(current.size()-1);
        }

    }
}