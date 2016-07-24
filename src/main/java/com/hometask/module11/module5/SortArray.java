package com.hometask.module11.module5;

public class SortArray {

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void quickSorting(int[] array, int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int mid = (i + j) / 2;
        while (i < j) {
            while ((i < mid) && (array[i] <= array[mid])) i++;
            while ((j > mid) && (array[mid] <= array[j])) j--;
            if (i < j) {
                swap(array, i, j);
                if (i == mid)
                    mid = j;
                else if (j == mid)
                    mid = i;
            }
        }
        quickSorting(array, start, mid);
        quickSorting(array, mid + 1, end);
    }

    public static void sortArrayQuickSort(int[] array) {
        int first = 0;
        int last = array.length - 1;
        quickSorting(array, first, last);

    }

    public static void sortArrayInsert(int[] array, int arrayLenght) {

        int i, j, value;

        for (i = 1; i < arrayLenght; i++) {
            value = array[i];
            for (j = i - 1; j >= 0 && array[j] > value; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = value;
        }
    }
}
