package com.company.design.adapter;

public class AdapterPatternTest {

    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        AirConditioner airConditioner = new AirConditioner();

        SocketAdapter socketAdapter = new SocketAdapter(airConditioner);

        connect(socketAdapter);

    }

    public static void connect(Electronic110V electronic100V) {
        electronic100V.powerOn();
    }
}
