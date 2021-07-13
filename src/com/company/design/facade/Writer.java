package com.company.design.facade;

public class Writer {

    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void write() {
        String msg = String.format("Writer %s로 write 합니다.", fileName);
        System.out.println(msg);
    }

    public void fileConnect() {
        String msg = String.format("Writer %s와의 연결을 종료합니다.", fileName);
        System.out.println(msg);
    }

    public void fileDisConnect() {
        String msg = String.format("Writer %s와 연결합니다.", fileName);
        System.out.println(msg);

    }
}
