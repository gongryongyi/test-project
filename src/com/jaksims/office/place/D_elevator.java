package com.jaksims.office.place;

import com.jaksims.office.Name.Kang_jihan;
import com.jaksims.office.Name.Lee_hyun;
import com.jaksims.office.Name.Lee_seol;
import com.jaksims.office.Name.Min_haein;

public class D_elevator extends Place{
    public void palce(){
        System.out.println("당신은 엘레베이터로 들어갑니다");
        Min_haein minHaein = new Min_haein();
        Lee_seol leeSeol = new Lee_seol();
        Lee_hyun leeHyun = new Lee_hyun();
        Kang_jihan kangJihan = new Kang_jihan();

        int random = (int)(Math.random() *4);

        switch (random){

            case 1 :
                minHaein.meetD();
                break;
            case 2 :
                leeSeol.meetD();
                break;
            case 3 :
                leeHyun.meetD();
                break;
            case 4 :
                kangJihan.meetD();
                break;











        }


    }
}
