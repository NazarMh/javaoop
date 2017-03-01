package ua.smartprog.lesson_26.delegation;

public class DelegationA implements ITestable {
    private ITestable testable;

    public DelegationA(ITestable testable) {
        this.testable = testable;
    }

    public void test() {
        System.out.println("Delegation to : " + testable.getClass());
        testable.test();
    }
}
