package com.jaksims.office.place;

import com.jaksims.office.Name.Kang_jihan;
import com.jaksims.office.Name.Lee_hyun;
import com.jaksims.office.Name.Lee_seol;
import com.jaksims.office.Name.Min_haein;

public class B_ohksang extends Place {
    Min_haein minHaein = new Min_haein();
    Lee_seol leeSeol = new Lee_seol();
    Lee_hyun leeHyun = new Lee_hyun();
    Kang_jihan kangJihan = new Kang_jihan();

    public void palce(){
        System.out.println("당신은 옥상으로 올라갑니다");

        int random = (int)(Math.random() *4);

        switch (random){

            case 1 :
                minHaein.meetB();
                break;
            case 2 :
                leeSeol.meetB();
                break;
            case 3 :
                leeHyun.meetB();
                break;
            case 4 :
                kangJihan.meetB();
                break;
            default:
                break;

        }
    }
}
