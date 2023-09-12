## 스트림의 생성
1. [컬렉션](#컬렉션)
2. [배열](#배열)
3. [가변 매개변수](#가변-매개변수)
4. [지정된 범위의 연속된 정수](#지정된-범위의-연속된-정수)
5. [특정 타입의 난수들](#특정-타입의-난수들)
6. [람다 표현식](#람다-표현식)
7. [파일](#파일)
8. [빈 스트림](#빈-스트림)

위의 다양한 데이터 소스에서 스트림API를 생성할 수 있다.

### 컬렉션
- Collection 인터페이스는 자바에서 제공하는 모든 컬렉션의 최고 상위 조상이다.
- Collection은 stream() 메소드를 제공한다.
- Collection 인터페이스를 구현한 모든 List와 Set 컬렉션 클래스에서도 stream() 메소드를 사용 가능하다.
- parallelStream() 메소드를 사용하면 병렬 처리가 가능한 스트림을 생성할 수 있다.

```JAVA
// ==================== [컬렉션] ==================== //
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(4);
list.add(2);
list.add(3);
list.add(1);

// 컬렉션에서 스트림 생성
Stream<Integer> arrayListStream = list.stream();
arrayListStream.forEach(System.out::println);

// 결과
// 4
// 2
// 3
// 1
```

- forEach() 메소드는 해당 스트림의 요소를 하나씩 소모해가며 순차적으로 요소에 접근
- 동일한 스트림으로 forEach() 메소드를 한 번밖에 호출할 수 없음
- 단 원본 데이터의 요소를 소모하는 것이 아니므로 동일한 데이터에서 또 다른 스트림을 생성하여 호출가능

### 배열
- Arrays클래스에 다양한 형태의 stream() 메소드가 클래스 메소드로 정의되어 있음
- 기본 타입인 int, long, double 형을 저장할 수 있는 배열에 관한 스트림이 별도로 정의 되어 있음
- java.util.stream 패키지의 IntStream, LongStream, DoubleStream 인터페이스로 각각 제공

```JAVA
// ==================== [배열] ==================== //
String[] arr = new String[] { "넷", "둘", "셋", "하나" };

// 배열에서 스트림 생성
Stream<String> stream1 = Arrays.stream(arr);
stream1.forEach(var1 -> System.out.println(var1 + ""));

System.out.println("----------------------------");

// 배열의 특정 부분만을 이용한 스트림 생성
Stream<String> stream2 = Arrays.stream(arr, 1, 3);
stream2.forEach(System.out::println);

// 결과
// 넷
// 둘
// 셋
// 하나
// ----------------------------
// 둘
// 셋
```

- Arrays 클래스의 stream() 메소드는 전체 배열뿐 아니라 배열의 특정 부분만을 이용하여 스트림을 생성할 수 있음

### 가변 매개변수
- Stream 클래스의 of() 메소드를 사용하면 가변 매개변수를 전달받아 스트림을 생성할 수 있다.

```JAVA
// ==================== [가변 매개변수] ==================== //
Stream<Double> stream3 = Stream.of(4.2, 2.6, 3.1, 1.9);
stream3.forEach(System.out::println);

// 결과
// 4.2
// 2.6
// 3.1
// 1.9
```

### 지정된 범위의 연속된 정수
- 지정된 범위의 연속된 정수를 스트림으로 생성하기 위해 IntStream, LongStream 인터페이스에는 range(), rangeClosed() 메소드가 정의되어 있음
- range() 메소드는 명시된 시작 정수를포함하지만, 명시된 마지막 정수는 포함하지 않는다.

```JAVA
// ==================== [지정된 범위의 연속된 정수] ==================== //
IntStream stream4 = IntStream.range(1, 4);
stream4.forEach(number -> System.out.println(number + ""));
System.out.println("----------------------------");
IntStream stream5 = IntStream.rangeClosed(1, 4);
stream5.forEach(number -> System.out.println(number + ""));

// 결과
// 1
// 2
// 3
// ----------------------------
// 1
// 2
// 3
// 4
```

### 특정 타입의 난수들
- 특정 타입의 난수로 이루어진 스트림을 생성하기 위해 Random 클래스에 ints(), longs(), doubles()와 같은 메소드가 정의
- 매개변수로 스트림의 크기를 long 타입으로 전달 받을 수 있음
- 매개변수를 전달 받지 않으면 크기가 정해지지 않은 무한 스트림을 반환
- limit() 메소드를 사용하여 따로 스트림의 크기를 제한해야함

```JAVA
// ==================== [지정된 범위의 연속된 정수] ==================== //
IntStream stream6 = new Random().ints(4);
stream6.forEach(System.out::println);

// 결과
// -54559489
// -2011064847
// -2139150023
// 488430697
```

### 람다 표현식
- 람다 표현식을 매개변수로 전달받아 해당 람다 표현식에 의해 반환되는 값을 요소로 하는 무한 스트림을 생성하기 위해 Stream 클래스에는 iterate()와 generate() 메소드가 정의되어 있음

### 파일
- 파일의 한 행(line)을 요소로 하는 스트림을 생성하기 위해 java.nio.file.Files 클래스에는 lines() 메소드가 정의되어 있습니다.
- java.io.BufferedReader 클래스의 lines() 메소드를 사용하면 파일뿐만 아니라 다른 입력으로부터도 데이터를 행(line) 단위로 읽어 올 수 있습니다.

### 빈 스트림
- 아무 요소도 가지지 않는 빈 스트림은 Stream 클래스의 empty() 메소드를 사용하여 생성할 수 있습니다.