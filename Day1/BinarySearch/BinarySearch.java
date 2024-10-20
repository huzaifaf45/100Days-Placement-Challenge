package Day1.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 9, 15, 17 };
        int target = 17;

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index: " + result);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
                mid = (start + end) / 2;
            } else {
                end = mid - 1;
                mid = (start + end) / 2;
            }
        }

        return -1;
    }
}
