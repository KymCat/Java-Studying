## 배열
### 변수 데이터 타입
- 기본형(Primitive Type)
    - int, long, double, boolean
    - 변수에 사용할 값을 직접 넣을 수 있는 데이터 타입
  
- 참조형(Reference Type)
    - int[], long[], double[]
    - 데이터에 접근하기 위해 참조(주소)를 저장하는 데이터 타입
    - 객체, 클래스 또한 모두 참조형

##
### 배열 선언 및 할당
```java
// 방법 1 선언
int[] arr = new int[5];

// 방법 2 선언과 동시에 값 할당
int[] arr = {10, 20, 30, 40, 50};
```

##
### 배열 요소 출력
```java
int[] student = {90, 80, 70, 60, 50};

for(int i = 0; i < 5; i++)  
    System.out.printf("학생 %d의 점수는 %d 입니다\n", i+1, student[i]);
```

##
### 2차원 배열 선언 및 할당
```java
// 방법 1 선언
int[][] arr = new int[2][3];

// 방법 2 선언과 동시에 값 할당
int[][] arr = {
        {1,2,3},
        {4,5,6}
};
```
##
### 2차원 배열 요소 출력
```java
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
```