package com.study.java_study.ch06_배열;

public class ArrayMain01 {

    public static void main(String[] args) {
        int[] nums = new int[100];

        for(int i = 0; i < 100; i++) {
            nums[i] = (i + 1) * 10;
        }

        // for each 반복문. 배열의 0번 인덱스 부터 끝까지 다 돈다.
        for(int num : nums) {
            System.out.println(num);
        }

        // 인덱스를 활용하려면 이 반복문을 쓴다.
        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                continue;
            }
            int num = nums[i];
            System.out.println(num);
        }

    }
}
