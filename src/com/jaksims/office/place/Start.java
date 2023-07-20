package com.jaksims.office.place;

import com.jaksims.office.place.Place;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        System.out.print("당신의 이름을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("=========== GAME START ========== ");
        System.out.println("~ 두근두근 오피스 ~");
//        try {
//            Thread.sleep(2000); // Thread.sleep은 밀리초단위로 1000 -> 1초라는것 , 정해준 초 만큼 대기 후 다음줄 실행.
//        } catch (InterruptedException e) {  // 슬립이라는 메소드를 쓰기 위해선 오류를 잡아주는 throw catch를 꼭 써야한다.
//            throw new RuntimeException(e);
//        }
        System.out.println("짝사랑하던 그 사람을 보기 위해 일찍 출근한 나, " + name + ". 오늘에야말로 그(그녀)의 호감을 얻을수 있을까? ");
//        try {
//            Thread.sleep(1500); // Thread.sleep은 밀리초단위로 1000 -> 1초라는것 , 정해준 초 만큼 대기 후 다음줄 실행.
//        } catch (InterruptedException e) {  // 슬립이라는 메소드를 쓰기 위해선 오류를 잡아주는 throw catch를 꼭 써야한다.
//            throw new RuntimeException(e);
//        }
        System.out.println("==================== 게임 소개 ====================");
        System.out.println("상대의 호감을 얻기위한 15번의 두근두근 기회가 주어진다.");
        System.out.println("내 자리에 앉기 전에 상대의 취향에 맞는 선물을 4번 이상 건네고 행복한 결말을 맞이하세요!");
        Place i = new Place(); //장소 클래스 객체 생성
        i.askPlace(); //장소 클래스의 Choose_Location메소드 호출

    }
}



