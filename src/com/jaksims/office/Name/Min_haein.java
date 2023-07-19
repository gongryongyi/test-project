package com.jaksims.office.Name;

import com.jaksims.office.welcome.Start;

import java.util.Scanner;

public class Min_haein extends User {
    Start s = new Start();


    public void meetA(){
        System.out.println("당신은 해연이를 만났습니다.");
        System.out.println("안녕 여주야 쉬러왔어?");
        Scanner sc = new Scanner(System.in);
        System.out.println("해연이에게 선물을 주시겠습니까?");
        System.out.print("Y or N : ");
        char choose = sc.next().charAt(0);


    }
    public void meetB(){
        System.out.println("당신은 해연이를 만났습니다.");
        System.out.println("안녕 여주야 담배 하나 주까?");
        Scanner sc = new Scanner(System.in);
        System.out.println("해연이에게 선물을 주시겠습니까?");
        System.out.print("Y or N : ");
        char choose = sc.next().charAt(0);


    }
    public void meetC(){
        System.out.println("당신은 해연이를 만났습니다.");
        System.out.println("곧있으면 회의 시작이야 빨리와");
        Scanner sc = new Scanner(System.in);
        System.out.println("해연이에게 선물을 주시겠습니까?");
        System.out.print("Y or N : ");
        char choose = sc.next().charAt(0);


    }
    public void meetD(){
        System.out.println("당신은 해연이를 만났습니다.");
        System.out.println("좋은 아침~~!! 엘레베이터에서 딱 만났네?");
        Scanner sc = new Scanner(System.in);
        System.out.println("해연이에게 선물을 주시겠습니까?");
        System.out.print("Y or N : ");
        char choose = sc.next().charAt(0);


    }
}
