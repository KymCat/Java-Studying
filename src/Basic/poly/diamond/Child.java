package Basic.poly.diamond;

public class Child implements InterfaceA, InterfaceB{
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    // InterfaceA, InterfaceB  공통 메서드
    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}
