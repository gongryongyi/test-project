package com.jaksims.office.Action;

public class Action {

    public Action(){
        System.out.println("~두근두근 오피스~");
        System.out.println("일찍 출근한 어느 날 아침, 오늘의 그 사람의 마음을 얻을 수 있을까?");
        System.out.println("자리에 앉기 전까지, 상대의 호감도를 100% 달성하세요.");
    }

    int random = (int)(Math.random()*4);



    public void chochlate(){
        System.out.println("상대에게 초콜릿을 건넸다.");
    }

    public void jelly(){
        System.out.println("상대에게 젤리를 건넸다.");
    }

    public void coffee(){
        System.out.println("상대에게 커피를 건넸다.");
    }

    public void hongsamcandy(){
        System.out.println("상대에게 홍삼캔디를 건넸다.");
    }
}
