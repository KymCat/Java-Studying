package Basic.oop;

public class ValueData {
    int value;

    // 메서드는 객체를 생성해야 호출할 수 있다. => static X
    void add() {
        value++;
        System.out.println("숫자 증가 value = " + value);
    }
}
