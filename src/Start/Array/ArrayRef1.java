package Start.Array;

public class ArrayRef1 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성
        /*
            - 배열의 크기 만큼 메모리를 확보
                int형 5개 사용 => 4byte * 5 = 20byte를 확보
            - 배열을 생성하면 자바는 메모리에 접근할 수 있는 참조값(주소)를 반환
         */

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for (int score : students) {
            System.out.println("점수 : " + score);
        }
    }
}
