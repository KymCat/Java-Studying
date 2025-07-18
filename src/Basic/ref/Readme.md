## 기본형 vs 참조형
### 대원칙
**자바는 항상 변수의 값을 복사해서 대입한다**

##
### 기본형
```java
int a = 10;
int b = a;
```
- 기본형 변수의 값은 해당 타입에서 사용하는 값 (int, string...)
- `a`의 값 10을 복사해서 b에 대입
```java
// a 변경
a = 20;
System.out.println("a = " + a);
System.out.println("b = " + b);

// b 변경
b = 30;
System.out.println("a = " + a);
System.out.println("b = " + b);
```
```
// a 변경
a = 20
b = 10

// b 변경
a = 20
b = 30
```
- 값만 복사 했기에 서로 영향이 없음
- 즉 기본형의 대입은 각자 독립적

##
### 참조형
```java
// 클래스
public class Data {
    int value;
}

Data d1 = new Data();
Data d2 = d1;
```
- 참조형 변수의 값은 해당 객체가 있는 메모리 참조값
- `d1`의 참조값을 `d2`에 복사
- `d2`로도 `d1`객체에 접근 가능

```java
// d1.value 변경
d1.value = 20;
System.out.println("d1 = " + d1.value);
System.out.println("d2 = " + d2.value);

// d2.value 변경
d2.value = 30;
System.out.println("d1 = " + d1.value);
System.out.println("d2 = " + d2.value);
```
```
// d1.value 변경
d1 = 20
d2 = 20

// d1.value 변경
d1 = 30
d2 = 30
```
- 참조값을 복사 했기에 서로 영향을 줌
- 즉 참조형의 대입은 종속적

##
### 메서드 매개변수
#### 기본형
```java
public static void main(String[] args) {
        int a = 10;
        System.out.println("before method call a = " + a); // 10

        change(a);
        System.out.println("after method call a = " + a); // 10
    }

static void change(int x) {
    x = 20;
}
```
- `change()` 함수의 매개변수가 기본형
- 함수를 호출해도 값만 복사
- 따라서 함수 호출 이후 `main`에서의 `a`에는 영향이 없음

#### 참조형
```java
public static void main(String[] args) {
        Data d1 = new Data();
        d1.value = 10;
        System.out.println("before method call value = " + d1.value); // 10

        change(d1);
        System.out.println("before method call value = " + d1.value); // 20
    }
    
static void change(Data dataX) {
    dataX.value = 20;
}
```
- `change()` 함수의 매개변수가 참조형
- 함수를 호출하면 `d1`의 참조값이 대입
- 따라서 함수 호출 이후 `main`에서의 `d1.value`의 값이 변경됨