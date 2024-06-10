package com.study.java_study.ch21_스트림;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {
        /*
            생성(사용) 절차
            1. 배열 생성 -> 스트림으로 변환
            2. List 생성 -> 스트림으로 변환
            3. generate 메소드 -> 스트림 생성
            4. 범위 지정 -> 스트림 생성
            5. 빌더 -> 스트림 생성

            중간(가공) 절차
            1. map(Function): .앞의 스트림의 값들을 차례대로 매개변수에 담고 리턴값들이 차례로 새 스트림에 담긴다.
            2. filter(Predicate): .앞의 스트림의 값들을 차례대로 매개변수에 담고 리턴값이 true 일때만 차례로 새 스트림에 담긴다.
            3. sorted(Comparator): .앞의 스트림을 정렬해준다. 오름차순((o1, o2) -> o1 - o2), 내림차순((o1, o2) -> o2 - o1)

            최종(결과) 절차
            1. collect(Collectors.toList()): 스트림을 List로 바꾼다.
            2. 반복자 -> forEach: 스트림의 값들을 차례대로 출력할 수 있다.

            (스트림은 한 번 사용하면 다시 못쓴다.(복사x 이동o -> 한 번 사용하면 빈 스트림이 된다.)
            사용하고 싶을 때마다 생성 or 변환 해줘야 함.)
         */

        Stream<Integer> st1 = Arrays.stream(new Integer[] {1, 2, 3, 4, 5}); // 생성 // List를 스트림으로 바꾼다.
        List<Integer> numberList = st1.map(n -> n * 2) // 가공
                .peek(n -> System.out.println(n)) // 가공(기타 스트림 메소드) // 새 스트림의 값들을 차례대로 출력
                .collect(Collectors.toList()); // 최종 // 스트림을 List로 바꾼다.

        numberList.forEach(n -> System.out.println("n: " + n)); // [2, 4, 6, 8, 10]

        List<Integer> filteringNumber = numberList.stream() // List를 스트림으로 바꾼다.
                .map(n -> n / 2) // [1, 2, 3, 4, 5]
                .filter(n -> n % 2 == 0) // [2, 4]
                .collect(Collectors.toList()); // 스트림을 List로 바꾼다.

        System.out.println(filteringNumber); // [2, 4]

        // 스트림 정렬
        List<Integer> sortedNumberList = numberList.stream()
                .sorted((o1, o2) -> o2 - o1) // 내림차순 정렬. 오름차순은 -> 뒤를 o1 - o2 로 바꿔준다.
                .collect(Collectors.toList());

        System.out.println(sortedNumberList); // [10, 8, 6, 4, 2]

        // 빌드를 활용하여 스트림 생성
        Stream<String> nameStream = Stream.<String>builder()
                .add("손경태")
                .add("최단비")
                .add("김지현")
                .add("정령우")
                .add("이성민")
                .build();

        // 스트림 문자열의 정렬
//        nameStream.sorted().forEach(name -> System.out.println(name)); // .sorted()로 ㄱㄴㄷ 순으로 정렬.
        nameStream
                .sorted((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o2, o1)) // 역순 정렬
                .forEach(name -> System.out.println(name));

        // 객체가 담긴 List를 활용한 스트림
        List<Phone> phoneList = List.of(
                Phone.builder().number(1).model("아이폰").build(),
                Phone.builder().number(2).model("갤럭시").build(),
                Phone.builder().number(3).model("샤오미").build()
        );

        phoneList.stream()
                .map(phone -> Phone.builder()
                    .number(phone.getNumber() * 2)
                    .model(phone.getModel())
                    .build())
                .forEach(phone -> System.out.println(phone)); // Phone(number=2, model=아이폰)
                                                              // Phone(number=4, model=갤럭시)
                                                              // Phone(number=6, model=샤오미)

        phoneList.stream()
                .filter(phone -> phone.getNumber() % 2 != 0)
                .forEach(phone -> System.out.println(phone)); // Phone(number=1, model=아이폰)
                                                              // Phone(number=3, model=샤오미)

        phoneList.stream()
                .sorted((o1, o2) -> o2.getNumber() - o1.getNumber())
                .forEach(phone -> System.out.println(phone)); // Phone(number=3, model=샤오미)
                                                              // Phone(number=2, model=갤럭시)
                                                              // Phone(number=1, model=아이폰)

        phoneList.stream()
                .sorted((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1.getModel(), o2.getModel()))
                .forEach(System.out :: println); // Phone(number=2, model=갤럭시)
                                                 // Phone(number=3, model=샤오미)
                                                 // Phone(number=1, model=아이폰)

    }
}
