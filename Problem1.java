public class Problem1 {
        public static int findMiddleIndex(int[] nums) {
            int totalSum = 0;
            int leftSum = 0; 
    
            for (int num: nums) {
                totalSum +=num;
            }
            for (int i = 0; i < nums.length; i++) {
                if (leftSum == totalSum - leftSum - nums[i]) {
                    return i;
                }
                leftSum += nums[i];
            }
            return -1;
        }
    
        public static void main(String[] args) {
            int[] n1 = {2, 3, -1, 8, 4};
            int[] n2 = {1, -1, 4};
            int[] n3 = {2, 5};
            System.out.println(findMiddleIndex(n1)); 
            System.out.println(findMiddleIndex(n2));  
            System.out.println(findMiddleIndex(n3));  
        }
    }
    
     
