package com.company.design.observer;

public class ObserverPatternTest {

    /**
     * Observer 패턴은 편화가 일어났을 떄, 미리 등록된 다른 클래스에 통보해주는 패턴을 구현한 것
     * 대표적인 예시로 event listener 가 있음
     *
     */

    public static void main(String[] args) {
        Button button = new Button("버튼!");

        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });


        button.click("메시지 전달 : click!");
        button.click("메시지 전달 : click!");
        button.click("메시지 전달 : click!");
        button.click("메시지 전달 : click!");

    }
}
