package ch19_collections;

import java.util.*;

/*
    List는 순서가 있고 중복허용
    set은 순서는 없고 중복은 허용하지 않음(집합특)
    List->Set 또는 Set->List 형변환이 중요
    List로 설문을 받고, Set을 통해 중복을 제거하고, 후보구만 남기는 형태로 사용가능
    Set을 중복을 제거한 후에 List로 돌려서
    .get(index 넘버로 조회가능, set은 순서가 없어서
 */
public class StrSet {
    public static void main(String[] args) {
        Set<String> strSet = new HashSet<>();
        List<String > strList = new ArrayList<>();

        strList.add("Java");//strList
        strList.add("Java");
        strList.add("Java");
        strList.add("Java");
        strList.add("JavaScript");
        strList.add("JavaScript");
        strList.add("JavaScript");
        strList.add("JavaScript");
        strList.add("JavaScript");
        strList.add("Python");
        strList.add("Kotlin");
        strList.add("Kotlin");

        System.out.println(strSet);

        strSet.addAll(strList);
        System.out.println();
        for(String elem : strSet){
            System.out.println(elem);
        }
        //Set은 get으로 뽑아낼 수 없다. 순서가 없음으로 하지만 for each문으론 출력가능하다.
        //마찬가지로 sort도 불가능하다. 순서가 없는데 어떻게 정렬을 하는가
        //어쨋든 중복 제거를 strSet에서 했기 때문에 중복 제거 버전을 다시 List로 옮길 수 있을것
        List<String> modifiedList = new ArrayList<>();
        modifiedList.addAll(strSet);
        Collections.sort(modifiedList);
        System.out.println(modifiedList);
    }
}
//alt+shift를 누른채로 클릭을 통해 커서를 늘릴 수 있다.
