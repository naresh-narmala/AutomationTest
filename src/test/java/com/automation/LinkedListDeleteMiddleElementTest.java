package com.automation;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.automation.LinkedList;
import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;

/**
 * Created by nnarmala on 1/29/17.
 */
public class LinkedListDeleteElementTest {
    @Test(dataProvider = "linkedlistparams")
    public void removeMiddleElementTest(LinkedList List, Object element) {
        SoftAssert softAssert = new SoftAssert();
        int beforeDeleteListSize = List.size();
        System.out.println("List before Delete: \t" + List);
        Object removedElement = List.removeMiddleElement();
        int afterDeleteListSize = List.size();
        softAssert.assertEquals(element, removedElement, "middle element is removed");
        softAssert.assertEquals(afterDeleteListSize, (beforeDeleteListSize - 1), "size not valid");
        try {
            System.out.println("List after Delete: \t" + List);
        } catch (NullPointerException e) {
            System.out.println(" ");
        }
        softAssert.assertAll();
    }

    @DataProvider(name = "linkedlistparams")
    public static Object[][] linkedListProvider() {

        //TestCase with integer with odd number of elements
        LinkedList List1 = new LinkedList();
        List1.add(1);
        List1.add(2);
        List1.add(3);


        //TestCase with one element
        LinkedList List2 = new LinkedList();
        List2.add("1");


        //LinkedList List3= new LinkedList();
        LinkedList List3 = null;
        //List3.add(null);


        //TestCase with even number of elements
        LinkedList List4 = new LinkedList();
        List4.add("1");
        List4.add("2");
        List4.add("3");
        List4.add("4");


        //TestCase with no elements
        LinkedList List5 = new LinkedList();


        //TestCase with odd no of elements
        LinkedList List6 = new LinkedList();
        List6.add("1");
        List6.add("2");
        List6.add("3");
        List6.add("4");
        List6.add("5");
        List6.add("6");
        List6.add("7");
        List6.add("8");
        List6.add("9");
        List6.add("10");
        List6.add("11");


        return new Object[][]{{List1, 2}, {List2, "1"}, {List3, null}, {List4, "2"}, {List6, "6"}};
        //return new Object[][]{{List6,"6"}};
    }
}




