package com.malong.sort;

import java.util.Scanner;

/**
 * 快排
 * 挖坑填数：https://blog.csdn.net/morewindows/article/details/6684558
 * <p>
 * 快速排序由C. A. R. Hoare在1962年提出。
 * 它的基本思想是：通过一趟排序将要排序的数据分割成独立的两部分，
 * 其中一部分的所有数据都比另外一部分的所有数据都要小，
 * 然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，
 * 以此达到整个数据变成有序序列。
 * <p>
 * 我们可以把快速排序看着三个步骤：
 * 1.选择基准值：在待排序列中，按照某种方式挑出一个元素，作为基准值。
 * 2.分割操作：以该基准值在序列中的实际位置，把序列分成两个子序列，一边是比它大的值，另外一边是比它小的值。
 * 3.递归：对两个子序列进行快排，直到序列为空或者只有一个元素。
 * <p>
 * <p>
 * 改进
 * 小数组切换插入排序：小数组插入排序比快排快
 * 三取样切分：基准点取中位数
 * 熵最优的排序：重复元素。三分分治
 * <p>
 * 如随机选择基准数，区间内数据较少时直接用另的方法排序以减小递归深度。
 */
public class QuickSort {
    static int[] mArr = new int[]{5, 4, 4, 3, 2, 1, 0, 9,5};

    public static void main(String[] args) {
        quickSort(mArr, 0, mArr.length - 1);
        for (int i = 0; i < mArr.length; i++) {
            System.out.println(mArr[i]);
        }
    }

    /**
     * 将数组的某一段元素进行划分，小的在左边，大的在右边
     * left为基准值
     * <p>
     * 挖坑填数
     * <1> 首先从数列的右边开始往左找，设下标为i，也就是i--操作，找到第一个比基准数小的值，让他与基准数交换；
     * <2> 接着开始从左往右找，设下标为j，也就是j++，找到第一个比基准数大的值，让他与基准数交换位置；
     * <3> 重复1和2，直到i和j相遇时结束，最后基准值所在位置为k。
     *
     * @param arr   整个数组
     * @param left  起始指针，左角标
     * @param right 终止指针，右角标
     * @return 分割点角标
     */
    private static int partition(int[] arr, int left, int right) {
        // 1、挖坑：左1作为基准值，
        int base = arr[left];
        // start一旦等于end，就说明左右两个指针合并到了同一位置，可以结束此轮循环。
        //一趟排序，找到比基准值大的在基准值右，比基准值小的在基准值左
        while (left < right) {
            //  2、从右往左扫描，找到第一个比base小的
            while (base <= arr[right] && left < right) {
                --right;// 比base大，所以指针左移
            }
            // 当前指针在右边第一个比base大的上面/
            // 或两个指针重合：任何时候重合了，说明拆分完毕

            // 3、填坑：当基准数大于了 arr[right]，
            if (left < right) {
                arr[left] = arr[right];//交换右扫描第一个比基准值小的数
                ++left;//left标记右移一位
            }
            // 4、从左往右扫描，找比基准值大的
            while (base >= arr[left] && left < right) {//从左往右扫，如果元素比基准值小
                ++left; //则左标记++，直到找到第一个比基准值大的，停止扫描
            }
            // 5、填坑：现在是 arr[right]
            if (left < right) {
                arr[right] = arr[left];//交换左扫描第一个比基准值大的数
                --right;//right标记左移一位
            }
        }
        // 6、左右重合。
        // 退出时，left等于right。将基准值填到这个坑中。此时基准值左右两侧相对有序
        arr[left] = base;//此时left为中间位置k
        return left;
    }

    /**
     * @param arr
     * @param left
     * @param right
     */
    private static void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;// 区间只剩一个数了，不用排了
        // 分区，小的放左面，大的放右面
        int mid = partition(arr, left, right);
        // 分治，对左右区间重复第二步，直到各区间只有一个数
        quickSort(arr, left, mid);//左侧按照快排思路，递归
        quickSort(arr, mid + 1, right);//右侧按照快排思路，递归
    }

//    static   void fastSort(String[] strs, int l, int r) {
//         if(l >= r) return;
//         int i = l, j = r;
//         String tmp = strs[i];
//         while(i < j) {
//             while((strs[j] + strs[l]).compareTo(strs[l] + strs[j]) >= 0 && i < j) j--;
//             while((strs[i] + strs[l]).compareTo(strs[l] + strs[i]) <= 0 && i < j) i++;
//             tmp = strs[i];
//             strs[i] = strs[j];
//             strs[j] = tmp;
//         }
//         strs[i] = strs[l];
//         strs[l] = tmp;
//         fastSort(strs, l, i - 1);
//         fastSort(strs, i + 1, r);
//     }


}
