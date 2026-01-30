class SecondLargest {

    public static void main(String args[]) {
        int nums[] = {1,2,3,3,4,6,7,9};
        System.out.println("Second Largest Element: " + secondlargest(nums));
    }

    public static int secondlargest(int nums[]) {   // ← added static
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > largest) {
                slargest = largest;
                largest = nums[i];
            }
            else if(nums[i] > slargest && nums[i] != largest) {
                slargest = nums[i];
            }
        }
        return slargest;
    }
}
