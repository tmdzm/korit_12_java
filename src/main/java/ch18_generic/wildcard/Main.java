package ch18_generic.wildcard;

public class Main {
    //method 정의 영역
    /*
        현재 AnimalData에서는 들어온 객체가 Animal 클래스의 자식인지 알지 못하니 확인하는 메소드를 만들것이다.
     */
    public AnimalData<? extends Animal> getAnimal(int flag){
        if(flag == 1){
            AnimalData<Human> animalData = new AnimalData<>(new Human());
            return animalData;
        } else if (flag == 2) {
            AnimalData<Tiger> animalData = new AnimalData<>(new Tiger());
            return  animalData;
        }
        return null;
    }

    public static void main(String[] args) {
        AnimalData<Tiger> animalData1 = new AnimalData<>(new Tiger());
        AnimalData<Human> animalData2 = new AnimalData<>(new Human());
        AnimalData<Car>   animalData3 = new AnimalData<>(new Car());//채울 순 있다. 채울 수는...
        /*
            이상의 상황에서는 AnimalData에 Car 객체가 animal field에 들어가 있지만
            문제가 없다. 그러면 animal field에 Tiger/Human/Car 객체가 들어가 있다는 점은 여기 main에서 확인 안된다.
            코드 다른곳 까봐야한다.
         */

        animalData1.showData();
        animalData2.showData();
        //animalData3.showData(); 업캐스팅을 animal로 명시적으로 했기때문에 오류가 난다.

        Main main = new Main();
        AnimalData<? extends Animal> animalData4 = main.getAnimal(1);//쓰기 부분
        AnimalData<? extends Animal> animalData5 = main.getAnimal(2);
        AnimalData<? extends Animal> animalData6 = main.getAnimal(100);//null

        animalData4.showData();
        animalData5.showData();
        //animalData6.showData();
        System.out.println(animalData4);
        System.out.println(animalData6);//null

        System.out.println("----field에 null값 대입----");
        AnimalData animalData100 = new AnimalData(10);//왜 <>가 없어도 되지, main.getAnimal은 아니잖아
        //AnimalData animalData100 = new AnimalData();
        if(animalData100 == null) System.out.println("내부에 값 없음");
        else System.out.println("객체는 있는 값이 없습니다.");

        System.out.println(animalData100.getAnimal());//null이 아니라 객체 값이 없다고 나온다.
        animalData100.setAnimal(new Car());//이건 왜 될까, AnimalData에 setAnimal을 사용(@Data)
        System.out.println(animalData100.getAnimal());//ch18_generic.wildcard.Car@3af49f1c
    }
}
