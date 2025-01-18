import javax.swing.*;
import java.text.*;
public class Lab2_1 {
    public static void main(String[] args){
        int BUFFET = 299;
        String consumerInput = JOptionPane.showInputDialog(null,"How many customber per bill");
        int consumer = Integer.parseInt(consumerInput);

        NumberFormat f1 = NumberFormat.getCurrencyInstance();
        NumberFormat f2 = NumberFormat.getCurrencyInstance();

        int price = BUFFET*consumer;
        int price2 = price-((price*10)/100);
        int option;
        do{
        option = JOptionPane.showConfirmDialog(null,"Total Price is "+f1.format(price)+"baht.\nDo you have a member card?",
        "Select an Option",JOptionPane.YES_NO_CANCEL_OPTION);
        
        if (option == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Amount to be paid is "+f2.format(price2)+".00 baht.");
        }
        else if (option == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,"Amount to be paid is "+f1.format(price)+"baht.");
        }
        else
        continue;
    }while(option == JOptionPane.CANCEL_OPTION);
}
}

