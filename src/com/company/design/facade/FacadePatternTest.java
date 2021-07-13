package com.company.design.facade;

public class FacadePatternTest {
    /*
        Facade는 건물 안쪽 정면이라는 뜻
        여러 개의 객체와 실제 사용하는 서브 객체 사이에 복잡한 의존관계가 있을 때 중간에 facade 객체를 두고 이 객체가 제공한느 interface만을 활용하여 기능을 사용하는 방식
        facade는 자신이 가지고 있는 각 클래스의 기능을 명확히 알아야함
     */

    public static void main(String[] args) {
//        Ftp ftpClient = new Ftp("www.mokhs.com", 22, "/home");
//        ftpClient.connect();
//        ftpClient.moveDirectory();
//
//        Writer writer = new Writer("text.txt");
//        writer.fileConnect();
//        writer.write();
//
//        Reader reader = new Reader("text.txt");
//        reader.fileConnect();
//        reader.fileRead();
//
//        reader.fileDisconnect();
//        writer.fileDisConnect();
//        ftpClient.disConnect();

        SftpClient sftpClient = new SftpClient("www.mokhs.com", 22, "/home", "test.txt");

        sftpClient.connect();

        sftpClient.write();

        sftpClient.read();

        sftpClient.disConnect();

    }
}
