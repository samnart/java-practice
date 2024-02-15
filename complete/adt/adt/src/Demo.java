// LINKED LIST

























// MERGE SORT

//public class Demo {
//
//    private static void mergeSort(int[] arr, int left, int right) {
//
//        if( left < right) {
//            int mid = (left + right) / 2;
//            mergeSort(arr, left, mid);
//            mergeSort(arr, mid + 1, right);
//
//            merge(arr, left, mid, right);
//        }
//
//    }
//
//    private static void merge(int[] arr, int left, int mid, int right) {
//
//        int n1 = mid - left + 1;
//        int n2 = right - mid;
//
//        int leftArr[] = new int[n1];
//        int rightArr[] = new int[n2];
//
//        for (int x = 0; x < n1; x++) {
//            leftArr[x] = arr[left + x];
//        }
//
//        for (int x = 0; x < n2; x++) {
//            rightArr[x] = arr[mid + 1 + x];
//        }
//
//        int i = 0;
//        int j = 0;
//        int k = left;
//
//        while (i < n1 && j < n2) {
//
//            if (leftArr[i] <= rightArr[j]) {
//                arr[k] = leftArr[i];
//                i++;
//            }
//            else {
//                arr[k] = rightArr[j];
//                j++;
//            }
//            k++;
//        }
//
//        while (i < n1) {
//            arr[k] = leftArr[i];
//            i++;
//            k++;
//        }
//
//        while (j < n2) {
//            arr[k] = rightArr[j];
//            j++;
//            k++;
//        }
//    }
//
//    public static void main(String[] args) {
//
//        int arr[] = {8, 5, 9, 1, 6, 7, 7, 7, 10897, 2334, 914, 932847, 928};
//
//        System.out.println("Before MERGER sort: ");
//        for (int n : arr) {
//            System.out.print(n + " ");
//        }
//
//
//        mergeSort(arr, 0, arr.length - 1);
//
//        System.out.println();
//        System.out.println("After MERGE sort: ");
//        for (int n : arr) {
//            System.out.print(n + " ");
//        }
//    }
//
//
//}
























// QUICK SORT

//public class Demo {
//    public static void main(String[] args) {
//
//        int[] arr = {5, 62, 2, 3, 111, 81, 4};
//
//        quickSort(arr, 0, arr.length - 1);
//
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//    }
//
//    public static void quickSort(int[] arr, int low, int high) {
//        if (low < high) {
//
//            int pi = partition(arr, low, high);
//
//            quickSort(arr, low, pi - 1);
//            quickSort(arr, pi + 1, high);
//        }
//    }
//
//    private static int partition(int[] arr, int low, int high) {
//        int pivot = arr[high];
//        int i = low - 1;
//
//        for (int j = low; j < high; j++) {
//            if (arr[j] < pivot) {
//                i++;
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//        int temp = arr[i + 1];
//        arr[i + 1] = arr[high];
//        arr[high] = temp;
//
//        return i + 1;
//    }
//}












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