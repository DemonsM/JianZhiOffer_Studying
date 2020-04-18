import org.junit.Test;

import java.util.Arrays;

public class SoluTest {
    @Test
    public void test() {
        int[] arr = {6, 5, 4, 1, 2, 3};
        Solution solution = new Solution();
        solution.exchange(arr);
        System.out.println(Arrays.toString(arr));
    }
}
