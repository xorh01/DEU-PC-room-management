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
public class Remote {

    public static void main(String[] args) {
        PowerCommand remote = new PowerCommand();
        State state = new State();
        PowerOnState On = new PowerOnState();
        PowerOffState Off = new PowerOffState();
        
        Power first = new Power("1번");
        PowerOnCommand firstPowerOn = new PowerOnCommand(first);
        PowerOffCommand firstPowerOff = new PowerOffCommand(first);

        Power second = new Power("2번");
        PowerOnCommand secondPowerOn = new PowerOnCommand(second);
        PowerOffCommand secondPowerOff = new PowerOffCommand(second);

        remote.setCommand(0, firstPowerOn, firstPowerOff);
        remote.setCommand(1, secondPowerOn, secondPowerOff);

//        remote.onButtonPressed(0);
//        remote.onButtonPressed(1);
        
        state.powerState();
        state.setPowerState(On);
    }
}
