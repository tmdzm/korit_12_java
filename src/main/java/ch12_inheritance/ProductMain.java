package ch12_inheritance;

public class ProductMain {
    public static void main(String[] args) {

        Item exCalibur = new Item("엑스칼리버","도검류");
        Product aer = new Product("에아","도검류",999999999,1);
        Product rpg = new Product("RPG","폭탄류",8000,10);
        Product product1 = new Product("전자제품","가전 제품",100000,10);

        aer.showName();
        aer.showCategory();

        product1.setCategory("백색 가전 제품");
        product1.showCategory();

    }
}
