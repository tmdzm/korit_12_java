package ch11_arrays;
import java.util.Scanner;

public class Array03Method {
    Scanner in = new Scanner(System.in);
    int max = in.nextInt();
    String[] humans = new String[max];
    double score = 0;

    public void WriteNameAndScore(){
        humanName(max);
        humanScore(max);
        System.out.println("학생들의 점수 총합은 "+score+"점입니다.");
    }
    private void humanName(int max){
        for(int i = 1;i<max+1;i++){
            System.out.println(i+" 번 학생의 이름을 등록하시오 >>>");
            humans[i-1] = in.next();
        }
    }
    private void humanScore(int max){
        for(int i = 0;i<max;i++){
            System.out.println(humans[i]+" 학생의 점수를 입력하세요 >>>");
            this.score += in.nextDouble();
        }
    }
}
//.getAsDouble() - 옵셔널 더블 자료형에서 실수부분만 뽑아낼 수 있다.
//input num 메서드를 정의해서 배열의 한계값들을 입력받는 메서드를 구현하고 분할해
//Arrays.stream(scores).sum()
//Arrays.stream(scores).average().getAsDouble

//method 오버로딩을 통해 ~~