package code.lint.dynamic.nine;

public class UniquePaths {

    /*
    * @param m: positive integer (1 <= m <= 100)
    * @param n: positive integer (1 <= n <= 100)
    * @return: An integer
    */
    public int uniquePaths(int m, int n) {
        // write your code here

    if(m == 0 || n == 0){
        return 1;
    }

    int[][] sum = new int[m][n];

    for(int i = 0; i < m; i++){
        sum[i][0] = 1;
    }

    for(int j = 0; j < n; j++){
        sum[0][j] = 1;
    }

    for(int i = 1; i < m; i++){
        for(int j = 1; j < n; j++){
            sum[i][j] = sum[i - 1][j] + sum[i][j - 1];
        }
    }

    return sum[m-1][n-1];

    }

    // JIU ZHANG's answer

  /*  public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) {
            return 1;
        }

        int[][] sum = new int[m][n];
        for (int i = 0; i < m; i++) {
            sum[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            sum[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1];
            }
        }
        return sum[m - 1][n - 1];
    }
    */

  // Method 2
    /*
    *
    * public int uniquePaths(int m, int n) {
        int[][] f = new int[m][n];
        int i, j;
        for (i = 0; i < m; ++i) {
            for (j = 0; j < n; ++j) {
                if (i == 0 || j == 0) {
                    f[i][j] = 1;
                }
                else {
                    f[i][j] = f[i-1][j] + f[i][j-1];
                }
            }
        }

        return f[m-1][n-1];
    }
    *
    * */

    // Shuo Chang's Answer

    /*
    *
    * public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++){
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++){
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++){
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }
        return dp[m -1][n - 1];
    }
    *
    * */

}