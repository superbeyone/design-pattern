package com.superbeyone.design;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className AlgorithmTests
 * @description 算法
 * @date 2019-09-16 08:45
 **/

public class AlgorithmTests {

    /**
     * 冒泡排序
     */
    @Test
    public void sortTest1() {
        int[] array = {3, 4, 2, 1, 5, 6, 7, 8};
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSorted = true;
            int sortBorder = array.length - 1;
            for (int j = 0; j < sortBorder; j++) {
                int tmp = 0;
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;

                    isSorted = false;
                    sortBorder = j;
                }
            }

            if (isSorted) {
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * 鸡尾酒排序 （双向排序）
     */
    @Test
    public void sortTest2() {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 1};
        int tmp;
        for (int i = 0; i < array.length / 2; i++) {
            boolean isSorted = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    isSorted = false;
                }
            }

            if (isSorted) {
                break;
            }

            isSorted = true;
            for (int j = array.length - i - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }

        System.out.println(Arrays.toString(array));
    }


    /**
     * 快速排序 (双边循环法)
     */
    @Test
    public void sortTest3() {
        int[] arr = {4, 4, 6, 5, 3, 2, 8, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private void quickSort(int[] arr, int startIndex, int endIndex) {

        if (startIndex >= endIndex) {
            return;
        }
        int partitionIndex = partition(arr, startIndex, endIndex);
        quickSort(arr, startIndex, partitionIndex - 1);
        quickSort(arr, partitionIndex + 1, endIndex);
    }

    private int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[startIndex];
        int left = startIndex;
        int right = endIndex;

        while (left != right) {
            while (left < right && arr[right] > pivot) {
                right--;
            }

            while (left < right && arr[left] <= pivot) {
                left++;
            }

            if (left < right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }

        arr[startIndex] = arr[left];
        arr[left] = pivot;

        return left;
    }


    /**
     * 快速排序 (单边循环法)
     */
    @Test
    public void sortTest4() {
        int[] arr = {4, 4, 6, 5, 3, 2, 8, 1};
        quickSort2(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private void quickSort2(int[] arr, int startIndex, int endIndex) {

        if (startIndex >= endIndex) {
            return;
        }
        int partitionIndex = partition2(arr, startIndex, endIndex);
        quickSort2(arr, startIndex, partitionIndex - 1);
        quickSort2(arr, partitionIndex + 1, endIndex);
    }

    private int partition2(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[startIndex];
        int mark = startIndex;
        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (arr[i] < pivot) {
                mark++;
                int tmp = arr[mark];
                arr[mark] = arr[i];
                arr[i] = tmp;
            }
        }

        arr[startIndex] = arr[mark];
        arr[mark] = pivot;
        return mark;
    }


    /**
     * 快速排序 非递归实现
     */
    @Test
    public void sortTest5() {
        int[] arr = {4, 7, 6, 5, 3, 2, 8, 1};
        quickSort3(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private void quickSort3(int[] arr, int startIndex, int endIndex) {
        //用一个集合栈来代替递归的函数栈
        Stack<Map<String, Integer>> quickSortStack = new Stack<>();
        //整个数列的起止下标，以哈希的形式入栈
        Map rootParam = new HashMap();
        rootParam.put("startIndex", startIndex);
        rootParam.put("endIndex", endIndex);
        quickSortStack.push(rootParam);

        //循环结束条件： 栈为空时
        while (!quickSortStack.isEmpty()) {
            //栈顶元素出栈，得到起止下标
            Map<String, Integer> param = quickSortStack.pop();
            //得到基准元素位置
            int pivotIndex = partition3(arr, param.get("startIndex"), param.get("endIndex"));
            //根据基准元素分为两部分，把每一部分的起止下标入栈
            if (param.get("startIndex") < pivotIndex - 1) {
                Map<String, Integer> leftParam = new HashMap<>();
                leftParam.put("startIndex", param.get("startIndex"));
                leftParam.put("endIndex", pivotIndex - 1);
                quickSortStack.push(leftParam);
            }

            if (pivotIndex + 1 < param.get("endIndex")) {
                Map<String, Integer> rightParam = new HashMap<>();
                rightParam.put("startIndex", pivotIndex + 1);
                rightParam.put("endIndex", param.get("endIndex"));
                quickSortStack.push(rightParam);
            }

        }
    }

    /**
     * 分治 (单边循环法)
     *
     * @param arr        待交换的数组
     * @param startIndex 起始下标
     * @param endIndex   结束下标
     * @return
     */
    private int partition3(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[startIndex];
        int mark = startIndex;

        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (arr[i] < pivot) {
                mark++;
                int tmp = arr[mark];
                arr[mark] = arr[i];
                arr[i] = tmp;
            }
        }

        arr[startIndex] = arr[mark];
        arr[mark] = pivot;
        return mark;
    }

    /**
     * 堆排序
     */
    @Test
    public void sortTest6() {
        int[] arr = {1, 3, 2, 6, 5, 7, 8, 9, 10, 0};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    /**
     * '下沉' 调整
     *
     * @param arr         待调整的堆
     * @param parentIndex 要'下沉'的父节点
     * @param length      堆的有效大小
     */
    private void downAdjust(int[] arr, int parentIndex, int length) {
        //tmp 保存父节点值，用于最后的赋值
        int tmp = arr[parentIndex];
        int childIndex = 2 * parentIndex + 1;

        while (childIndex < length) {
            //如果有孩子，且右孩子大于左孩子的值，则定位到右孩子
            if (childIndex + 1 < length && arr[childIndex + 1] > arr[childIndex]) {
                childIndex++;
            }

            //如果父节点小于任何一个孩子的值，则直接跳出
            if (tmp >= arr[childIndex]) {
                break;
            }
            //无须真正交换，单项赋值即可
            arr[parentIndex] = arr[childIndex];
            parentIndex = childIndex;
            childIndex = 2 * childIndex + 1;
        }
        arr[parentIndex] = tmp;
    }

    /**
     * 堆排序（升序）
     *
     * @param arr 待调整的堆
     */
    private void heapSort(int[] arr) {
        //1. 把无序数组构建成最大堆
        for (int i = arr.length / 2; i >= 0; i--) {
            downAdjust(arr, i, arr.length - 1);
        }
        System.out.println(Arrays.toString(arr));
        //2. 循环删除堆顶元素，移到集合尾部，调整堆产生新的堆顶
        for (int i = arr.length - 1; i > 0; i--) {
            //最后一个元素和第一个元素进行交换
            int tmp = arr[i];
            arr[i] = arr[0];
            arr[0] = tmp;
            //'下沉'调整最大堆
            downAdjust(arr, 0, i);
        }

    }


}
