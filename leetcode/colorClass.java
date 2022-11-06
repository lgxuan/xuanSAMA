class colorClass {
    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            while (nums[j++] < nums[j+1]) {
                if (j+1 > nums.length) {
                    break;
                }
            }
            int temp = nums[i];
            nums[i] = nums[j - 1];
            nums[j - 1] = temp;
        }
    }
}