import java.util.*;
public class Lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int previousNumber = -100000000;
        int currentNumber;

        while(true){
            System.out.print("Input number : ");
            currentNumber = scanner.nextInt();
            if(currentNumber < previousNumber){
                System.out.print("Bye Bye");
                break;
            }
            previousNumber = currentNumber;
        }
        scanner.close();
    }
    
}
