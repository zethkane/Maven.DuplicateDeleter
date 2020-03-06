package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] newArr = new Integer[array.length];
        Integer[] finArr;
        Integer count = 0;
        Integer size = 0;
        Integer size2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                if (array[i] == array[j]){
                    count++;
                }
            }if (count >= maxNumberOfDuplications){
                count = 0;
            }
            if (count != 0){
                size++;
                newArr[size2] = array[i];
                size2++;
                count = 0;
            }
        }
        finArr = new Integer[size];
        for (int i = 0; i < newArr.length ; i++) {
            if (newArr[i] != null){
                finArr[i] = newArr[i];
            }
        }

        return finArr;
    }


    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] newArr = new Integer[array.length];
        Integer[] finArr;
        Integer count = 0;
        Integer size = 0;
        Integer size2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                if (array[i] == array[j]){
                    count++;
                }
            }if (count == exactNumberOfDuplications){
                count = 0;
        }
            if (count != 0){
                size++;
                newArr[size2] = array[i];
                size2++;
                count = 0;
            }
        }
        finArr = new Integer[size];
        for (int i = 0; i < newArr.length ; i++) {
            if (newArr[i] != null){
                finArr[i] = newArr[i];
            }
        }

        return finArr;
    }
}
