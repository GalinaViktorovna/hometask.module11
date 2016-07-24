package com.hometask.module11.module5;

import java.io.IOException;

public class Array {
    private int[] array;
    private int lengthArray;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getLengthArray() {
        return lengthArray;
    }

    public void setLengthArray(int lengthArray) {
        this.lengthArray = lengthArray;
    }

    public int[] createArray(Array arrayObj, int lenghtArray) {
        arrayObj.setLengthArray(lenghtArray);
        arrayObj.array = new int[lenghtArray];
        return arrayObj.array;
    }

    public int[] addToArray(int[] array) throws IOException {

        for (int i = 0; i <array.length; i++) {
            System.out.println("Enter " + (i + 1) + " number :");
            array[i] = Integer.parseInt(ReadCmdUtil.reader.readLine());

        }
        return array;
    }

    public void printArray(int[] arrayObj) {
        System.out.print("It's your array :  ");
        for (int i :arrayObj) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
