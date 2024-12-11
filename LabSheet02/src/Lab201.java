import java.text.DecimalFormat;

import javax.swing.*;
public class Lab201 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		
		int isMember;
		
		DecimalFormat frm = new DecimalFormat("#.###.00");
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog(null,
				"How many customer per bill"));
		double totalPrice = BUFFET * numberofCustomer;
		
		do {isMember = JOptionPane.showConfirmDialog(null,
				"Total price is "+frm.format(totalPrice)+"baht."+"Do you have a member card?");
			
		}while(isMember == JOptionPane.CANCEL_OPTION||isMember==JOptionPane.NO_OPTION);
		
		
		if(isMember==JOptionPane.YES_OPTION)
		{double priceAfterDiscount = totalPrice*0.90 ;
		JOptionPane.showMessageDialog(null,"Amount to be paid is"+frm.format(priceAfterDiscount)+"baht.");}
		
		else if (isMember == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null,"Amount to paid is"+totalPrice+"baht."); }
		
	}

}
