package Basic.class1;

public class Student {
    // 멤버변수 or 필드
    String name;
    int age;
    int grade;

    public static void main(String[] args) {
        // 객체 생성 => 멤버 변수를 사용하기 위한 메모리 공간도 같이 확보
        // 객체가 생성되면 s1에는 참조값을 반환
        Student s1 = new Student();

        // 객체 멤버변수 초기화
        s1.name = "학생1";
        s1.age = 15;
        s1.grade = 90;

        // 멤버변수 접근
        System.out.println("학생 이름 : " + s1.name + " 나이 : " +  s1.age + " 성적 : " + s1.grade);
    }
}

/*
    사용자 정의 타입을 만들기 위한 설계도가 "클래스"
    클래스를 사용해서 실제 메모리에 만들어진 실체를 "객체" 또는 "인스턴스"
 */