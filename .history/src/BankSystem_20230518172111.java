import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {

        boolean isExit = false;
        while(true) 
        {

            Scanner scan = new Scanner(System.in);
            int selector = Integer.parseInt(scan.nextLine());
            
            System.out.println("========================");
            System.out.println("한국은행");
            System.out.println("========================");
            System.out.println("1. 계좌개설");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 종료");
            System.out.println("항목을 선택하세요");
            System.out.println("========================");

            switch(selector) {
                case 1:
                    System.out.println("1번이 선택되었습니다.");
                    break;
                case 2:
                    System.out.println("2번이 선택되었습니다.");
                    break;
                case 3:
                    System.out.println("3번이 선택되었습니다.");
                    break;
            }
        }
    }
}
