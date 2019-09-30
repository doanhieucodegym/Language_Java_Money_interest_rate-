import java.util.Scanner;

public class Money_interest_rate {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println(" nhập số  tiền gửi");
        double money = sc.nextDouble();
        System.out.println("nhâp số tháng gửi");
        int month  =sc.nextInt();
        System.out.println("nhập ti lệ  lãi suất");
        double interest_rate = sc.nextDouble();
        double total_interest = 0;
            total_interest = money *(interest_rate/100)/12 * month;
        System.out.println("Tiền lãi "+total_interest);
    }
}
