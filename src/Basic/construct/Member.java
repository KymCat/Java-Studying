package Basic.construct;

public class Member {
    String name;
    int age;
    int grade;

//    void initMember(String name, int age, int grade) {
//        this.age = age;
//        this.name = name;
//        this.grade = grade;
//    }

    // 생성자 단축키 :  alt + insert => Constructor
    Member(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // name, age 만 있는 생성자 ( 오버로딩 )
    Member(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade = 50;

        /*
            - 위 3줄 this. 코드가 중복
            - this() 기능을 사용하여 생성자 내부에서 다른 생성자를 호출 가능
            - 단, 생성자 내부에서만 사용가능 !
            - 첫 줄에만 사용해야함
         */
        this(name, age, 50);
    }
}
