class Solution {
    public int maximalSquare(char[][] matrix) {

        int n = matrix.length;        // rows
        int m = matrix[0].length;     // columns

        int maxside = 0;

        int[][] dp = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (matrix[i][j] == '1') {

                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } 
                    else {
                        dp[i][j] = 1 + Math.min(
                            dp[i - 1][j],
                            Math.min(
                                dp[i - 1][j - 1],
                                dp[i][j - 1]
                            )
                        );
                    }

                    maxside = Math.max(maxside, dp[i][j]);
                }
            }
        }

        return maxside * maxside;
    }
}