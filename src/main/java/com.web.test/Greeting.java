package com.web.test;

public class Greeting {

    private String id;
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static void main(String[] args) {
        Greeting g1 = new Greeting();
        g1.setId("1");
        g1.setContent("bbbb");
        Greeting g2 = new Greeting();
        g2.setId("2");
        g2.setContent("eghg");
        System.out.println(g1.getId());
        System.out.println(g2.getId());
    }

}
