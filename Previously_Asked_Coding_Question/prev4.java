package Previously_Asked_Coding_Question;

import java.util.ArrayList;

public class prev4 {
    public static void main(String[] args) {
        int[] nums = { 3, 4, -7, 1, 3, 3, 1, -4 };
        int target = 7;
        int n = nums.length;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            int total = 0;
            for (int j = i; j < n; j++) {
                temp.add(nums[j]);
                total += nums[j];
                if (total == target) {
                    System.out.println(temp);
                    list.add(new ArrayList<>(temp));
                }
            }
        }
        System.out.println(list);

    }

}
