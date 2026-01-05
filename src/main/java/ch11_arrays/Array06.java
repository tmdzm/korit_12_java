package ch11_arrays;

public class Array06 {
    public static void main(String[] args) {
        int[] scores = {100,90,80,70,60,50,40,30,20,10};
        SumAvg.calcSum(scores);
        SumAvg.calcAvg(scores);
    }
}

class SumAvg{
    static void calcSum(int[] arr){
        System.out.println("총점 : "+calcs(arr)+" 점");
    }

    static void calcAvg(int[] arr){
        System.out.println("평균 : "+((double)calcs(arr)/arr.length)+" 점");
    }

    static private int calcs(int[] arr) {
        int sum = 0;
        for(int i : arr) sum+=i;
        return sum;
    }
}
