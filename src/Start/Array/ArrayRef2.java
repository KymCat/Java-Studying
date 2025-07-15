package Start.Array;

public class ArrayRef2 {
    public static void main(String[] args) {
        int[] student = {90, 80, 70, 60, 50};

        for(int i = 0; i < 5; i++)
            System.out.printf("학생 %d의 점수는 %d 입니다\n", i+1, student[i]);
    }
}
