import javax.swing.*;
public class Lab508 {

	public static void main(String[] args) {
		int[] nums = {25,78,41,22,36,85,37};
		int index;
		while(true){
		index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array"));
		if(checkIndex(nums,index))
		break;
		}
		JOptionPane.showMessageDialog(null, "Current data,nums["+index+"] is "+currentData(nums,index)
		+"\n"+(index >= 0?"Previous data,nums["+index+"]is "+prevData(nums,index):"No previous data")
		+"\n"+(index < nums.length -1 ?"Next data,nums["+index+"]is "+nextData(nums,index):"No next data"));

	}
	public static boolean checkIndex(int[] nums,int index) {
			return index<nums.length&&index>=0?true:false;
			}
	public static int currentData(int[] nums,int index) {
		return nums[index];	
	}
	public static int prevData(int[] nums,int index) {
		return nums[index-1];	
	}
	public static int nextData(int[] nums,int index) {
		return nums[index+1];	
	}
}







