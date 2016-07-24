package com.hometask.module11.module5;

public class Counting {
    public static int calculateMaxValue(int[] arrays) {

        for (int i = 0; i < arrays.length - 1; i++) {

            for (int j = 0; j < arrays.length - i - 1; j++) {
                if (arrays[j] < arrays[j + 1]) {
                    int tmp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = tmp;

                }
            }
        }

        return arrays[0];
    }

    public static int calculateMinValue(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int mini = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    mini = j;
                }
            }
            if (i != mini) {
                int tmp = array[i];
                array[i] = array[mini];
                array[mini] = tmp;
            }
        }
        return array[0];
    }
}



