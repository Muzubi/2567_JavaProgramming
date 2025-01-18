import javax.swing.*;
import java.util.*;
public class Lab1_4 {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,"Welcome to the paroll applicition");
        String empolyeeName = JOptionPane.showInputDialog(null,"Enter employee name");
        String hoursOfEmpolyeeInput = JOptionPane.showInputDialog(null,"Enter total hours for this empolyee");
        int hoursOfEmpolyee = Integer.parseInt(hoursOfEmpolyeeInput);
        
        double  hourlyWage = 7.5, taxRate = 0.15;
        double grossEarning = hoursOfEmpolyee*hourlyWage;
        double tax = grossEarning*taxRate;
        double netEarning = grossEarning-tax;

        JOptionPane.showMessageDialog
        (null,"Employee name :"+empolyeeName+"\nHours worked:"+hoursOfEmpolyee+
        "\nHourly wage:$ 7.5\n"+"Gross earnings:"+grossEarning+"\nTax rate:"+taxRate+
        "\nTax:$"+tax+"\nNet earnings:$"+netEarning);
        
    }
    

}
