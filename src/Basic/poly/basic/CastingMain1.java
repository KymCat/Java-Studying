package Basic.poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        /*
            부모 변수가 인스턴스 참조(다형적 참조)
            단 자식의 기능은 호출 불가능, 컴파일 오류
            다운 캐스팅으로 해결 가능
         */

        Parent poly = new Child();
        Child child = (Child) poly; // 다운 캐스팅
        child.childMethod();
    }
}
