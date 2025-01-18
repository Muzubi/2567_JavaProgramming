import java.util.*;
public class Lab1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int year,day;
        System.out.print("Input the number of minutes :");
        int numberOfMinutes = scan.nextInt();

        year = numberOfMinutes/525600;
        day = numberOfMinutes%525600/1440;
        System.out.print(numberOfMinutes+"minutes is approximately "+year+"years and "+day+" day ");





        scan.close();
    }

}
