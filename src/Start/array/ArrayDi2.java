package Start.array;

public class ArrayDi2 {
    public static void main(String[] args) {
        // 2x3 2차원 배열 선언과 동시에 값 할당
        int[][] arr = {
                {1,2,3},
                {4,5,6}
        };

        // 배열 요소 출력
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // for-each문 단축타이핑 : iter
        // idx값이 필요할 경우 사용 못함
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
