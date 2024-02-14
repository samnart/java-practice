
// QUICK SORT

public class Demo {
    public static void main(String[] args) {}
}












// INSERTION SORT

//public class Demo {
//
//    public static void main(String[] args) {
//
//        int[] arr = {5, 6, 2, 3, 1};
//
//        for (int i = 1; i < arr.length; i++) {
//            int key = arr[i];
//            int j = i - 1;
//
//            while (j >= 0 && arr[j] > key) {
//                arr[j + 1] = arr[j];
//                j--;
//            }
//            arr[j+ 1] = key;
//        }
//        for (int n : arr)
//            System.out.print(n + " ");
//    }
//}










// SELECTION SORT

//public class Demo {
//
//    public static void main(String[] args) {
//
//        int[] nums = {6, 5, 2, 8, 9, 4};
//        int size = nums.length;
//        int temp = 0;
//        int minIndex = -1;
//
//        System.out.println("Before sorting: ");
//        for(int num : nums) {
//            System.out.print(num + " ");
//        }
//
//        for (int i = 0; i < size - 1; i++) {
//            minIndex = i;
//            for (int j = i + 1; j < size; j++) {
//                if (nums[minIndex] > nums[j])
//                    minIndex = j;
//            }
//            temp = nums[minIndex];
//            nums[minIndex] = nums[i];
//            nums[i] = temp;
//        }
//
//        System.out.println();
//        System.out.println("After sorting: ");
//        for (int num: nums) {
//            System.out.print(num + " ");
//        }
//    }
//}


// BUBBLE SORTING

//public class Demo {
//    public static void main(String[] args) {
//
//        int nums[] = {6, 5, 2, 8, 9, 4};
//        int size = nums.length;
//        int temp = 0;
//
//        System.out.println("Before sorting: ");
//
//        for (int numm : nums) {
//            System.out.print(numm + " ");
//        }
//
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size - i - 1; j++) {
//                if (nums[j] > nums[j + 1]) {
//                    temp = nums[j];
//                    nums[j] = nums[j + 1];
//                    nums[j + 1] = temp;
//                }
//            }
//        }
//
//
//
//
//
//        System.out.println();
//        System.out.println("After sorting: ");
//        for (int num : nums) {
//            System.out.print(num + " ");
//        }
//
//
//
//
//
//    }
//}
//









// Binary Search and Linear Search

//public class Demo {
//
//    public static void main(String[] args) {
//
//        int[] nums = {5, 7, 9, 11, 13};
//        int target = 5;
//
//        int result = linearSearch(nums, target);
//        int result1 = binarySearch(nums, target, 0, nums.length - 1);
//
//        if (result1 != -1)
//            System.out.println("Element found at Index: " + result1);
//        else
//            System.out.println("Element not found");
//    }
//
//    public static int linearSearch(int[] nums, int target) {
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                return i;
//            }
//        }
//
//        return -1;
//    }
//
//    public static int binarySearch(int[] nums, int target, int left, int right) {
//
//        if (left <= right) {
//            int mid = (left + right) / 2;
//
//            if (nums[mid] == target) {
//                return mid;
//            } else if (nums[mid] < target) {
//                return binarySearch(nums, target, mid+1, right);
//            } else {
//                return binarySearch(nums, target, left, mid-1);
//            }
//        }
//
//
//
//
//
////        int left = 0;
////        int right = nums.length - 1;
//
////        while (left <= right) {
////            int mid = (left + right) / 2;
////
////            if (nums[mid] == target) {
////                return mid;
////            } else if (nums[mid] < target) {
////                left = mid + 1;
////            } else {
////                right = mid - 1;
////            }
////        }
//
//        return -1;
//    }
//
//}