package ch07_methods;


/*
    같은 이름의 메서드이지만, 파라미터의 유무및 자료형의 차이에따라 호출되는 메서드가 달라진다.
    이것이 메서드 오버로딩이다.
    그러면 왜 생겼는가, 사실 그냥 생각하면 - 그게 편하니까
    자세히 생각하면 - 쓸 수 있는 이름이 한계가 있기때문이다.
    비슷한 역할을 하는 메서드에 1,2,3같은 식으로 차이를 두는건 직관적이지도 못하고 읽기 불편하다

    메서드 오버라이드는 부모-자식간에 같은 메서드의 이름을 가지고 있을때, 부모가 호출하면 부모의 것,
    자식이 호출하면 자식의 메서드가 호출되는것

    public void add(int a, int b){ }
    public void add(String a, String b){ }
 */
public class Method09Overloading {
    public void add(){
        System.out.println("add()");
    }

    public void add(String s){
        System.out.println(s);
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }

    public void add(String a, int b){
        System.out.println(a+b);
    }

    public void add(String a, String b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Method09Overloading method1 = new Method09Overloading();

        method1.add();
        method1.add("안녕하세요");
        method1.add(2,3);
    }

}
