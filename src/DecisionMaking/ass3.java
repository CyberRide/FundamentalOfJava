/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionMaking;

/**
 *
 * @author heri
 */
public class ass3 {

    int deviceNo;
    String deviceName, deviceType;
    double devicePrice;

    public ass3() {
        deviceNo = 1;
        deviceName = "Iphone";
deviceType ="ios";
devicePrice = 120.0;
    }

    public ass3(int deviceNo, String deviceType) {
        deviceNo = deviceNo;
        deviceType = deviceType;
    }

    public void displayDetails() {
        System.out.println( "Device number is "+ deviceNo);
System.out.println("Device name is " + deviceName );
System.out.println("Device type is " + deviceType );
 System.out.println ("Device price is "+ devicePrice);
}
 public static void main(String[] args){
ass3 objDevice = new ass3();
objDevice.displayDetails();
}
}