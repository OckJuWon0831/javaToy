import java.util.ArrayList;
import java.util.Scanner;

public class BankSystem {

    public static ArrayList<Account> accountList = new ArrayList<Account>();
    public static int index = 0;

    public static void createAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("계좌번호: ");
        String accountNumber = sc.nextLine();
        System.out.println("이름: ");
        String name = sc.nextLine();
        System.out.println("금액: ");
        int balance = sc.nextInt();
        
        accountList.add(index, new Account(accountNumber, name, balance));
        index++;
    }
    public static void main(String[] args) {
        boolean isExit = false;
        do 
        {
           ShowMenu.showMenu();
            Scanner scan = new Scanner(System.in);
            int selector = Integer.parseInt(scan.nextLine());
            switch(selector) {
                case 1:
                ShowMenu.openNewAccountMenu();
                    Scanner accountOpenScanner = new Scanner(System.in);
                    int accountOpenSelector = Integer.parseInt(accountOpenScanner.nextLine());
                    if(accountOpenSelector == 1) {
                        createAccount();
                    }
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

