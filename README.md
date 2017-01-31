AutomationTest is a test automation project implemented using java,testng,maven(for Questions 1,2)

Question1:
Method(removeMiddleElement) is implemented in class AutomationTest/src/main/java/com/automation/LinkedList.java
TestMethod(removeMiddleElementTest) in AutomationTest/src/test/java/com/automation/LinkedListDeleteMiddleElementTest.java tests above Method

Question2:
Method(findTargetArrayInArraysList) is implemented in class AutomationTest/src/main/java/com/automation/FindTargetArray.java
TestMethod(findTargetArrayInArraysListTest) in AutomationTest/src/test/java/com/automation/FindTargetArrayTest.java tests above Method

Question3:
1)select members.name,members.address,Organization.dues,Organization.location from members INNER JOIN Organization ON  members.id=Organization.id order by Members.id;

2)select members.id,members.name,members.address,members.phonenumber,members.age from members INNER JOIN Organization ON  members.id=Organization.id where Members.age>45

3)select members.id,members.name,members.address,members.phonenumber,members.age from members INNER JOIN Organization ON  members.id=Organization.id where Organization.dues=0

Running above test methods from commandline 
cd AutomationTest
mvn clean test

Running from Intellij or eclipse RightClick and select Run TestMethod
