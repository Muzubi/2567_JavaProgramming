import javax.swing.*;
public class Lab507 {

	public static void main(String[] args) {
		int[] input = new int[5];
		
		for(int i=0;i<input.length;i++) {
			input[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number"+ (i+1)));
			
		}
		showEven(input);
		showOdd(input);

	}
	public static void showEven(int[] nums) {
			
			String evennum="";
			
			for(int i=0;i<nums.length;i++) {
				if(nums[i]%2==0) {
					evennum+=nums[i] + " ";
				}
		}
			JOptionPane.showMessageDialog(null,"List of even number:\n"+evennum);
	}
	public static void showOdd(int[] nums) {
		
			String oddnum="";
		
			for(int i=0;i<nums.length;i++) {
				if(nums[i]%2!=0) {
				oddnum+=nums[i] + " ";
			}
	}
		JOptionPane.showMessageDialog(null,"List of Odd	number:\n"+oddnum);
	}
}
