package com.jaksims.office.Name;

import com.jaksims.office.place.Place;

import java.util.Scanner;

public class Min_haein extends User {
    Place p = new Place();

    Scanner sc = new Scanner(System.in);

    int minHeart = 0;

    public void meetA(){
        System.out.println("당신은 해연이를 만났습니다.");
        System.out.println("안녕 여주야 쉬러왔어?");
        System.out.println("헤연이에게 선물을 줄까? ( 1.준다.  2.안준다. )");
        System.out.print("당신의 선택 : ");
        int choose = sc.nextInt();
      if (choose == 1){
          System.out.println();
          System.out.println("그녀가 좋아할만한 선물을 주자. 뭘 줄까?");
          System.out.println("(1.초콜릿  2.커피  3.젤리  4.홍삼캔디)");
          System.out.print("당신의 선택 : ");
          int choice_gift = sc.nextInt(); //뭐 선물할건지 고름
          if (choice_gift == 4){
              minHeart += 100;
              System.out.println(" 우와-! 내 취향 다들 잘 모르던데 어떻게 알았어?? 고마워~! ");
              System.out.println(" ===== 호감도 25 상승!! ===== ");
              if ( minHeart >= 100){
                  System.out.println("민해인과 해피해피*^^*");
                  System.exit(0); //강제종료
              }else {
                  p.askPlace();
              }

          }else{
              minHeart -= 100;
              System.out.println(" 아냐 나는 괜찮아 고마워. ");
              System.out.println(" ===== 호감도 10 하락!! ===== \n");
              if (minHeart == 0){
                  System.out.println(" ~ bad ending 2 ~ ");
              }else{
                  p.askPlace();
              }

          }


      }

    }
    public void meetB(){
        System.out.println("당신은 해연이를 만났습니다.");
        System.out.println("안녕 여주야 담배 하나 주까?");
        System.out.println("헤연이에게 선물을 줄까? ( 1.준다.  2.안준다. )");
        System.out.print("당신의 선택 : ");
        int choose = sc.nextInt();
        if (choose == 1){
            System.out.println();
            System.out.println("그녀가 좋아할만한 선물을 주자. 뭘 줄까?");
            System.out.println("(1.초콜릿  2.커피  3.젤리  4.홍삼캔디)");
            System.out.print("당신의 선택 : ");
            int choice_gift = sc.nextInt(); //뭐 선물할건지 고름
            if (choice_gift == 4){
                minHeart += 100;
                System.out.println(" 우와-! 내 취향 다들 잘 모르던데 어떻게 알았어?? 고마워~! ");
                System.out.println(" ===== 호감도 25 상승!! ===== ");
                if ( minHeart >= 100){
                    System.out.println("민해인과 해피해피*^^*");
                    System.exit(0); //강제종료
                }else {
                    p.askPlace();
                }

            }else{
                minHeart -= 100;
                System.out.println(" 아냐 나는 괜찮아 고마워. ");
                System.out.println(" ===== 호감도 10 하락!! ===== \n");
                if (minHeart == 0){
                    System.out.println(" ~ bad ending 2 ~ ");
                }else{
                    p.askPlace();
                }

            }


        }


    }
    public void meetC(){
        System.out.println("당신은 해연이를 만났습니다.");
        System.out.println("곧있으면 회의 시작이야 빨리와");
        System.out.println("헤연이에게 선물을 줄까? ( 1.준다.  2.안준다. )");
        System.out.print("당신의 선택 : ");
        int choose = sc.nextInt();
        if (choose == 1){
            System.out.println();
            System.out.println("그녀가 좋아할만한 선물을 주자. 뭘 줄까?");
            System.out.println("(1.초콜릿  2.커피  3.젤리  4.홍삼캔디)");
            System.out.print("당신의 선택 : ");
            int choice_gift = sc.nextInt(); //뭐 선물할건지 고름
            if (choice_gift == 4){
                minHeart += 100;
                System.out.println(" 우와-! 내 취향 다들 잘 모르던데 어떻게 알았어?? 고마워~! ");
                System.out.println(" ===== 호감도 25 상승!! ===== ");
                if ( minHeart >= 100){
                    System.out.println("민해인과 해피해피*^^*");
                    System.exit(0); //강제종료
                }else {
                    p.askPlace();
                }

            }else{
                minHeart -= 100;
                System.out.println(" 아냐 나는 괜찮아 고마워. ");
                System.out.println(" ===== 호감도 10 하락!! ===== \n");
                if (minHeart == 0){
                    System.out.println(" ~ bad ending 2 ~ ");
                }else{
                    p.askPlace();
                }

            }


        }


    }
    public void meetD(){
        System.out.println("당신은 해연이를 만났습니다.");
        System.out.println("좋은 아침~~!! 엘레베이터에서 딱 만났네?");
        System.out.println("헤연이에게 선물을 줄까? ( 1.준다.  2.안준다. )");
        System.out.print("당신의 선택 : ");
        int choose = sc.nextInt();
        if (choose == 1){
            System.out.println();
            System.out.println("그녀가 좋아할만한 선물을 주자. 뭘 줄까?");
            System.out.println("(1.초콜릿  2.커피  3.젤리  4.홍삼캔디)");
            System.out.print("당신의 선택 : ");
            int choice_gift = sc.nextInt(); //뭐 선물할건지 고름
            if (choice_gift == 4){
                minHeart += 100;
                System.out.println(" 우와-! 내 취향 다들 잘 모르던데 어떻게 알았어?? 고마워~! ");
                System.out.println(" ===== 호감도 25 상승!! ===== ");
                if ( minHeart >= 100){
                    System.out.println("민해인과 해피해피*^^*");
                    System.exit(0); //강제종료
                }else {
                    p.askPlace();
                }

            }else{
                minHeart -= 100;
                System.out.println(" 아냐 나는 괜찮아 고마워. ");
                System.out.println(" ===== 호감도 10 하락!! ===== \n");
                if (minHeart == 0){
                    System.out.println(" ~ bad ending 2 ~ ");
                }else{
                    p.askPlace();
                }

            }


        }


    }
}
