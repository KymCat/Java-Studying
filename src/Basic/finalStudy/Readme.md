## Final
### final 지역변수
```java
final int data1;
data1 = 10; // 최초로 한번만 할당 가능
// data1 = 20;  컴파일 오류

final int data2 = 10;
// data2 = 20; 컴파일 오류
```
- 선언 후 할당
  - 단 한번만 값 할당 가능
  - 할당 후 재할당은 컴파일 오류 발생

- 선언과 동시에 할당
  - 이후 값 재할당은 컴파일 오류 발생

##
### final 매개변수
```java
 // 메서드 final 매개변수
static void method(final int parameter) {
    // parameter = 20; 컴파일 오류
}
```
- 메서드 call로 인한 매개변수로만 할당 가능

##
### final 멤버변수
#### 생성자에서 초기화
```java
public class ConstructInit {
    // 생성자로 초기화 후, 더 이상 값 변경 X
    final int value;

    public ConstructInit(int value) {
        this.value = value;
    }
}
```
- 필드에서 선언만 한 경우 생성자로 초기화 가능
- 생성자 이후로 재할당은 컴파일 오류

####
#### 필드에서 초기화
```java
public class FieldInit {
    static final int CONST_VALUE = 10;
    final int value = 10;

    public FieldInit() {
        // this.value = value;  컴파일 오류
        // this.CONST_VALUE = 20;  컴파일 오류
    }
}
```
- 필드에서 선언과 동시에 값을 할당할 경우 생성자에서 초기화 불가능

##
### static final
#### 상수란?
변하지 않고, 항상 일정한 값을 갖는 수를 말한다. 자바에서는 보통 단 하나만 존재하는
변하지 않는 고정된 값을 `상수`라 한다. 이런 이유로 상수는 `static final` 키워드를 사용한다.

#### 자바 상수 특징
- `static final` 키워드를 사용
- 대문자를 사용하고 구분은 `_`(언더스코어)로 함
- 필드를 직접 접근해서 사용
  - 상수는 기능이 아니라 고정된 값 자체를 사용하는 것이 목적
  - 상수 값 변경 불가능

#### 클래스에서의 static final vs final
```java
public class FieldInit {
    static final int CONST_VALUE = 10;
    final int value = 10;
}
```
`CONST_VALUE`와 `value`은 필드에서 선언과 동시에 값을 할당 했으므로 값의 재할당이 불가능하다. 하지만 둘은 결정적인 차이점이 있다.
- `value`는 인스턴스 생성마다 생성됨
- `CONST_VALUE`는 메모리에 단 한개만 존재

이러한 차이점 때문에 어느 객체에서 고정된 값으로 필드를 둘 경우, `final`보단 메모리가 효율적인 `static final`로 설정하는 것이 유리하다.

##
### final 참조
```java
final Data data = new Data();
// data = new Data(); //final 변경 불가 컴파일 오류

// 참조 대상의 값은 변경 가능
data.value = 10;
data.value = 20;
```
- 참조값을 가지는 객체를 `final`로 설정시 참조값 재 할당 불가능
- 하지만 객체의 멤버변수는 변경 가능