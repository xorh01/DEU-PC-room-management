/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coffee;

/**
 *
 * @author xorh
 */
public abstract class Coffee {
    String name = "무제";
 
    public String getName() {
        return name;
    }
    
    public abstract int cost();
}

class Ame extends Coffee {
    public Ame() {
        name = "아메리카노";
    }
    public int cost() {
        return 1000;
    }
}

class Moca extends Coffee {
    public Moca() {
        name = "모카";
    }
    public int cost() {
        return 1500;
    }
}
