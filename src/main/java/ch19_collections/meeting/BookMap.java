package ch19_collections.meeting;

import java.util.*;

public class BookMap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String , Integer> bookInventory = new HashMap<>(); //제네릭이라 인티저
        bookInventory.put("자바프로그래밍 입문",2);//키 : 책 이름, 값 : 책의 재고
        boolean endOfProgram = false;
        String bookTitle;

        while (!endOfProgram){
            System.out.println("-----도서 재고 관리 프로그램------");
            System.out.println("1.도서추가\n2.재고 수정\n3.재고 목록\n4.종료");
            System.out.println("메뉴를 선택하세요.");
            int option = in.nextInt();
            in.nextLine();
            switch (option){
                case 1 :
                    System.out.println("새 도서명을 입력하세요.");
                    bookTitle = in.nextLine();
                    //기존 키 고려
                    if(bookInventory.containsKey(bookTitle)) System.out.println("이미 있는 책입니다.");
                    else {
                        System.out.println("재고 수량을 입력하세요.");
                        int stock = in.nextInt();
                        in.nextLine();
                        bookInventory.put(bookTitle,stock);
                        System.out.println(bookTitle + "도서가 "+stock+" 권 추가 되었습니다.");
                    }
                    break;
                case 2 :
                    System.out.println("수량을 변경할 도서명을 입력하세요 >>> ");
                    bookTitle = in.nextLine();
                    if(bookInventory.containsKey(bookTitle)) {
                        //System.out.println("재고 수량을 입력하세요.");
                        //int stock = in.nextInt();
                        //in.nextLine();
                        //bookInventory.replace(bookTitle,stock);
                        System.out.println("재고 변경분을 입력하세요 >>> ");
                        int tmp = in.nextInt();
                        int stock = bookInventory.get(bookTitle) + tmp;//해당 키의 스톡을 가져오는건가
                        System.out.println(bookTitle + "도서가 "+stock+" 권으로 변경되었습니다.");
                        bookInventory.put(bookTitle,stock);
                    }
                    else System.out.println("해당 제목의 도서가 존재하지 않습니다.");
                    break;
                case 3 :
                    Set<String> bookTitleSet = bookInventory.keySet();
                    List<String> bookTitles = new ArrayList<>();
                    bookTitles.addAll(bookTitleSet);
                    for(String book : bookTitles){
                        System.out.println("도서명 : "+book+", 현재 재고 : "+bookInventory.get(book));
                    }
                    break;
                case 4 :
                    endOfProgram = true;//return을 쓸 수는 있는데 뭐...
                    break;//case의 break, while문 break;는 뭐 당연히 안되고,
                default:
                    System.out.println("그런 옵션은 없습니다.");
            }
        }
    }
}
/*
    2번 메뉴를 재고 입고, 3번을 출고

 */