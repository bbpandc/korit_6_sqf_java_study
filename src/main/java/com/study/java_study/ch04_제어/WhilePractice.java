package com.study.java_study.ch04_제어;

import java.util.Scanner;

public class WhilePractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRun = true;

        System.out.println("[프로그램 시작]");
        System.out.println();

        while (isRun) {
            System.out.println("1. 중국집");
            System.out.println("2. 치킨집");
            System.out.println("3. 분식집");
            System.out.println("q. 결제하기");
            System.out.print("메뉴 선택: ");
            String selectMenu = scanner.nextLine();

            switch (selectMenu) {
                case "1":
                    System.out.println();
                    System.out.println("중국집 선택");
                    boolean isRunJ = true;
                    while (isRunJ) {
                        System.out.println();
                        System.out.println("[중국집 메뉴 선택]");
                        System.out.println("1. 짜장면");
                        System.out.println("2. 짬뽕");
                        System.out.println("3. 탕수육");
                        System.out.println("b. 선택 완료 하기");
                        System.out.print("메뉴 선택: ");
                        selectMenu = scanner.nextLine();

                        switch (selectMenu) {
                            case "1":
                                System.out.println("짜장면 선택");
                                break;
                            case "2":
                                System.out.println("짬뽕 선택");
                                break;
                            case "3":
                                System.out.println("탕수육 선택");

                                boolean isRunT = true;
                                while (isRunT) {
                                    System.out.println("[탕수육 사이즈 선택]");
                                    System.out.println("1. 소");
                                    System.out.println("2. 중");
                                    System.out.println("3. 대");
                                    System.out.println("취소");
                                    String selectSize = scanner.nextLine();

                                    switch (selectSize) {
                                        case "1":
                                            System.out.println("소자 선택 완료");
                                            isRunT = false;
                                            break;
                                        case "2":
                                            System.out.println("중자 선택 완료");
                                            isRunT = false;
                                            break;
                                        case "3":
                                            System.out.println("대자 선택 완료");
                                            isRunT = false;
                                            break;
                                        default:
                                            System.out.println("취소");
                                    }
                                    System.out.println();
                                }
                                break;
                            case "b":
                                System.out.println("메인 메뉴로 돌아갑니다.");
                                isRunJ = false;
                                break;
                            default:
                                System.out.println("잘못된 선택입니다. 다시 선택하세요.");
                        }
                        System.out.println();
                    }
                    break;
                case "2":
                    System.out.println("치킨집 선택");
                    boolean isRunC = true;
                    while (isRunC) {
                        System.out.println("[치킨집 메뉴 선택]");
                        System.out.println("1. 후라이드 치킨");
                        System.out.println("2. 양념치킨");
                        System.out.println("3. 반반 치킨");
                        System.out.println("b. 선택 완료 하기");
                        System.out.print("메뉴 선택: ");
                        selectMenu = scanner.nextLine();

                        switch (selectMenu) {
                            case "1":
                                System.out.println("후라이드 치킨 선택");
                                break;
                            case "2":
                                System.out.println("양념치킨 선택");
                                break;
                            case "3":
                                System.out.println("반반 치킨 선택");
                                break;
                            case "b":
                                System.out.println("메인 메뉴로 돌아갑니다.");
                                isRunC = false;
                                break;
                            default:
                                System.out.println("잘못된 선택입니다. 다시 선택하세요.");
                        }
                        System.out.println();
                    }
                    break;
                case "3":
                    System.out.println("분식집 선택");
                    boolean isRunB = true;
                    while (isRunB) {
                        System.out.println("[분식집 메뉴 선택]");
                        System.out.println("1. 떡볶이");
                        System.out.println("2. 튀김");
                        System.out.println("3. 순대");
                        System.out.println("b. 선택 완료 하기");
                        System.out.print("메뉴 선택: ");
                        selectMenu = scanner.nextLine();

                        switch (selectMenu) {
                            case "1":
                                System.out.println("떡볶이 선택");
                                break;
                            case "2":
                                System.out.println("튀김 선택");
                                break;
                            case "3":
                                System.out.println("순대 선택");
                                break;
                            case "b":
                                System.out.println("메인 메뉴로 돌아갑니다.");
                                isRunB = false;
                                break;
                            default:
                                System.out.println("잘못된 선택입니다. 다시 선택하세요.");
                        }
                        System.out.println();
                    }
                    break;
                case "q":
                    System.out.println("결제를 완료하였습니다. 프로그램을 종료합니다.");
                    isRun = false;
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("[프로그램 종료]");

    }
}
