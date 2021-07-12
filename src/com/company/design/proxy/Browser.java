package com.company.design.proxy;

public class Browser implements IBroswer{

    private String url;

    public Browser(String url) {
        this.url = url;
    }

    @Override
    public Html show() {
        System.out.println("browser lodaing html from :" + url);
        return new Html(url);
    }
}
