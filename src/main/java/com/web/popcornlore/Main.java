package com.web.popcornlore;

public class Main {

    public static void main(String[] args) {

        var a = new Inform();
        a.setName("홍길동");
        a.setAge(60);
        a.나이설정(120);
        a.한살더하기();
        System.out.println(a.getAge());

    }
}
