package Basic.poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {

        Parent poly = new Child();
        Child child = (Child) poly; // 다운 캐스팅
        child.childMethod();

        // 일시적 다운 캐스팅 - 해당 메서드를 호출 하는 순간만 다운 캐스팅
        // poly.childMethod()가 우선순위가 높기 때문에 괄호로 순위 변경
        ((Child) poly).childMethod();
    }
}
