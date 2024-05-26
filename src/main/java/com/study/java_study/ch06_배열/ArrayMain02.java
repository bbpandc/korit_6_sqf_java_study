package com.study.java_study.ch06_배열;

public class ArrayMain02 {

    public static void main(String[] args) {
        // "김준일" 주소=> 999
        String a = "김준일";               // 999
        String b = new String("김준일");   // 200 -> 999

        System.out.println(a);
        System.out.println(b);

        System.out.println(a == "김준일"); // true
        System.out.println(b == "김준일"); // false

        String[] names = new String[2];
        names[0] = "김준일";
        names[1] = new String("김준일");
//      =
        String[] names2 = {"김준일", new String("김준일")};
//      =
//      String[] names2 = new String[] {"김준일", new String("김준일")};

        System.out.println(names[0] == names2[0]); // true
        System.out.println(names[1] == names2[1]); // false
        System.out.println(names == names2); // false

        System.out.println(new String[2]); // [Ljava.lang.String;@7c30a502 // 배열의 주소는 '['로 시작
        System.out.println(new String[] {"a", "b"}); // [Ljava.lang.String;@49e4cb85
//      System.out.println({"a", "b"});

    }
}
