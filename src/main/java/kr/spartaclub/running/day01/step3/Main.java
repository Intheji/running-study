package kr.spartaclub.running.day01.step3;

public class Main {
    public static void main(String[] args) {

        Barista chulsoo = new Barista();
        Cashier younghee = new Cashier(chulsoo); // "영희야, 주문 들어오면 철수한테 말해줘"
        Customer gildong = new Customer();

        // 길동이는 영희(캐셔)에게만 말합니다.
        gildong.order("따뜻한 라떼", younghee);
    }
}
