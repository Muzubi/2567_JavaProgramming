import javax.swing.*;
public class Lab302 {

	public static void main(String[] args) {
		
		boolean chkEmail = false;
		
		
		while(true) {
			String inEmail = JOptionPane.showInputDialog("Input your Email:").toLowerCase();
			while(inEmail.startsWith("@")||inEmail.contains(" ")){
				inEmail = JOptionPane.showInputDialog("Input your Email,agian:").toLowerCase();
			}
				
					chkEmail = inEmail.endsWith("@gmail.com")||inEmail.endsWith("@hotmail.com");
					if(inEmail.endsWith("@gmail.com")||inEmail.endsWith("@hotmail.com")) {
							JOptionPane.showMessageDialog(null,"Your e-mail is "+inEmail);
							break;
					}
					else {
							JOptionPane.showMessageDialog(null,"Your e-mail is not hotmail or gmail dot com ");
							continue;
		}
		
			
		
	}
	}
}
