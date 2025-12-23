package ch04_conversion;

public class Main {
    public static void main(String[] args) {
        //1. upcasting(업캐스팅) : 더 큰 용량의 자료형으로 변환

        //자료형 변수명 = 데이터
        char cast1 = 'A';
        char cast2 = 'a';

        System.out.println("원형 : "+cast1);
        System.out.println("변형 : "+(int)cast1);//결과값은 65, 소문자 a와 차이는 32
        System.out.println("원형 : "+cast2);
        System.out.println("변형 : "+(int)cast2);//결과값은 97

        //업캐스팅 방법 #2
        //새로운 변수를 선언하여 캐스팅이 이루어진 데이터를 집어넣는 방법
        char cast3 = 'b';
        int casted3 = cast3; //여기는 (int)라고 쓰이지 않은것을 기억
        System.out.println("원형 : "+cast3);
        System.out.println("변형 : "+casted3);

        // 이상의 경우에는 변수를 선언할 때 변경되기를 원하는 자료형으로 명시해줍니다.
        // 다운캐스팅 : 용량이 더 작은 자료형으로 변화하는 것을 의미
        int cast4 = 99;
        int cast5 = 100;
        //지시 시행 다운캐스팅하는 방법을 업캐스팅 방법 #1,2를 참조하면서
        //char형으로 바꾼 후 콘솔창에 원형과 변형을 모두 출력하시오.
        //참고 : 어딘가에서 오류가 발생하는데 그건 정상일 수 있습니다.

        char casted4 = (char)cast4;
        char casted5 = (char)cast5;

        System.out.println("원형 : "+cast4);
        System.out.println("변형 : "+casted4);
        System.out.println("원형 : "+cast5);
        System.out.println("변형 : "+casted5);
        //다운캐스팅 #1
        //(char)cast4로 출력하기
        //다운캐스팅 #2 활용
        //char casted4 = (char)cast4;

        /*
            이상의 코드에서 31번 라인에 변환할 자료형을 명시하지 않았다면 오류가 났을것이다.
            추후 수업에서 더 중요하게 적용되는 개념, 업캐스팅의 경우 메모리 용량이 되니까 암시적(implicit) 변형이 가능한 반면
            다운캐스팅의 경우 데이터 용량이 축소되는 과정에서 변수가 메모리 용량을 벗어나니까 명시적지 않으면 오류를 발생시킨다.

            int가 21억 정도까지 표현되는데 long으로 바꾼게 유튜브 사례
            sql문에서는 long이 아니고 bigint로 쓰인다.

            ch05_condition
         */
    }
}
