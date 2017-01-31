package com.automation;

import java.util.List;
import java.util.ArrayList;

/**
 * The FindTarget class has a method findTargetArrayInArraysList which
 * returns  list of Object arrays which contains
 * a target integer from a list of Object Arrays
 *
 * @author  Naresh Narmala
 * @version 1.0
 * @since   2017-01-30
 */
public class FindTargetArray {
    private static int counter;
    private Node head;

    // Default constructor
    public FindTargetArray() {

    }

/**
 * This method is used to return list of target Object arrays in a
 * Object arrays List  which contains a target integer
 * @param listObjects This is the first paramter to findTargetArrayInArraysList method
 * @param target  This is the second parameter to findTargetArrayInArraysList method
 * @return List<Object[]> This returns list of Object arrays containing target.
 */

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



