import javax.swing.*;
public class Lab401 {

	public static void main(String[] args) {
		inputEmail();
	}
	public static void inputEmail() {
		String ans;
		String verEmail;
		do {
			verEmail = JOptionPane.showInputDialog("Input your e-mail:");
			if(verEmail!=null && !verEmail.isEmpty()) {
				checkEmailError(verEmail);
			}else {
				JOptionPane.showMessageDialog(null,"Email cannot be empty");
			}
			
			ans = JOptionPane.showInputDialog("Do you want to input email address[Y/y]:");
		}while(ans!=null&& ans.equalsIgnoreCase("y"));
	}
	public static void checkEmailError(String email) {
		while(email.startsWith("@")|| email.contains(" ")){
			email = JOptionPane.showInputDialog("Invalid email.Input your e-mail agian");
		}
		email = email.toLowerCase();
		JOptionPane.showMessageDialog(null, 
				checkEmail(email)?"Your e-mail is :"+email:"Your e-mail is not a hotmail or gmail address");
	}
	public static boolean checkEmail(String email) {
		return email.endsWith("@gmail.com")||email.endsWith("@homail.com");
		}
	}

