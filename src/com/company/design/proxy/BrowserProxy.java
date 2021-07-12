package com.company.design.proxy;

public class BrowserProxy implements IBroswer {

    private String url;
    private Html html;

    public BrowserProxy(String url) {
        this.url = url;
    }

    @Override
    public Html show() {
        if (html == null) {
            this.html = new Html(url);
            System.out.println("BrowserProxy loading html from : " + url);
        }
        System.out.println("use cache html : " + url);
        return html;
    }

}
