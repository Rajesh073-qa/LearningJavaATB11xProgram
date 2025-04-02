package ex19_OOPS_inheritance.single_Inheritance;

public class Testcase1 extends CommonToAll {
    void runningTC1() {
        browserOpen();
        readDataBaseFile();
        readExcelFile();
        CloseBrowser();
        System.out.println("Executed all the methods using inheriting the property of commonToAll - Test case 1");
    }
}
