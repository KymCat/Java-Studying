## Static 메서드
### static 메서드 사용법
- `static` 메서드는 `static`만 사용 가능
    - 프로그램 실행 시 먼저 만들어지므로 `static`이 붙은 정적 메서드나 정적 변수만 사용 가능
    - 인스턴스 변수, 인스턴스 메서드 사용 불가능

- 모든 곳에서 `static`을 호출 가능
    - 정적 메서드는 공용 기능
    - 접근 제어자만 허용된다면 모든 곳에서 `static` 호출 가능

##
### 클래스에서 static 메서드
```java
public class DecoData {
    private int instanceValue;
    private static int staticValue; // 정적 변수

    public static void staticCall() {
        staticValue++; // 정적 변수 접근 가능
        // instanceValue++; 인스턴스 변수 접근 불가능
    }

    public void instanceCall() {
        staticValue++; // 정적 변수 접근 가능
        instanceValue++; // 인스턴스 변수 접근 가능
    }
}
```
- 정적 메서드는 프로그램 시작 시 생성
- 따라서 인스턴스 생성 후 사용 가능한 인스턴스 변수,메서드는 정적 메서드 안에서 사용 불가능
- 정적 변수는 반대로 모든 곳에서 사용 가능

##
### main에서 static
```java
System.out.println("1. 정적 호출");
DecoData.staticCall();

System.out.println("2. 인스턴스 호출");
DecoData data = new DecoData();
data.instanceCall();
```
- `static`메서드인 `staticCall`은 객체 생성 없이 바로 접근 가능
- 인스턴스 메서드인 `instanceCall`은 객체 생성 후 접근 가능