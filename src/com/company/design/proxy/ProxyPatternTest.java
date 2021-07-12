package com.company.design.proxy;

import com.company.design.proxy.aop.AopBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class ProxyPatternTest {
    /**
     * Proxy 는 대리인! 뭔가 대신해서 처리한다.
     * Proxy 클래스를 통해서 대신 전달하는 형태로 설꼐되며, 실제 Client는 Proxy로부터 결과를 받는다.
     * Cache의 기능으로도 활용 가능
     * SOLID 중 OCP(개방폐쇄 원칙)과 DIP(의존 역전 원칙)을 따름
     *
     */

    public static void main(String[] args) {
//        Browser browser = new Browser("kakaocorp.com");
//
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();


//        IBroswer broswer = new BrowserProxy("kakaocop.com");
//        broswer.show();
//        broswer.show();
//        broswer.show();

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBroswer aopBrowser = new AopBrowser("kakaocop.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());

                },
                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                });

        aopBrowser.show();
        System.out.println("loading time : " + end.get());

        aopBrowser.show();
        System.out.println("loading time : " + end.get());

        aopBrowser.show();
        System.out.println("loading time : " + end.get());


    }
}
