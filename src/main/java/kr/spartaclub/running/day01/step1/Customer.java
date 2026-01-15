package kr.spartaclub.running.day01.step1;

// ❌ BAD Code: 남의 물건을 내 것처럼 쓰는 손님
public class Customer {

    public void order(String menuName, Barista barista) {
        System.out.println("손님: " + menuName + " 주세요.");

        // 여기가 문제입니다!
        // 손님이 직접 바리스타의 원두통을 확인합니다. (???)
        if (barista.beans >= 20) {
            // 심지어 직접 원두를 퍼갑니다.
            barista.beans -= 20;
            System.out.println("손님: (원두를 직접 갈아서 커피를 만듦) -> " + new Coffee(menuName));
        } else {
            System.out.println("손님: 원두가 부족하네... 못 먹겠다.");
        }
    }
}
