package Basic.construct;

public class MemberMain {
    public static void main(String[] args) {
        // 생성자 호출
        Member m1 = new Member("Minsu", 10, 85);
//        m1.age = 10;
//        m1.name = "Minsu";
//        m1.grade = 85;

        System.out.println("이름 : " + m1.name + " 나이 : " + m1.age + " 성적 : " + m1.grade);

        // 이름 나이만 있는 생성자
        Member m2 = new Member("James", 12);
        System.out.println("이름 : " + m2.name + " 나이 : " + m2.age + " 성적 : " + m2.grade);
    }
}
