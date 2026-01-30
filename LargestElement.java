class LargestElement {

    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 3, 5};   
        
        System.out.println("Largest Element: " + largestElement(nums));
    }

    public static int largestElement(int[] nums) {   
        int largest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        return largest;
    }
}

