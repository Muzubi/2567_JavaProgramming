import javax.swing.JOptionPane;

public class Lab402 {
    public static void main(String[] args) {
        while (true) {
            String yearStr = JOptionPane.showInputDialog(null, "Input year:");
            int year = Integer.parseInt(yearStr);

            if (checkYear(year)) {
                if (isLeapYear(year)) {
                    JOptionPane.showMessageDialog(null, year + " is a leap year.");
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, year + " is NOT a leap year.");
                }
            } else {
                JOptionPane.showMessageDialog(null,year +" is NOT a leap year.");
            }
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean checkYear(int year) {
        return year >= 1000 && year <= 3000;
    }
}