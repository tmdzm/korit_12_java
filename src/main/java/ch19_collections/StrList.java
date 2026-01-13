package ch19_collections;

import java.util.*;

public class StrList {
    public static void main(String[] args) {
        //Array와의 차이점 #1
        //선언 방식
        String[] strArray = new String[5];
        List<String> strList = new ArrayList<>();// A A는 new B

        //차이점 #2 - 값을 대입하는 방법
        //배열
        strArray[0] = "김영";
        strArray[4] = "김사";

        //List -> 메소드를 경유
        strList.add("Java");
        strList.add("python");
        strList.add("c++");
        //순서가 보장되어 있기에 집어넣은 순서대로 값이 들어간다.
        //List는 알아서 방이 늘어난다.

        //차이점 #3 출력방식
        System.out.println(Arrays.toString(strArray));
        System.out.println(strList);//List는 배열과 달리 toString이 자체적으로 적용

        //Array 와의 차이점 # 4 - 삭제방식
        strArray[0] = null;
        String removeElem1 = "Java";
        boolean isRemoved = strList.remove(removeElem1);
        System.out.println(removeElem1+" 삭제 여부 : "+isRemoved);
        System.out.println(strList);
        //그냥 지우는건 strList.remove(removeElem1);면 된다.
        //Array는 빈방이 생기지만, List는 지우면 그만큼 방이 줄어든다.

        //정렬 방법
        //배열은 Arrays.sort
        Collections.sort(strList);
        System.out.println(strList);
        //내림차순
        Collections.sort(strList, Comparator.reverseOrder());
        /*
            List에서 특정 element의 검색 -> .contains사용
            리스트명.contains(목적어)
            검색한 목적어가 정확히 있는지 판정하며, 일부 겹치는건 무시한다.
         */
        String searchElem1 = "python";
        boolean contains1 = strList.contains(searchElem1);
        System.out.println(searchElem1+" 포함 여부 : "+contains1);

        String searchElem2 = "py";
        boolean contains2 = strList.contains(searchElem2);
        System.out.println(searchElem2+" 포함 여부 : "+contains2);

        for(int i =0;i<strArray.length;i++) {
            strArray[i] = "김"+(i);
            System.out.println(strArray[i]+"님");
        }
        for(String str : strArray) System.out.println(str+" 학생");
        System.out.println();

        for(int i=0;i<strList.size();i++){
            System.out.println(strList.get(i)+"언어");
        }

        for(String str : strList) System.out.print(str+" 공부 /");
        //.size , .get 같은건 쓸 필요도 없이 깔끔하게 끝낸다.
    }
}
//list는 length가 아니라 size()를 쓴다.
