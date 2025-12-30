package ch08_classes.products;

public class Product {
    int productNum;
    String productName;

    public Product(){}
    public Product(int num){this.productNum = num;}
    public Product(String name){ this.productName =name;}
    public Product(int num,String name){this.productNum = num;this.productName =name;}

    public void showInfo(){
        System.out.printf("시리얼 넘버 : %d\n제품 타이틀 : %s\n",productNum,productName);
    }
}


