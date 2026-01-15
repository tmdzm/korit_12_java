package ch21_exception.scores;

import java.util.Scanner;

public class scoresMain {
    public static void checkScore(int score) throws InvalidScoreException{
        if(score>100||score<0){
            throw new InvalidScoreException("점수는 0~100점 사이여야 합니다.");
        }
        else  System.out.println("점수가 성공적으로 저장되었습니다.");//
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("점수를 입력하시오");
        try {
            int score = in.nextInt();
            checkScore(score);
            //사실 else가 아니라 여기에다 print를 적어도 된다. throw되면 여기는 더이상 출력이 안되기 때문이다.
        } catch (InvalidScoreException e) {
            System.out.println(e.getMessage());
        }
    }
}
