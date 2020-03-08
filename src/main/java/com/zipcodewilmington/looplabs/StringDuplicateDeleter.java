package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        return getStrings(maxNumberOfDuplications);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return getStrings(exactNumberOfDuplications);
    }

    private String[] getStrings(int exactNumberOfDuplications) {
        String[] newArr = new String[array.length];
        String[] finArr;
        Integer count = 0;
        Integer size = 0;
        Integer size2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                if (array[i] == array[j]){
                    count++;
                }
            }if (count >= exactNumberOfDuplications){
                count = 0;
            }
            if (count != 0){
                size++;
                newArr[size2] = array[i];
                size2++;
                count = 0;
            }
        }
        finArr = new String[size];
        for (int i = 0; i < newArr.length ; i++) {
            if (newArr[i] != null){
                finArr[i] = newArr[i];
            }
        }

        return finArr;
    }
}
