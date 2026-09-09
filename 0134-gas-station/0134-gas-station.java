class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        int totalcost=0;
        int n=gas.length;

        for(int i=0; i<n; i++){
            totalgas+=gas[i];
            totalcost+=cost[i];

        }
            if(totalgas<totalcost){
                return -1;
        }
            
                int startindex=0;
                int currentgas=0;
                for(int i=0; i<n; i++){

                currentgas+=gas[i]-cost[i];

                if(currentgas<0){
                    startindex=i+1;
                    currentgas=0;
                }
            }
            return startindex;
        }
}