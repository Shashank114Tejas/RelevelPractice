import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter num");
        int num= scan.nextInt();

        if(num%2==0){
            System.out.println("0");
        }
        else {
            System.out.println("1");
        }
    }
}
