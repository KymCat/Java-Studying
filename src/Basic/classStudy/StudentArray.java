package Basic.classStudy;

import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // new가 없을 시 nullPointerException 에러 발생
        Student[] students = new Student[2];
        students[0] = new Student();
        students[1] = new Student();

        for (int i = 0; i < 2; i++) {
            students[i].name = scanner.nextLine();
            students[i].age = scanner.nextInt();
            students[i].grade = scanner.nextInt();

            scanner.nextLine(); // 버퍼 비우기
        }

        for (Student student : students)
            System.out.println("학생 이름 : " + student.name + " 나이 : " + student.age + " 성적 : " + student.grade);

    }
}
