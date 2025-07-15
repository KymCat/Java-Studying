## 입력
### Scanner 선언
```java
import java.util.Scanner;

Scanner scanner = new Scanner();
```

##
### 다양한 타입 입력받기
```java
String str = scanner.nextLine(); // 문자열
int intValue = scanner.nextInt(); // 정수
double doubleValue = scanner.nextDouble(); // 실수
```
- 엔터(\n)가 입력될 때 까지 기다림
- 서로 다른타입을 입력하면 에러 발생
