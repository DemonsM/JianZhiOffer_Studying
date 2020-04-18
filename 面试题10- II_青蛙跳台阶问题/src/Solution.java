//一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。 
//
// 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。 
//
// 示例 1： 
//
// 输入：n = 2
//输出：2
// 
//
// 示例 2： 
//
// 输入：n = 7
//输出：21
// 
//
// 提示： 
//
// 
// 0 <= n <= 100 
// 
//
// 注意：本题与主站 70 题相同：https://leetcode-cn.com/problems/climbing-stairs/ 
//
// 
// Related Topics 递归


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numWays(int n) {
        //起始数不同，斐波那契数列f0=0，f1=1，f2=2
        /*public int fib(int n) {
            int a = 0, b = 1, sum;面试题11. 旋转数组的最小数字
            for (int i = 0; i < n; i++) {
                sum = (a + b) % 1000000007;
                a = b;
                b = sum;
            }
            return a;
        }*/
        //上楼梯f0=1，f1=1，f2=2
        int a = 1, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
