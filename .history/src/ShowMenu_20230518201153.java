public class ShowMenu {
  public static void showMenu() {
    System.out.println("========================");
    System.out.println("한국은행");
    System.out.println("========================");
    System.out.println("1. 계좌개설");
    System.out.println("2. 입금");
    System.out.println("3. 출금");
    System.out.println("4. 종료");
    System.out.println("항목을 선택하세요");
    System.out.println("========================");
  }
  
  public static void openNewAccountMenu() {
    System.out.println("계좌개설 칸이 선택되었습니다.");
    System.out.println("계좌를 선택해주세요.");
    System.out.println("========================");
    System.out.println("1. 일반 계좌");
    System.out.println("2. 학생 계좌");
    System.out.println("3. 적금");
    System.out.println("========================");
    return;
  }
  public static void depositMenu() {
    System.out.println("입금 칸이 선택되었습니다.");
    System.out.println("계좌를 선택해주세요.");
    System.out.println("========================");
    System.out.println("1. 일반 계좌");
    System.out.println("2. 학생 계좌");
    System.out.println("3. 적금");
    System.out.println("========================");
    return;
  }
}
