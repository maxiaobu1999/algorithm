package com.malong.sort;

/**
 * 冒泡
 */
public class BubbleSort {
    static int[] mArr = new int[]{2, 4, 14, 5, 56, 45, 345, 6, 346, 6, 436};

    public static void main(String[] args) {
        bubbleSort(mArr);
        for (int i = 0; i < mArr.length; i++) {
            System.out.println(mArr[i]);
        }

    }

    private static void bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
