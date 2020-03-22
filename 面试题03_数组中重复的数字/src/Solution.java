import java.util.HashSet;

public class Solution {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int repeat = -1;
        for (Integer integer : nums) {
            if (!set.add(integer)){
                repeat = integer;
                break;
            }
        }
        return repeat;
    }
}
