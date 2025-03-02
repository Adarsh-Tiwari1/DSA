// Searching : Searching is the process of finding specific element , array, collection, List.
// Types : Linear Search, Binary Search

/*
class Searching {
    public static int BinarySearch(int arr[] , int search){
        int low = 0;
        int heigh = arr.length-1;
        int result = -1;
        while(low < heigh){
            int mid = (low + heigh) / 2;
            if(arr[mid] == search){
                result = mid+1;
                break;
            }
            else if(search > arr[mid]){
                heigh = mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {20,50,7060,8};
        int search = 50;
        int result = BinarySearch(arr, search);
        if(result >= 1){
            System.out.println("Searching Successful : Element found at position " + result);
        }else{
            System.out.println("Searching UnSuccessful : Element Not found");
        }
    }
}
*/

/*
class Searching {
    // Method to perform binary search
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // Check if target is present at mid
            if (array[mid] == target) {
                return mid;
            }
            // If target is greater, ignore left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        // Target is not present in the array
        return -1;
    }
    // Main method to test the binary search
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40};
        int target = 10;

        int result = binarySearch(array, target);

        if (result == -1) {
            System.out.println("Element not present in the array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
*/

