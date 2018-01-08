package code.lint.nine.dynamic;

import java.util.regex.Matcher;

public class DropEggsII {

    /*
    *
    * There is a building of n floors. If an egg drops from the k th floor or above,
    * it will break. If it's dropped from any floor below, it will not break.

You're given m eggs, Find k while minimize the number of drops for the worst case.
 Return the number of drops in the worst case.

Have you met this question in a real interview? Yes
Example
Given m = 2, n = 100 return 14
Given m = 2, n = 36 return 8
    *
    * */

    /*
    * @param m: the number of eggs
    * @param n: the number of floors
    * @return: the number of drops in the worst case
    */
    public int dropEggs2(int m, int n) {
        // write your code here
      int[][] dp = new int[m+1][n+1];

      for(int i = 1; i <= m; ++i){
          dp[i][1] = 1;
          dp[i][0] = 0;
      }

      for(int j = 1; j <= n; ++j){
          dp[1][j] = j;
      }

      for( int i = 2; i <= m; ++i){
          for(int j = 2; j <= n; ++j){
              dp[i][j] = Integer.MAX_VALUE;
              for(int k = 1; k <= j; ++k){
                  dp[i][j] = Math.min(dp[i][j],
                          1 + Math.max(dp[i-1][k-1], dp[i][j - k]));
              }
          }
      }

      return dp[m][n];
    }

    // JIU ZHANG's Answer

    /*
    *  public int dropEggs2(int m, int n) {
        // Write your code here
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; ++i) {
            dp[i][1] = 1;
            dp[i][0] = 0;
        }

        for (int j = 1; j <= n; ++j)
            dp[1][j] = j;

        for (int i = 2; i <= m; ++i) {
            for (int j = 2; j <= n; ++j) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = 1; k <= j; ++k) {
                    dp[i][j] = Math.min(dp[i][j],
                        1 + Math.max(dp[i - 1][k - 1], dp[i][j - k]));
                }
            }
        }

        return dp[m][n];
    }
    *
    * */


}
