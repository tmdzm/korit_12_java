package ch19_collections;
import java.util.*;

/*
    Map은 key - value pair/쌍 / entry
 */


public class StrMap {
    public static void main(String[] args) {
        //map의 선언 및 초기화
        Map<String, String> strMap1 = new HashMap<>();

        //key - value 삽입 메서드 -> .put(키,값);
        strMap1.put("kor2026001","김일");
        strMap1.put("kor2026002","김이");
        strMap1.put("kor2026003","김삼");
        strMap1.put("kor2026004","김사");
        strMap1.put("kor2026005","김오");

        System.out.println(strMap1);//순서를 담보하지 않는다.
        strMap1.put("kor2026005","가짜");//키 하나당 밸류가 하나
        System.out.println(strMap1);
        //가장 최근값으로 덮어씀, 키가 같다면

        Map<String, Double[]> koreanScores = new HashMap<>();//배열을 넣을 수 있다. 즉, 키하나에 여러가지 값 가능
        koreanScores.put("김일",new Double[4]);//뭐 국어 1학기 중간 기말, 2학기 중간 기말 해서 4개인가

        Map<String, Double> koreanScores2 = new HashMap<>();
        koreanScores2.put("김일",98.2);
        koreanScores2.put("김이",98.2);
        koreanScores2.put("김삼",100.);
        koreanScores2.put("김사",67.2);
        koreanScores2.put("김오",70.0);

        //특정 key의 value 수정
        //#1 key를 정확하게 쓴뒤 그 value수정
        koreanScores2.put("김오",4.0);
        //#2 .replace(), 해당 키랑 같은 값이 있다면 수정하고 아니면 동작안한다. if 대신?
        // 있든 없든 넣고싶다면 put을 쓰면 되니까
        koreanScores2.replace("김육",6.0);

        //System.out.println(koreanScores2);

        // .containsKey() -> 해당하는 키가 있는가 -> boolean
        //값으로는 키를 찾을 수 없다. 중복일 수 있으니까
        boolean searchKeyFlag1 = strMap1.containsKey("kor2026001");
        System.out.println("존재여부 "+searchKeyFlag1);

        boolean searchValueFlag1 = strMap1.containsValue("김삼");
        System.out.println(strMap1.get("kor2026003")+" 존재 여부 "+searchValueFlag1);

        //Map의 entry로부터 Set을 생성
        Set<Map.Entry<String,String >> entrySet1 = new HashSet<>();
        //이상의 코드는 set 하나 생성하는데, 내부의 key가 String, value가 String인 map이
        //Set의 각각의 element에 해당한다는 것을 의미

        Set<Map.Entry<String ,String>> entrySet2 = strMap1.entrySet();
        System.out.println(entrySet2);//콘솔상에서 Set은 대괄호, Map은 중괄호로 나온다.
        //근데 key가 안겹치니 Set으로 만들 필요가 없다. 이미 중복이 없으니까

        //그렇다면 List로 만들 수 있나? 아니. entrySet()은 있지만 entryList()는 없다.
        //List<Map.Entry<String,String>> entryList = strMap1; - 오류
        //Map을 List로 만들고 싶다면 Set을 경유할 필요가 있다.
        //그리고 일단 List가 됐다면 List의 메소드도 사용가능

        Set<String> keySet = strMap1.keySet();
        System.out.println(keySet);
        // Set<String> valueSet = strMap1.values();//안됨, 중복이 있을 수 있어서, 참 귀찮네

        Collection<String> values = strMap1.values();
        System.out.println(values);
        //Collections는 .sort()를 위해 써봤지만 Collection은 처음 써봤다.
    }
}
