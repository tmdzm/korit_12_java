package ch17_static;

import ch17_static.builders.Person;

public class ProductMain {
    public static void main(String[] args) {
        Prodcut p1 = new Prodcut();
        p1.setName("아이스 아메리카노");
        //System.out.println(Prodcut.getTitle());
        System.out.println(p1.getName());
        System.out.println(p1.getInstanceCnt());
        System.out.println(p1.getCnt());

        p1.setCnt(0);

        System.out.println("재고 초기화 : "+p1.getCnt());
        System.out.println(p1.getInstanceCnt());

    }
}
