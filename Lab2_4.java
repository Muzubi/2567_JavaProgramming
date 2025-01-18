import java.util.Scanner;

public class Lab2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ansIn,ansOut;
        System.out.print("Input value of X:");
        int x  = scanner.nextInt();
        System.out.print("Input value of Y:");
        int y  = scanner.nextInt();
            do{
            if (y < x){
                System.out.print("Input value of Y,agian :");
                y  = scanner.nextInt();
                }}while (x>y);
            
            
            int x1 = x;
            int xUp = ++x;
            y++;
            do {
                
                int ans = x1+xUp;
                System.out.println(x1+ "+"+xUp+"="+ans);
                x1 = ans;
                xUp++;
            }while(xUp < y );


            
    }
}
