/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCmanagement;

/**
 *
 * @author xorh
 */
public class Clear {

    Pc1 p = new Pc1();
    Pc2 p2 = new Pc2();

    int num = 0;

    public void Clear(int num) {
        if (num == 1) {
            p.time = 0;
            p.snackcount = 0;
            p.coffeecount = 0;
            p.milk = 0;
            p.shot = 0;
        }
        if (num == 2) {
            p2.time = 0;
            p2.snackcount = 0;
            p2.coffeecount = 0;
            p2.milk = 0;
            p2.shot = 0;
        }
    }

}
