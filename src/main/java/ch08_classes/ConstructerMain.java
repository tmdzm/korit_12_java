package ch08_classes;

public class ConstructerMain {
    public static void main(String[] args) {
        Constructer constructer = new Constructer();
        Constructer constructer2 = new Constructer();

        System.out.println(constructer2.num);

        Constructer constructer3 = new Constructer();
        System.out.println(constructer2.num);

        Constructer constructor4 = new Constructer();
        Constructer constructor5 = new Constructer();

        System.out.println(constructor4);
        System.out.println(constructor5);

        constructor4.title = "김사";
        constructor5.name = "김오";
        constructor5.num = 5;

        System.out.println(constructor4.title);
        System.out.println(constructor5.num);
        System.out.println(constructor5.name);

        constructor5.call();
    }
}
