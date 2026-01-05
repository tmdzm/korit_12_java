package ch11_arrays;

/*
    배열을 매개변수로 하는 메서드 정의를 방금 전에 했음
    main에서 사용하는 불특정 String[] 배열을 인자로하는 메서드를 호출했을때
    String[]내부의 element를 한 줄로 출력하는 메소드를 정의하는 것을 목표

 */
/*
    실행 예
    김일/ 김이/ 김삼
    이라고
 */

public class Array04 {
    public static void main(String[] args) {
        String[] title = {"김일","김이","김삼"};

        for(int i = 0;i<title.length;i++) {
            System.out.println(title[i]);
        }
        printElement(title);
    }

    public static void printElement(String[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

//int[] dest = Arrays.copyOf(src, src.length); 복사
//for (int x : src) {
//    dest[i++] = x;
//}
/*
for each 문

for (타입 변수명 : 배열또는컬렉션) {
    실행할 코드
}
for (int x : arr) {
    실행할 코드
}

arr 안에 있는 값들이 순서대로 x에 들어옴, arr의 길이만큼 실행됨
 */