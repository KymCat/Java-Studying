## 형변환
### 자동 형변환
```java
int intValue = 10;
long longValue;
double doubleValue;

longValue = intValue; // int -> long
System.out.println("longValue = " + longValue); // 10

doubleValue = intValue; // int -> double
System.out.println("doubleValue = " + doubleValue); // 10.0

doubleValue = 20L; // long -> double
System.out.println("doubleValue2 = " + doubleValue); // 20.0
```
- 큰타입에 작은타입을 대입하면 자동으로 형변환
- 내부적으로 작은타입이 큰타입으로 명시적 형변환

##
### 명시적 형변환
```java
double doubleValue = 1.5;
int intValue = 0;

// intValue = doubleValue; 컴파일 오류발생
intValue = (int) doubleValue; // 명시적 형변환
System.out.println(intValue); // 1
```
- 작은타입에 큰타입을 대입하면 컴파일 오류 발생
- 괄호안에 명시적으로 타입을 기입해줘야 정상적으로 작동

##
### 명시적 형변환 오버플로우
```java
long maxIntValue = 2147483647; // int 최고값
long maxIntOver = 2147483648L; // int 최고값 + 1(초과)
int intValue = 0;

intValue = (int) maxIntValue; // 형변환
System.out.println(intValue); // 2147483647

intValue = (int) maxIntOver; // 형변환
System.out.println(intValue); // -2147483648 : 오버플로우
```
- 명시적 형변환 시 발생하는 문제
- 작은 타입의 범위를 넘어서면 값을 형변환 시 예상치 못한 값이 출력될 위험

##
### 계산과 형변환
```java
int div1 = 3 / 2; // expected 1.5
System.out.println("div1 = " + div1); // 1

double div2 = 3 / 2; // expected 1.5
System.out.println("div2 = " + div2); // 1.0
```
- 같은 타입끼리의 계산은 같은 타입으로의 결과가 반환
- `div2`는 1의 결과가 double형으로 바뀌면서 1.0의 결과가 출력
  
```java
double div3 = 3.0 / 2; // expected 1.5
System.out.println("div3 = " + div3); // 1.5

double div4 = (double) 3 / 2; // expected 1.5
System.out.println("div4 = " + div4); // 1.5
```
- 다른 타입끼리의 계산은 큰 타입으로 자동 형변환
- `3.0 / 2` 는 double형이 더 크므로 2가 2.0으로 변환되면서 계산