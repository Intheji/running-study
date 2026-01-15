package kr.spartaclub.running.day01.step2;

public class Main {
    public static void main(String[] args) {

        // 바리스타 한 명 나오세요!
        Barista bariKim = new Barista();

        // 손님 한 명 나오세요
        Customer sonny = new Customer();

        // 1. 정상적인(?) 손놈의 강탈 과정
        sonny.order("아이스 아메리카노", bariKim);
        sonny.order("카페라떼", bariKim);
        sonny.order("마끼아또", bariKim);
        sonny.order("뜨아", bariKim);
        sonny.order("두쫀쿠", bariKim);

        // 2. 대참사
        // 어떤 나쁜 마음을 먹은 개발자가 나타나서...
//        bariKim.beans = 0;
//        System.out.println("누군가 원두를 다 훔쳐감: " + bariKim.beans);
    }
}
