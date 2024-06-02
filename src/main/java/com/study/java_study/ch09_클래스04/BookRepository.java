package com.study.java_study.ch09_클래스04;

import java.util.Arrays;

// Repository: 저장소 -> CRUD가 이뤄짐
public class BookRepository {

    private int bookId;
    private BookEntity[] books;

    public BookRepository() {
        books = new BookEntity[0];
    }

    public int autoIncrementBookId() {
        return ++bookId;
    }

    // saveBook에서만 쓰기 위해 private
    private void extendBooks() {
//        // 기존 배열보다 크기가 하나 더 큰 배열을 생성한다.
//        BookEntity[] newBooks = new BookEntity[books.length + 1];
//
//        // 기존 배열의 정보를 새로운 배열로 모두 옮긴다. 이 때 마지막 인덱스의 값은 빈값이다.
//        for(int i = 0; i < books.length; i++) {
//            newBooks[i] = books[i];
//        }

        // 기존 배열의 주소가 들어있는 books 변수에 새로운 배열의 주소를 대입한다.
        books = Arrays.copyOf(books, books.length + 1);
    }

    // 배열의 마지막 인덱스를 구하는 메소드
    private int getLastIndex() {
        return books.length - 1;
    }

    // 책 추가
    public void saveBook(BookEntity book) {
        // 배열 확장
        extendBooks();

        // 새로운 배열의 비어있는 마지막 인덱스에 매개변수로 받아온 book 객체를 대입한다.
        books[getLastIndex()] = book;
    }

    // id로 책 찾기. 단건조회(하나만 찾기)
    public BookEntity findBookByBookId(int bookId) {
        BookEntity findBook = null;

        // 선형탐색(순차탐색)
        for(BookEntity book : books) {
            if(book.getBookId() == bookId) {
                findBook = book;
                break;
            }
        }
        return findBook;
    }

    // 이름으로 책 찾기. 단건조회(하나만 찾기)
    public BookEntity findBookByBookName(String bookName) {
        BookEntity findBook = null;

        // 선형탐색(순차탐색)
        for(BookEntity book : books) {
            if(book.getBookName().equals(bookName)) {
                findBook = book;
                break;
            }
        }
        return findBook;
    }

    // 통합검색. 찾은 만큼 배열 늘리기
    private int getNewArraySize(int option, String searchText) {
        int newArraySize = 0;

        switch (option) {
            case 1: // 통합검색
                for(BookEntity book : books) {
                    if(book.getBookName().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 2: // 도서명검색
                for(BookEntity book : books) {
                    if(book.getBookName().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 3: // 저자명검색
                for(BookEntity book : books) {
                    if(book.getAuthor().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 4: // 출판사명검색
                for(BookEntity book : books) {
                    if(book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }
        }
        return newArraySize;
    }

    // 통합검색. 찾은 만큼 배열에 넣기. 다건조회(여러 개 찾기) -> 배열 사용
    public BookEntity[] searchBooks(int option, String searchText) {
        // 찾은 만큼 늘린 배열의 사이즈
        int newArraySize = getNewArraySize(option, searchText);

        BookEntity[] searchBooks = new BookEntity[newArraySize];

        int i = 0;
        switch (option) {
//          int i = 0;: 이렇게 하면 case를 바로 찾아가서 선언이 되지 않기 때문에 switch문 밖에서 선언한다.
            case 1: // 통합검색
                for(BookEntity book : books) {
                    if(book.getBookName().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 2: // 도서명검색
                for(BookEntity book : books) {
                    if(book.getBookName().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 3: // 저자명검색
                for(BookEntity book : books) {
                    if(book.getAuthor().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 4: // 출판사명검색
                for(BookEntity book : books) {
                    if(book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
        }
        return searchBooks;
    }

    private int indexOfBookId(int bookId) {
        int findIndex = -1;

        for(int i = 0; i < books.length; i++) {
            if(books[i].getBookId() == bookId) {
                findIndex = i;
                break;
            }
        }
        return findIndex;
    }

    public void deleteBookByBookId(int bookId) {
        int findIndex = indexOfBookId(bookId);
        BookEntity[] newBooks = new BookEntity[books.length - 1];

        for(int i = 0; i < newBooks.length; i++) {
            if(i < findIndex) {
                newBooks[i] = books[i];
                continue;
            }
            newBooks[i] = books[i + 1];
        }
        books = newBooks;
    }

}
