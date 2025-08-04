package Basic.poly.basic;

// 다운 캐스팅을 자동으로 하지 않은 이유
public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child();
        // Child child1 = parent1; 다운 캐스팅 생략을 컴파일 오류 발생
        Child child1 = (Child) parent1;
        child1.childMethod();


        /*
            new Parent()를 할 경우,
            메모리 상에 Child 자체가 없기 때문에
            Child로 다운 캐스팅을 하면 Child 인스턴스가 없어,
            ClassCastException 오류 발생
         */

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // ClassCastException 오류
        child2.childMethod();
    }
}
