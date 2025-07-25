package extendStudy.superConstruct;

public class Level1 extends Root{

    /*
        자식은 생성자의 첫줄에 부모클래스의 생성자를 호출 해야한다
        단 부모의 생성자가 기본 생성자면 super()를 생략가능 하다.
     */
    public Level1(int a) {
        super(); // 생략가능
        System.out.println("Level1 생성자 a = " + a);
    }

    public Level1(int a, int b) {
        super(); // 생략가능
        System.out.println("Level1 생성자 a = " + a + " b = " + b);
    }
}
