/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCmanagement;

/**
 *
 * @author 순범
 */
public abstract class TemplateMethod {

    public int coffe = 0;
    public int snack = 0;
    public int time = 0;
    public int ice = 0;
    public int user = 0;

    abstract String PrintPcNum();

    public void Count(String s) {
        if (s == "커피(2000)") {
            coffe++;
        } else if (s == "얼음추가(500)") {
            ice++;
        } else if (s == "과자(1000)") {
            snack++;
        } else if (s == "1시간") {
            time++;
        }
//        else if (s == "사용자") {
//            user++;
//        }
    }

    public String show() {
        return String.format(" 커피 주문 수량 : %d \n " + "얼음 주문 수량 : %d \n"
                + "과자 주문 수량 : %d \n" + "충전 시간 : %d\n", coffe, ice, snack, time);
    }

    public String getCoffe(int c) {
        return String.format("커피 매출 : %d", c * 2000);
    }
    
    public String getIce(int i) {
        return String. format("얼음 매출 : %d", i * 500);
    }

    public String getSnack(int s) {
        return String.format("과자 매출 : %d", s * 1000);
    }

    public String getTime(int t) {
        return String.format("충전 시간 매출 : %d", t * 1000);
    }

    public String getUser(int u) {
        return String.format("사용 인원 : %d", u);
    }
}
