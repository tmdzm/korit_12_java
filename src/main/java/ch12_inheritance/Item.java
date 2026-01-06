package ch12_inheritance;

/*
        부모클래스 Item
        자식 Product
        실행 Production


     */
public class Item {
    private String name;
    private String category;

    public Item(){}

    public Item(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
