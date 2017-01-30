package com.automation;

import java.util.List;
import java.util.ArrayList;

public class FindTarget {
    private static int counter;
    private Node head;

    // Default constructor
    public FindTarget() {

    }

    // removes the element at the specified position in this list.
    public static List<Object[]> findTargetArrayInArraysList(List<Object[]> listObjects, int target) {
        List<Object[]> targetObjArraysList = new ArrayList<Object[]>();
        for (Object[] objArray : listObjects) {
            for (int i = 0; i < objArray.length; i++) {
                if (objArray[i].equals(target)) {
                    targetObjArraysList.add(objArray);
                }

            }
        }

        return targetObjArraysList;

    }
}



