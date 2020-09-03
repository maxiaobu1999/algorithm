package com.malong.find;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 16, 45, 48, 78};
        int i = binarySearch(arr, 0, arr.length - 1, 4);
        System.out.println(i);
    }

    /**
     * 递归
     *
     * @param arr
     * @param low    角标
     * @param high   角标
     * @param target 目标值
     * @return
     */
    public static int binarySearch(int[] arr, int low, int high, int target) {
        if (target < arr[low] || target > arr[high] || low > high) {
            return -1;
        }
        int mid = (high - low) / 2;
        if (arr[mid] < target) {
            // 在右侧
            return binarySearch(arr, mid + 1, high, target);
        } else if (arr[mid] > target) {
            // 在左侧
            return binarySearch(arr, low, mid - 1, target);
        } else {
            // 找到了
            return mid;
        }
    }
}
