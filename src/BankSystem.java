import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class BankSystem {
    public static ArrayList<Account> accountList = new ArrayList<>();
    public static int index = 0;
    public static void createNormalAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("계좌번호: ");
        String accountNumber = sc.nextLine();
        System.out.println("이름: ");
        String name = sc.nextLine();
        System.out.println("금액: ");
        int balance = sc.nextInt();
        
        accountList.add(index, new NormalAccount(accountNumber, name, balance));
        index++;
    }
    public static void createStudentAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("계좌번호: ");
        String accountNumber = sc.nextLine();
        System.out.println("이름: ");
        String name = sc.nextLine();
        System.out.println("금액: ");
        int balance = sc.nextInt();
        
        accountList.add(index, new StudentAccount(accountNumber, name, balance));
        index++;
    }
    public static void createSavingsAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("계좌번호: ");
        String accountNumber = sc.nextLine();
        System.out.println("이름: ");
        String name = sc.nextLine();
        System.out.println("적금 만기일(연도): ");
        int expireYear = sc.nextInt(); 
        System.out.println("적금 만기일(월): ");
        int expireMonth = sc.nextInt(); 
        System.out.println("적금 만기일(일): ");
        int expireDate = sc.nextInt(); 
        System.out.println("금액: ");
        int balance = sc.nextInt();

        LocalDate targetDate = LocalDate.of(expireYear, expireMonth, expireDate);
        accountList.add(index, new SavingsAccount(accountNumber, name, balance, targetDate));
        index++;
    }
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
            System.out.println("4. 계좌조회");
            System.out.println("5. 종료");
            System.out.println("항목을 선택하세요");
            System.out.println("========================");
            Scanner scan = new Scanner(System.in);
            int selector = scan.nextInt();
            switch(selector) {
                case 1:
                    System.out.println("계좌개설 칸이 선택되었습니다.");
                    System.out.println("계좌를 선택해주세요.");
                    System.out.println("========================");
                    System.out.println("1. 일반 계좌");
                    System.out.println("2. 학생 계좌");
                    System.out.println("3. 적금");
                    System.out.println("========================");
                    Scanner accountOpenScanner = new Scanner(System.in);
                    int accountOpenSelector = accountOpenScanner.nextInt();
                    switch(accountOpenSelector) {
                        case 1:
                            createNormalAccount();
                            break;
                        case 2:
                            createStudentAccount();
                            break;
                        case 3:
                            createSavingsAccount();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("입금 칸이 선택되었습니다.");
                    System.out.println("계좌번호를 입력해주세요.");
                    String accountNumberToFind = new Scanner(System.in).nextLine();
                    for(int i = 0; i <accountList.size(); i++) {
                        if(accountList.get(i).getAccountNumber().equals(accountNumberToFind)) {
                            System.out.println("========================");
                            System.out.println("입금 금액을 입력해주세요.");
                            int moneyToDeposit = new Scanner(System.in).nextInt();
                            System.out.println("========================");
                            accountList.get(i).deposit(moneyToDeposit);
                            System.out.println("입금이 성공적으로 됐습니다");
                            System.out.println("업데이트된 계좌 정보:");
                            System.out.println(accountList.get(i).getAccountInfo());
                        }
                        else {
                            System.out.println("계좌번호가 이상합니다. 처음부터 다시하십시오");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("출금 칸이 선택되었습니다.");
                    System.out.println("계좌번호를 입력해주세요.");
                    String accountNumberToFind2 = new Scanner(System.in).nextLine(); 
                    for(int i = 0; i <accountList.size(); i++) {
                        if(accountList.get(i).getAccountNumber().equals(accountNumberToFind2)) {
                            System.out.println("========================");
                            System.out.println("출금 금액을 입력해주세요.");
                            int moneyToWithdraw = new Scanner(System.in).nextInt();
                            System.out.println("========================");
                            accountList.get(i).withdraw(moneyToWithdraw);
                            System.out.println("업데이트된 계좌 정보:");
                            System.out.println(accountList.get(i).getAccountInfo());
                        }
                        else {
                            System.out.println("계좌번호가 이상합니다. 처음부터 다시하십시오");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("계좌조회 칸이 선택되었습니다");
                    System.out.println("총 "+accountList.size()+"개의 계좌가 개설되어 있습니다");
                    System.out.println("========================");
                    for(int i=0; i<accountList.size(); i++) {
                        System.out.println(accountList.get(i).getAccountInfo());
                    }
                case 5:
                    System.out.println("프로그램이 종료됩니다");
                    isExit = true;
                    break;
            }
        } while(!isExit);
    }
}

