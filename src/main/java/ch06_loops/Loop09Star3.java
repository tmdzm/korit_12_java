package ch06_loops;


/*

 */
public class Loop09Star3 {
    public static void main(String[] args) {

        for(int i=0;i<=5;i++){//1->5
            for(int j=5;j>0;j--){
                if(j<=i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        //뒤집기
        int blank;//일단 변수 하나더만듬, 이것도 없이 할 수 있지 않을까

        for(int i=0;i<5;i++){//1->5
            blank = i;
            for(int j=5;j>0;j--){
                System.out.print(blank > 0 ? " " :"*");
                blank--;
            }
            System.out.println();
        }
    }
}

//                 if(blank>0){
//                     System.out.print(" ");
//                     blank --;
//                 }
//                 else
//                     System.out.print("*");