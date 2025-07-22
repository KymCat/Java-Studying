package Basic.staicMethod;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        staticValue++; // 정적 변수 접근 가능
        staticMethod(); // 정적 메서드 접근 가능

        // instanceValue++; 인스턴스 변수 접근 불가능
        // instanceMethod(); 인스턴스 메서드 접근 불가능
    }

    public void instanceCall() {
        staticValue++; // 정적 변수 접근 가능
        staticMethod(); // 정적 메서드 접근 가능

        instanceValue++; // 인스턴스 변수 접근 가능
        instanceMethod(); // 인스턴스 메서드 접근 가능
    }

    public void  instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
