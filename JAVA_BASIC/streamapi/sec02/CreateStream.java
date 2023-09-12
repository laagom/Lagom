package JAVA_BASIC.streamapi.sec02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {

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
        System.out.println("============================");

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
        System.out.println("============================");

        // ==================== [가변 매개변수] ==================== //
        Stream<Double> stream3 = Stream.of(4.2, 2.6, 3.1, 1.9);
        stream3.forEach(System.out::println);

        // 결과
        // 4.2
        // 2.6
        // 3.1
        // 1.9
        System.out.println("============================");

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
        System.out.println("============================");

        // ==================== [지정된 범위의 연속된 정수] ==================== //
        IntStream stream6 = new Random().ints(4);
        stream6.forEach(System.out::println);

        // 결과
        // -54559489
        // -2011064847
        // -2139150023
        // 488430697
        System.out.println("============================");

        // ==================== [람다 표현식] ==================== //
        // IntStream stream7 = Stream.iterate(2, n -> n + 2);

        // ==================== [파일] ==================== //
        // String<String> stream8 = Files.lines(Path path);

        // ==================== [파일] ==================== //
        Stream<Object> stream9 = Stream.empty();
        System.out.println(stream9.count());
    }
}