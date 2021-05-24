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
public class Main {
        
        int coffe=0;
        int snack=0;
        int ice = 0;
    
    public void Count(String s){
        if(s=="커피"){
            coffe++;
        }
        else if(s=="얼음"){
            ice++;
        }
        else if(s=="과자"){
            snack++;
        }
    }
    public String show(){
        return String.format(" 커피 주문 수량 : %d \n " + "얼음 주문 수량 : %d \n"
                +"과자 주문 수량 : %d",coffe,snack);
    }
   public int getCoffe(){
       return coffe;
   }
   
    
}
