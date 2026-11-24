class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    long newTarget = target;
                    newTarget -= nums[i];
                    newTarget -= nums[j];
                    newTarget -= nums[k];

                    int low = k + 1;
                    int high = n-1;
                    while (low <= high) {
                        int mid = low + (high - low) / 2;

                        if (nums[mid] == newTarget) {
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            list.add(nums[mid]);
                            set.add(list);
                            break;
                        } else if (nums[mid] > newTarget) {
                            high = mid - 1;
                        } else {
                            low = mid + 1;
                        }

                    }

                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>(set);

        return ans;
    }
}