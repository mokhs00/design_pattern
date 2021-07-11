package com.company.design.singleton;

public class SingletonPatternTest {

    public static void main(String[] args) {
        Aclazz aclazz = new Aclazz();

        Bclazz bclazz = new Bclazz();

        SocketClient aSocketClient = aclazz.getSocketClient();
        SocketClient bSocketClient = bclazz.getSocketClient();
        System.out.println(aSocketClient);
        System.out.println(bSocketClient);
        System.out.println(aSocketClient.equals(bSocketClient));
    }
}
