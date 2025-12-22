package ch01_variable;
/*
    주석(comment) : Java 프로그램의 경우 폴더 파일의 전체코드를 컴파일링하는데, 거기서 오류가 하나라도 발생하게 되면 전체 프로그램이 실행 x
    하지만 주석 처리를 한 부분에 대해서는 컴퓨터가 코드로 인지하지 않기 때문에 오류가 발생하지 않는다.

    즉, 주석이란 컴퓨터가 읽어서 처리하는 부분이 아니라 사람이 읽어서 정보를 얻을 수 있는것에 의의가 있다.
    1) 한 줄 주석 : //
    2) 다중 주석 : /* + enter
    3) 사후 주석 : 주석 처리할 부분의 코드라인에 ctrl+/
 */


public class Main {
    public static void main(String[] args) {
        System.out.println("안녕하세요.");
        System.out.println(1);
        System.out.println('1');
        System.out.println("1");
        /*
            대상과 같은 방식의 코드 대입(매번 데이터를 직접사용하는 방식) 방식을 '하드코딩'
            하드코딩 : 명령문에 데이터(변수에 대입되지 않은 데이터인데 이를 리터럴)를 바로 집어넣는것으로, 지양되는 방식

            그럼 권장되는 방식은?

            변수 : 데이터를 담는 바구니 -> 근데 그 바구니에 이름 필요
            변수 선언방법 :
            자료형 변수명 = 데이터
         */

        int one = 1;
        System.out.println(one);
        System.out.printf("%d\n",one);

        int scoreEnglish = 100; // 변수 선언 및 초기화
        System.out.println(scoreEnglish);

        int scoreKorean; //변수 선언 - 변수를 최초선언
        scoreKorean = 99;//초기화 - 변수명에 최초대입
        System.out.println(scoreKorean);

        scoreKorean = 50;//변수에 데이터를 재대입
        System.out.println(scoreKorean);

        String introduction = "안녕하세요, 저는 이번 국비 과정을 맡게된 학생입니다.";
        System.out.println(introduction + " 앞으로 잘 부탁드립니다.");
        //String의 경우 Java는 특이하게 s가 대문자인데 파이썬이나 다른언어는 아닌경우도 있다.
        //이상의 명령어는 변수 + 하드코딩도힌 데이터를 이루어져있음.
        /*
            Java에서의 변수 명명 규칙 :
                1. 카멜 표기법 사용
                    : 첫 문자는 소문자로 시작/ 복수의 단오로 이루어졌을 경우 두번째 언의 첫번째 문자만 대문자
                    ex) 한단어 짜리 : result
                    ex) 복수 단어 : plusMinus
                2. 특수 문자 지양

                cf) 파이썬 학습한 사람의 경우 파이썬 변수 표기방식은 스네이크 표기법이라 해서 my_result처럼 언더바사용
         */
        //변수 : 값이 바뀔 수 있음
        System.out.println("국어 점수(변경전) : " + scoreKorean);
        scoreKorean = 100;  //재대입 할때는 자료형을 명시하지 않는다.
        System.out.println("국어 점수(변경후) : " + scoreKorean);
        //파이썬에선 자료형을 명시하지 않는다.파이썬이 알아서 정의한다.
        //1. 논리 자료형(boolean) 변수 : true,false
        //자료형 변수명 = 데이터(값);     변수의 선언 및 초기화
        boolean check = false; //선언과 초기화(첫대입)
        check = true;          //재대입
        //변수명에 flag가 들어가면 논리 자료형일 가능성이 높다.

        //2. 문자 자료형
        char name1 = '안';
        char name2 = '근';
        char name3 = '수';

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3); //print의 경우 변수의 자료형을 따라감

        System.out.println(name1 + name2 + name3);//결과값은 숫자, 왜 그럴까
        //근데 70 라인의 경우에 변수의 자료형이 char인데 문자가 여러게 나오는 바람에 결과값이 의도한대로 나오지 않음
        System.out.println(""+name1 + name2 + name3);//결과값 : 안근수, 시작이 스트링이라서 문자열로 알게됨

        System.out.printf("%c%c%c\n",name1,name2,name3);
        /*
            이상의 코드에서 알 수 있는 것처럼 컴퓨터는 생각보다 멍청하다.
            개발자인 저희가 하나하나 지정을 해줄 필요가 있습니다.
            '문자'와 '문자열'은 서로 다른 개념인데,
            문자를 세번 더했을경우 더 이상 문자가 아니라 문자열로 인식되기때문에 원하는 형식으로 출력되지 않습니다.

            그렇기 때문에 sout() 내부에 ""를 넣어, 컴퓨터는 이것이 문자열이라 생각하고 원하는 결과값을 만들어 내줬습니다.
            즉
            작은따옴표는 문자를 표시하기 위한 기호
            큰 따옴표는 문자열을 표시하기 위한 기호

            그리고, sout()은 ()내부에서 가장 먼저 나온 데이터와 자료형을 따라간다는 점도 확인 가능합니다.

            현재 학습한 부분 : boolean / char/ String)
                참고 : int는 integer의 축양어로 정수를 의미

                과제 : name1, 2, 3에 여러분들의 이름을 한글자씩 각각 대입해 이름이 출력될 수 있도록 작성
                김승일
                안녕하세요 제 이름은 김승일입니다.
         */

        name1 = '김';
        name2 = '승';
        name3 = '일';

        System.out.printf("%c%c%c\n",name1,name2,name3);
        System.out.printf("안녕하세요 제 이름은 %c%c%c입니다.\n",name1,name2,name3);
        //print는 끝나고 개행되지 않음에 주의.
        //강사는 printf를 좋아하지 않는다.

        // 3. 정수 자료형 변수 (int)
        int width1 = 100;
        int width2 = 200;
        System.out.println(width1 + width2);
        System.out.println(width1 - width2);//가능
        String width3 = "100";
        String width4 = "200";
        System.out.println(width3 + width4);//+ 연산은 문장을 이어붙여 나열된다.
        //System.out.println(width3 - width4); 불가능
        String name4 = "Kim";
        String name5 = "si";
        System.out.println(name4 + name5);

        Integer width5 = 500;
        Integer width6 = 600;
        System.out.println(width5+width6); //결과값 1100
        //자료형 int 뿐만 아니라 대문자로 시작되는 자료형인 Integer가 존재

        //4. 실수 자료형 double
        double pi = 3.14;
        //int pi2 = 3.14;

        //5. 정수 자료형 long/ 실수 자료형 float

        //ch02_operator , Operator01
    }
}

