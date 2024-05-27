package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class BookArrayService {

    public static void main(String[] args) {
        BookArrayUtils bookArrayUtils = new BookArrayUtils();
        Scanner scanner = new Scanner(System.in);
        String[] books = new String[0];

        boolean isRun = true;

        while (isRun) {
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 수정");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색");
            System.out.println("5. 도서 전체 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택: ");

            String selectMenu = scanner.nextLine();

            String[] newBooks = null;
            int findIndex = -1;

            switch (selectMenu) {
                case "1":
                    System.out.println("[도서 등록]");
                    newBooks = new String[books.length + 1];
                    for(int i = 0; i < books.length; i++) {
                        newBooks[i] = books[i];
                    }
                    books = newBooks;
                    System.out.print("등록 할 책: ");
                    books[books.length - 1] = scanner.nextLine();
                    System.out.println("등록 완료!");
                    break;
                case "2":
                    System.out.println("[도서 수정]");
                    System.out.print("수정 할 책: ");
                    String modifyBook = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexByBook(books, modifyBook);
                    if(findIndex == -1) {
                        System.out.println("해당 책은 존재하지 않습니다.");
                        break;
                    }
                    System.out.print("새 책: ");
                    books[findIndex] = scanner.nextLine();
                    System.out.println("수정 완료!");
                    break;
                case "3":
                    System.out.println("[도서 삭제]");
                    System.out.print("삭제할 책: ");
                    String removeBook = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexByBook(books, removeBook);
                    if(findIndex == -1) {
                        System.out.println("해당 책은 존재하지 않습니다.");
                        break;
                    }
                    newBooks = new String[books.length - 1];
                    for(int i = 0; i < newBooks.length;) {
                        if(i < findIndex) {
                            newBooks[i] = books[i];
                            continue;
                        }
                        newBooks[i] = books[i + 1];
                    }
                    books = newBooks;
                    System.out.println(removeBook + "을(를) 삭제하였습니다.");
                    break;
                case "4":
                    System.out.println("[도서 검색]");
                    System.out.print("조회 할 도서: ");
                    String findBook = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexByBook(books, findBook);
                    if(findIndex == -1) {
                        System.out.println("해당 책은 존재하지 않습니다.");
                        break;
                    }
                    System.out.println("해당 책은 존재합니다.");
                    break;
                case "5":
                    System.out.println("[도서 전체 조회]");
                    for(int i = 0; i < books.length; i++) {
                        System.out.println("[" + i + "]: " + books[i]);
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
