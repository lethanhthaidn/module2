package ss13_LinearSearch_BinarySearch.Thuc_hanh;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] list, int key) {
        int left = 0;
        int right = list.length - 1;
        while (right >= left) {
            int mid = (left + right) / 2;
            if (key < list[mid]) {
                right = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else
                left = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 5));
        System.out.println(binarySearch(list, 6));
        System.out.println(binarySearch(list, 3));
        System.out.println(binarySearch(list, 9));
        System.out.println(binarySearch(list, 10));
    }
}
