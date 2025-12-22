package ch02_operator;
/*
    Camel case -> Java 상에서의 변수 표기법(JavaScript에서도 사용)
    Snake case -> Java에서 쓸일이 없다. 근데 상수표기에서 비슷하게 사용
    Pascal case -> 첫 번째 문자가 대문자고 나머지는 소문자로 가다가 두번때 단어의 첫번째 문자는 대문자
        ex) Operator
        ex) OperatorTest
 */
public class Operator01 {
    public static void main(String[] args) {
        //변수 선언 및 초기화
        int i = 10;

        //이전 패키지까지 해서 자료형, 변수명, 데이터에 대해서 학습함
        //이번에는 '='를 학습할거임

        System.out.println(i);
        i = i+1;//i++
        System.out.println(i);
        /*
            대입연산자 '=' : 오른쪽값(데이터)을 왼쪽(변수)에 대입시킨다.

            그렇다면 왼쪽과 오른쪽이 같다고 하려면? ==, 참고로 문자열끼리 비교는 다른 함수를 쓴다.
            자바 스크립트에선 ===(자료형까지 같다면)
         */
        //일반 연산자
        /*
            흔히아는 +,-,/,*의 사칙연산
            % : 나머지 연산자, 예를 들어 10%3은 10을 3으로 나눈 나머지를 나타내므로 1
         */
        int a= 5;
        int b =2;
        System.out.println(a/b);//정수형끼리의 나누기라 소수점을 버린다.
        double result = (double) a/b;
        System.out.println(result);//형변환, 값 2.5

        //알아서 2.5가 나오면 좋겠지만, 자바는 파이썬이 아니라서 하나하나지정해줘야 한다.
        /*
            개발자는 컴퓨터가 잘 작동할 수 있도록 명령을 잘 내리는 사람이다.
            간간히 컴퓨터를 재부팅해야 답이 나올때가 있다.
         */
        /*
            복합 대입 연산자
            +=
            -=
            *=
            /=
         */

        int num1 = 1; //변수 선언 및 초기화
        System.out.println(num1);
        num1 += 2; // num = num+2;라는것 즉 3
        System.out.println(num1);
        num1 -= 1;
        System.out.println(num1);
        num1 *= 10;
        System.out.println(num1);
        num1 /= 5;
        System.out.println(num1);

        System.out.println("-------------------------");
        int j = 10;
        System.out.println(j);//10
        System.out.println(j++);//10 출력 이후 11
        System.out.println(j);//11
        System.out.println(++j);//1 더하고 출력 즉 12
        System.out.println(j);
        System.out.println(j--);//동일하게 출력한뒤 -1
        System.out.println(j);
        System.out.println(--j);

        int age = 20;
        System.out.println("제 나이는 "+ age+ "살입니다.");
        System.out.println("내년에는 "+ age+1+ "살입니다.");
        System.out.println("내년에는 "+ (age+1) + "살입니다.");
        //대상의 경우에서 74번 라인은 왜 원하는 결과값이 나오지 않는가를 물었을때 대답할 수 있는가
        //답은 문자열로 시작해서 age와 1을 정수로 받지 않았다는 것이다.
        //Operator2 생성

    }
}
