package com.company.design.strategy;

public class StrategyPatternTest {

    /*

        Strategy Pattern : 전략 패턴
        객체 지향의 꽃
        유사한 행위들을 캡슐화하여, 객체의 행위를 바꾸고 싶은 경우 직접 변경하는 것이 아닌 전략만 변경하여 유연하게 확장하는 패턴
        SOLID 중 OCP와 DIP를 따름


        전략 패턴에는 다음 3가지가 필요함
        전략 메서드를 가진 전략 객체 (NormalStrategy, Base64Strategy)
        전략 객체를 사용하는 컨텍스트 (Encoder)
        전략 객체를 생성해 컨텍스트에 주입하는 클라이언트
     */

    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        EncodingStrategy base64 = new Base64Strategy();

        EncodingStrategy normal = new NormalStrategy();

        String message = "Hello World!";

        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);


        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);


        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);
    }
}
