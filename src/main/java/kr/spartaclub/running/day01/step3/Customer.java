package kr.spartaclub.running.day01.step3;

// ⭕ GOOD Code: 메시지 전송 (Messaging)
public class Customer {

    // 이제 손님은 Barista를 알 필요가 없습니다. (느슨한 결합, Loose Coupling)
    public void order(String menuName, Cashier cashier) {

        System.out.println("손님: " + menuName + " 주세요!");

        // 손님은 캐셔만 믿고 주문합니다.
        Coffee coffee = cashier.takeOrder(menuName);

        if (coffee != null) {
            System.out.println("손님: (홀짝) 음~ " + coffee + " 맛있다.");
        } else {
            System.out.println("손님: (아쉽) 다음에 올게요.");
        }
    }
}
