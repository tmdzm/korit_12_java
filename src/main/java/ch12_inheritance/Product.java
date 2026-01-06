package ch12_inheritance;
/*
    A a = new B();정처기 단골
 */
public class Product extends Item{
    private int price;
    private int stock;

    public Product(){}

    public Product(String name, String category, int price, int stock) {
        super(name, category);
        this.price = price;
        this.stock = stock;
    }

    public void showName(){
        System.out.println("이 상품은 "+getName()+" 상품 입니다.");
    }

    public void showCategory(){
        System.out.println("이 상품은 "+getCategory()+" 카테고리 입니다.");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
