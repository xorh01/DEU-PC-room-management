/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcbang;

/**
 *
 * @author xorh
 */
public class Power {

    public static final int ON = 1;
    public static final int OFF = 0;
    
    private String seat;
    int state;
//    State state = new State();

    public Power(String seat) {
        this.seat = seat;
    }

    public void on() {
        System.out.println(seat + " 컴퓨터 켜짐");
        state = ON;
    }

    public void off() {
        System.out.println(seat + " 컴퓨터 꺼짐");
        state = OFF;
    }
}
