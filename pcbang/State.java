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
public class State {
    private PowerState powerState;

    public State(){
        this.powerState = new PowerOffState();
    }
    
    public void setPowerState(PowerState powerState) {
        this.powerState = powerState;
    }
    
    public void powerState() {
        powerState.powerState();
    }
}


