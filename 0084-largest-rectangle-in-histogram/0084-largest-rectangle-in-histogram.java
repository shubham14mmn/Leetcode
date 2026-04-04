class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int n=heights.length;
        Stack<Integer>s=new Stack<>();
        int maxarea=0;

        for(int i=0; i<=n; i++){
            int currheight=(i==n)?0:heights[i];

            while(!s.isEmpty() && currheight<heights[s.peek()]){
                int height=heights[s.pop()];

                int right=i;
                int left=s.isEmpty() ? -1:s.peek();
                int width=right-left-1;

                int area=height*width;
                maxarea=Math.max(maxarea,area);
              
            }
              s.push(i);
           
        }
         return maxarea;
    }
}