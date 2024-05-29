package com.study.java_study.발표;

public class 배열값삭제 {
    public static void main(String[] args) {






                int[] nums = new int[] {1, 2, 3, 4};

                for(int num : nums) {   // nums배열 -> 1, 2, 3, 4
                    System.out.println(num);
                }

                // < nums 배열에 3을 삭제 >

                int removeNum = 3;

                int[] newNums = new int[nums.length - 1];	// 기존 배열보다 크기가 1이 더 작은 배열 생성






                int index = -1;
                for(int i = 0; i < nums.length; i++) {	// 3의 인덱스 번호 찾기
                    if(nums[i] == removeNum) {
                        index = i;
                        break;
                    }
                }

                for(int i = 0; i < newNums.length; i++) {	// 새로운 배열에 3의 인덱스 번호보다 작으면 그대로,
                    if(i < index) {                         // 크면 한 칸씩 앞으로 가게 값 추가
                        newNums[i] = nums[i];
                        continue;
                    }
                    newNums[i] = nums[i + 1];
                }








                nums = newNums;	// 기존 배열 주소의 변수에 새 배열의 주소 대입

                for(int num : nums) {   // nums배열 -> 1, 2, 4
                    System.out.println(num);
                }


























    }
}
