package ch11_arrays;

public class Array14Multi {
    public static void main(String[] args) {
        int[][] nums = new int[20][5];

        //1부터 100까지 숫자를 2차배열에 순서대로 값을 넣기
        //0.0에는 1
        int x = 0;

        for(int i = 0;i<nums.length;i++){
            for(int j =0 ;j<nums[i].length;j++){
                nums[i][j] = ++x;
            }
        }

        int index = 0;
        for(int[] i : nums){//순수하게 행수만큼 반복시키는 용도
            //index = 0;
            for(int j : nums[index++]) {
                System.out.print(j);
                System.out.println(" + "+index);//확인용
            }
            System.out.println();
            //아 순간 머리가 안돌아갔네
            //index가 0이면 nums[0]안의 1~5까지 알아서 반복되며 이것이 j값
            //nums가 한번 더 반복하면 j가 nums[1]에서 또 반복
        }
    }
}
