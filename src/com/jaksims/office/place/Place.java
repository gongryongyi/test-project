package com.jaksims.office.place;

import java.util.Scanner;

public class Place {

    public void askPlace(){
        Scanner sc = new Scanner(System.in);

        A_tangbisil aTangbisil = new A_tangbisil();
        B_ohksang bOhksang = new B_ohksang();
        C_talkroom cTalkroom = new C_talkroom();
        D_elevator dElevator = new D_elevator();
        E_jjindda eJjindda = new E_jjindda();


        char[] place = new char[]{'a', 'b', 'c', 'd', 'e'};



        label :
        while (true) {
            System.out.println("어디로 가시겠습니까?");
            System.out.print("a. 탕비실 b. 옥상 c. 회의실 d. 엘리베이터 e. 내 자리에 앉기 : ");
            char choose = sc.next().charAt(0);

            for (int i = 0; i < place.length; i++) {

                if (choose == place[i]) {
                    if (choose == 'a' && place[i] == 'a') {
                        aTangbisil.palce();
                        break label;
                    } else if (choose == 'b' && place[i] == 'b') {
                        bOhksang.palce();
                        break label;
                    } else if (choose == 'c' && place[i] == 'c') {
                        cTalkroom.palce();
                        break label;
                    } else if (choose == 'd' && place[i] == 'd') {
                        dElevator.palce();
                        break label;
                    } else if (choose == 'e' && place[i] == 'e') {
                        eJjindda.palce();
                        break label;
                    }
                }
                if (choose != place[0] && choose != place[1] && choose != place[2] && choose != place[3] && choose != place[4]) {
                    System.out.println("그런 곳은 없습니다."); //다시 되돌아 가고 싶음
                    continue label;
                }

            }

        }


    }





    public void place(){
        System.out.println("당신은 장소로 갑니다.");


    }


}
