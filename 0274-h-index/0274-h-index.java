class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int h=0;

        Arrays.sort(citations);

        for(int i=n-1; i>=0; i--){
            int position=n-i;

            if(citations[i]>=position){
            h=position;
        }
        else{
            break;
        }
        }
        return h;
        
    }
}