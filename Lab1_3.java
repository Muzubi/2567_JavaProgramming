import javax.swing.*;
public class Lab1_3 {
    public static void main (String[] args){
        String parkingTimeInput = JOptionPane.showInputDialog(null,"Input Time Parking (Minute):");
        int parkingTime = Integer.parseInt(parkingTimeInput);
        int hour,minutes;
        double price;
        hour = parkingTime/60;
        minutes = parkingTime%60; 
        price = (hour*50)+(minutes*0.25);
        JOptionPane.showMessageDialog(null,"You parking "+hour+"hour "+minutes+"Minute.\nAmoun to be paid is "+price+"baht.");

    }
}
