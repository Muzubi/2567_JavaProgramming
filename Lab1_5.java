import javax.swing.*;

public class Lab1_5 {
    public static void main (String[] args){

        String idTheCDInput = JOptionPane.showInputDialog(null,"This progeam calcuates the total cost of a CD order\nPlease enter the ID of the CD");
        int idTheCD = Integer.parseInt(idTheCDInput);
        String titalOfCDInput = JOptionPane.showInputDialog(null,"Please enter the tital of the CD");
        String priceOfCDInput = JOptionPane.showInputDialog(null,"Please enter the price of the CD in U.S. dollars");
        double priceOfCD = Double.parseDouble(priceOfCDInput);
        String quantityOfCDInput = JOptionPane.showInputDialog(null,"Please enter the quantity to be purchesed");
        int quantityOfCD = Integer.parseInt(quantityOfCDInput);



        double subtotal = quantityOfCD*priceOfCD;
        double taxRate = (subtotal/100)*6.25; //สูตรคำนวนเปอร์เซ็น ออกมาเป็นเลขต่ำ
        double total = subtotal+taxRate;    //เอาเลขต่ำมาบวกก่อนหน้า เพื่อบวกค่าภาษาีไปแล่้ว
        JOptionPane.showMessageDialog
        (null,"Summary of the transaction:"+"CD ID:"+idTheCD+"\nCD Title:"+titalOfCDInput+"\nCD Unit Price:$"+priceOfCD+"\nCD Quantity:"+quantityOfCD+
        "\n\nSubtotal:$"+subtotal+"\nTax rate:6.25%"+"\nTotal:$"+total+"\n\nEnd of Program");


    }
}
