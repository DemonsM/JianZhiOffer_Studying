public class Solution {
    //暴力遍历
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int[] ints : matrix) {
            for (int j = 0; j < cols; j++) {
                if (ints[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    //若使用暴力法遍历矩阵 matrix ，则时间复杂度为 O(N*M)。
    //暴力法未利用矩阵 “从上到下递增、从左到右递增” 的特点，显然不是最优解法。
    //本题解利用矩阵特点引入标志数，并通过标志数性质降低算法时间复杂度。
    public boolean findNumberIn2DArray2(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int delRow = matrix.length - 1;
        int delCol = 0;
        while (delRow >= 0 && delCol < matrix[0].length) {
            if (matrix[delRow][delCol] > target) {
                delRow--;
            } else if (matrix[delRow][delCol] < target) {
                delCol++;
            } else {
                return true;
            }
        }
        return false;
    }
}
