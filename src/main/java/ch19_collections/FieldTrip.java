package ch19_collections;

import java.util.*;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> fieldTrips = new ArrayList<>();
        List<String> fieldTripsFinal = new ArrayList<>();
        Set<String> fieldTripsSet = new HashSet<>();
        int num;

        System.out.print("학생의 수는? >>> ");
        num = in.nextInt();
        in.nextLine();//쿠션, nextInt다음이 Line이라서

        for(int i=0;i<num;i++){
            System.out.print((i+1)+"번 학생의 수학 여행지를 입력하세요 >>> ");
            fieldTrips.add(in.nextLine());
        }
        for(int i=0;i<num;i++){
            System.out.println((i+1)+"번 학생의 수학 여행지 : "+ fieldTrips.get(i));
        }

        fieldTripsSet.addAll(fieldTrips);
        fieldTripsFinal.addAll(fieldTripsSet);

        System.out.println("수학 여행 후보지는");
        for(String str : fieldTripsFinal){
            System.out.println(str);
        }
        System.out.println("입니다.");

    }
}
