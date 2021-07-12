package com.company.design.decorator;

public class DecoratorPatternTest {

    /**
     * Decorator pattern
     * 기존 뼈대 (클래스)는 유지하되, 이후 필요한 형태로 꾸밀 때 사용함
     * 확장이 필요한 경우 상속의 대안으로도 활용.
     * SOLID 중 OCP(개방폐쇄 원칙)과 DIP(의존 역전 원칙)를 따름
     *
     */

    public static void main(String[] args) {
        ICar audi = new Audi(10009);
        audi.showPrice();

        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();

        ICar audi4 = new A4(audi, "A4");
        audi4.showPrice();


        ICar audi5 = new A5(audi, "A5");
        audi5.showPrice();




    }
}
