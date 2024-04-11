import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class better {
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ls = new ArrayList<>();
        HashMap<Integer, Integer> mpp = new HashMap<>();

        int mini = (int) (n / 3) + 1;
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(nums[i], 0);
            mpp.put(nums[i], value + 1);
            if (mpp.get(nums[i]) == mini) {
                ls.add(nums[i]);
            }
            if (ls.size() == 2) break;
        }
        return ls;
    }

    public static void main(String args[]) {
        int[] num = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = majorityElement(num);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
