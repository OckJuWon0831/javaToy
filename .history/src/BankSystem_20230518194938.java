import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        boolean isExit = false;
        do 
        {
            System.out.println("========================");
            System.out.println("한국은행");
            System.out.println("========================");
            System.out.println("1. 계좌개설");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 종료");
            System.out.println("항목을 선택하세요");
            System.out.println("========================");
            Scanner scan = new Scanner(System.in);
            int selector = Integer.parseInt(scan.nextLine());
            switch(selector) {
                case 1:
                    System.out.println("1번이 선택되었습니다.");
                    System.out.println("계좌를 선택해주세요.");
                    System.out.println("========================");
                    System.out.println("1. 일반 계좌");
                    System.out.println("2. 학생 계좌");
                    System.out.println("3. 적금");
                    학생 계좌
                    적금);
                    break;
                case 2:
                    System.out.println("2번이 선택되었습니다.");
                    break;
                case 3:
                    System.out.println("3번이 선택되었습니다.");
                    break;
                case 4:
                    isExit = true;
                    break;
            }
        } while(!isExit);
    }
}

