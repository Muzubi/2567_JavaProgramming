import javax.swing.*;
public class Lab2_3 {
    public static void main(String[] args) {
        
        String weightIP = JOptionPane.showInputDialog(null,"Input Weight :");
        String heightIP = JOptionPane.showInputDialog(null,"Input Height :");
        double weingt = Double.parseDouble(weightIP),height = Double.parseDouble(heightIP);
        double heightM = height/100;
        double bmi = weingt/(heightM*heightM);

        if (bmi < 18.5){
            JOptionPane.showMessageDialog(null,"BMI = "+bmi+"\nYou're Underweight","BMI",JOptionPane.WARNING_MESSAGE);
        }
        else if(bmi >= 18.5 && bmi <=24.9){
            JOptionPane.showMessageDialog(null,"BMI = "+bmi+"\nYou're Normal-weight","BMI",JOptionPane.WARNING_MESSAGE);
        }
        else if(bmi >= 25.0 && bmi <=29.9){
            JOptionPane.showMessageDialog(null,"BMI = "+bmi+"\nYou're Overweight","BMI",JOptionPane.WARNING_MESSAGE);  }
        else if(bmi >=30.0){
        JOptionPane.showMessageDialog(null,"BMI = "+bmi+"\nYou're Obesity","BMI",JOptionPane.WARNING_MESSAGE);
    }
    }
}