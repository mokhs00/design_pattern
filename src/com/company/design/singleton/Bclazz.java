package com.company.design.singleton;

public class Bclazz {

    private SocketClient socketClient;

    public Bclazz() {
        socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return socketClient;
    }
}
