package com.automation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
import java.util.ArrayList;

import com.automation.FindTarget;

/**
 * Created by nnarmala on 1/29/17.
 */
public class FindTargetTest {
    @Test(dataProvider = "arrayslistparams")
    public void findTargetArrayInArraysListTest(List<Object[]> objArraysList, List<Object[]> expectedArraysList, int target) {
        List<Object[]> targetArrayList = new ArrayList<Object[]>();
        try {
            targetArrayList = FindTarget.findTargetArrayInArraysList(objArraysList, target);
        } catch (NullPointerException e) {
            Assert.fail("InputArray is Null");
        }
        Assert.assertEquals(targetArrayList, expectedArraysList, "ExpectedArrayListSize:" + expectedArraysList.size() + " ActualArrayList:" + targetArrayList.size());


    }

    @DataProvider(name = "arrayslistparams")
    public static Object[][] arrayslistparams() {

        //TestCase1
        List<Object[]> objArraysList1 = new ArrayList<Object[]>();
        objArraysList1.add(new Object[]{1, 2, 3, 4});
        List<Object[]> expectedArrayList1 = new ArrayList<Object[]>();
        expectedArrayList1.add(new Object[]{1, 2, 3, 4});

        //TestCase2
        List<Object[]> objArraysList2 = new ArrayList<Object[]>();
        objArraysList2.add(new Object[]{1, 2, 3, 4});
        objArraysList2.add(new Object[]{5, 1, 3, 9});
        objArraysList2.add(new Object[]{9, 6, 2, 1});
        List<Object[]> expectedArrayList2 = new ArrayList<Object[]>();
        expectedArrayList2.add(new Object[]{5, 1, 3, 9});
        expectedArrayList2.add(new Object[]{9, 6, 2, 1});

        //TestCase3
        List<Object[]> objArraysList3 = new ArrayList<Object[]>();
        List<Object[]> expectedArrayList3 = new ArrayList<Object[]>();
        expectedArrayList3.add(new Object[]{1, 2, 3, 4});

        //TestCase4
        List<Object[]> objArraysList4 = null;
        List<Object[]> expectedArrayList4 = null;

        //TestCase5
        List<Object[]> objArraysList5 = new ArrayList<Object[]>();
        objArraysList5.add(new Object[]{1, 2, 3, 4});
        List<Object[]> expectedArrayList5 = null;


        return new Object[][]{{objArraysList1, expectedArrayList1, 4}, {objArraysList2, expectedArrayList2, 9},
                {objArraysList3, expectedArrayList3, 2}, {objArraysList4, expectedArrayList4, 2},
                {objArraysList5, expectedArrayList5, 2}};

        //return new Object[][]{{objArraysList5, expectedArrayList5, 2}};
    }
}




