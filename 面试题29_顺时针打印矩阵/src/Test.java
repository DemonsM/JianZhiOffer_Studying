import java.util.Arrays;

public class Test {
    @org.junit.Test
    public void test() {
        Solution solution = new Solution();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] ints = solution.spiralOrder(matrix);
        System.out.println(Arrays.toString(ints));
    }
}
