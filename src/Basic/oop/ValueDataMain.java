package Basic.oop;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        valueData.add();
        valueData.add();
        valueData.add();
        System.out.println("최종 숫자 value = " + valueData.value);
    }
}
