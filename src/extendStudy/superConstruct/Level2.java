package extendStudy.superConstruct;

public class Level2 extends Level1 {

    /*
        Level1의 생성자는 두개
        생성자는 하나만 호출할 수 있다.
        두 생성자 중에 하나를 선택하면 된다.

        Level1은 기본생성자가 없기때문에 super()를 생략이 불가능하다
     */
    public Level2() {
        super(10,20);
        System.out.println("Level2 생성자");
    }
}
