# 은행 만들기 토이 프로젝트

1. Account라는 추상클래스를 만들고, 이를 상속하는 일반계좌, 적금계좌, 그리고 학생계좌 클래스들을 만들었습니다.
2. Account 타입의 ArrayList 자료구조를 만들고, 각 계좌가 생성될때마다 해당 객체를 추가되는 방식으로 코드를 작성했습니다.
3. 각 ArrayList 객체의 Key값으로 정수 타입의 index를 선언해주었고, 정적 필드로 선언했습니다.
4. Account에서 입출금 메서드는 추상 메서드로 작성하여, 각 자식클래스에 알맞게 구현 할 수 있게 했습니다.
5. 각각 계좌들의 정보는 Account의 getAccountInfo 메서드를 오버라이딩해서 리턴하도록 했습니다.
6. SavingsAccount(적금계좌) 클래스에서는 Java8에서 제공하는 LocalDate API를 사용해서 적금 만기일과 같은지 확인하는 로직을 넣었습니다.
