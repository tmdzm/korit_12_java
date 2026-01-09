package ch15_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        ObjectTest objectClass = new ObjectTest();
        ObjectTest objectClass2 = new ObjectTest("김이","부산광역시 중구");

        objectClass.setName("김일");
        objectClass.setAddress("부산광역시 연제구");
        objectClass.showInfo();
        objectClass2.showInfo();

        System.out.println(objectClass);
        System.out.println();

        String example = "안녕하세요";
        boolean result = "안녕하세요" == example;
        System.out.println(result);//true로 나옴

        String[] strArray = {"안녕하세요","안녕"};
        boolean result2 = "안녕하세요" == strArray[0];
        boolean result3 = example == strArray[0];//근데 이건 왜 true지

        System.out.println(result2);//true임
        System.out.println(result3);//true임

        boolean result4 = objectClass.getName() == "김일";
        System.out.println(result4);//true임 다, 결과값이 같은걸 보지 주소지가 같은질 보지 않음
        //볼때는 언제고 보지 않을때는 언제인가

        String example2 = new String("안녕하세요");
        boolean result7 = "안녕하세요" == example2;
        System.out.println(result7);//false, 다르다고 나온다. 주소지가 다르다.
        String example3 = new String(example);
        boolean result8 = example3 == example;//false다, 주소지를 복사하는게 아니라서

        boolean result71 = "안녕하세요".equals(example2);
        System.out.println(result71);//tr

        boolean result81 = example3.equals(example);
        System.out.println(result81);//true

    }
}
