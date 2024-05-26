package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class ArrayService {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];

        boolean isRun = true;

        while (isRun) {
            System.out.println("[이름 관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 이름 찾기");
            System.out.println("5. 전체 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택: ");

            String selectMenu = scanner.nextLine();

            switch (selectMenu) {
                case "1":
                    System.out.println("[이름 등록]");
                    String[] newNames = new String[names.length + 1];
                    for(int i = 0; i < names.length; i++) {
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    System.out.print("등록 할 이름: ");
                    names[names.length - 1] = scanner.nextLine();
                    System.out.println("등록 완료!");
                    break;
                case "2":
                    System.out.println("[이름 수정]");
                    System.out.print("수정 하고 싶은 이름: ");
                    String reName = scanner.nextLine();
                    String result1 = null;
                    for(String name : names) {
                        if(name.equals(reName)) {
                            result1 = name;
                            break;
                        }
                    }
                    if(result1 == null) {
                        System.out.println("해당 이름은 존재하지 않는 이름입니다.");
                        break;
                    }
                    System.out.print("수정 할 이름: ");
                    String nameResult1 = scanner.nextLine();
                    for(int i = 0; i < names.length; i++) {
                        if(reName.equals(names[i])) {
                            names[i] = nameResult1;
                            break;
                        }
                    }
                    break;
                case "3":
                    System.out.println("[이름 삭제]");
                    System.out.print("삭제 하고 싶은 이름: ");
                    String delName = scanner.nextLine();
                    String result2 = null;
                    for(String name : names) {
                        if(name.equals(delName)) {
                            result2 = name;
                            break;
                        }
                    }
                    if(result2 == null) {
                        System.out.println("해당 이름은 존재하지 않는 이름입니다.");
                        break;
                    }
                    String[] newArray = new String[names.length - 1];
                    int index = 0;
                    for(int i = 0; i < names.length; i++) {
                        if(names[i].equals(result2)) {
                            index = i;
                            break;
                        }
                    }
                    for(int i = 0; i < names.length; i++) {
                        if(i < index) {
                            newArray[i] = names[i];
                        }
                        else {
                            newArray[i - 1] = names[i];
                        }
                    }
                    System.out.println("삭제 완료");
                    names = newArray;
                    break;
                case "4":
                    System.out.println("[이름 찾기]");
                    System.out.print("조회 할 이름: ");
                    String result3 = null;
                    String findName = scanner.nextLine();
                    for(String name : names) {
                        if(name.equals(findName)) {
                            result3 = name;
                            break;
                        }
                    }
                    if(result3 == null) {
                        System.out.println("해당 이름은 존재하지 않는 이름입니다.");
                        break;
                    }
                    System.out.println("해당 이름은 등록된 이름입니다.");
                    break;
                case "5":
                    System.out.println("[전체 조회]");
                    for(int i = 0; i < names.length; i++) {
                        System.out.println("index[" + i + "]: " + names[i]);
                    }
                    break;
                case "q":
                    isRun = false;
                    break;
                default:
                    System.out.println("다시 입력하세요.");
            }
            System.out.println();
        }

    }
}
