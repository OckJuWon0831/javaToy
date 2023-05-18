import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        while(true) 
        {
            System.out.println("========================");
            System.out.println("한국은행");
            System.out.println("========================");
            System.out.println("1. 계좌개설");
            System.out.println("2. 입금");System.out.println("3. 출금");
            System.out.println("항목을 선택하세요");
            Scanner scan = new Scanner(System.in)
            int selector = Integer.parseInt(scan.nextLine());
            switch(selector) {
                case 1:
                break;
                case 2:
                break;
            }
        }
    }
}

