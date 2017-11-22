package code.lint.binary.two;

/*
*
*There is a building of n floors. If an egg drops from the k th floor or above, it will break. If it's dropped from any floor below, it will not break.

You're given two eggs, Find k while minimize the number of drops for the worst case. Return the number of drops in the worst case.

Have you met this question in a real interview? Yes
Clarification
For n = 10, a naive way to find k is drop egg from 1st floor, 2nd floor ... kth floor. But in this worst case (k = 10), you have to drop 10 times.

Notice that you have two eggs, so you can drop at 4th, 7th & 9th floor, in the worst case (for example, k = 9) you have to drop 4 times.

Example
Given n = 10, return 4.
Given n = 100, return 14.


*
* */
public class DropEggs {

    /*
   * @param n: An integer
   * @return: The sum of a and b
   */
    public int dropEggs(int n) {
        // write your code here

        if(n <= 0){
            return 0;
        }

        long result = 0;

        for(int i = 1; ; ++i){
            result += (long) i;
            if(result >= (long)n){
                return i;
            }
        }

    }

    // Jiu Zhang's Answer
    /*
    * public int dropEggs(int n) {
        // Write your code here
        long ans = 0;
        for (int i = 1; ; ++i) {
            ans += (long)i;
            if (ans >= (long)n)
                return i;
        }
    }
    *
    * */

    // Shuo Chang's Answer
    /*
    *
    *  public int dropEggs(int n) {
        // write your code here
     long ans = 0L;

        for(int i = 1; ; ++i){
            ans += (long)i;

            if(ans >= n){
                return i;
            }
        }
    }
    *
    * */
}
