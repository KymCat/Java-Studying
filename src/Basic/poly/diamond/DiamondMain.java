package Basic.poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();
    }

    /*
        InterfaceA,B 모두 methodCommon() 메서드를 가지고 있지만
        구현은 Child 클래스에서 하므로 다이아몬드 문제가 발생하지 않는다
     */
}
