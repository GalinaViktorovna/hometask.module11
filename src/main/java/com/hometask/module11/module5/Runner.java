package com.hometask.module11.module5;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        Array arrayObject = new Array();
        arrayObject.addToArray(arrayObject.createArray(arrayObject, ReadCmdUtil.Read()));
        arrayObject.printArray(arrayObject.getArray());
        Counting.calculateMaxValue(arrayObject.getArray());
        Counting.calculateMaxValue(arrayObject.getArray());
        SortArray.sortArrayInsert(arrayObject.getArray(), arrayObject.getLengthArray());
        arrayObject.printArray(arrayObject.getArray());
        SortArray.sortArrayQuickSort(arrayObject.getArray());
        arrayObject.printArray(arrayObject.getArray());


    }

}
