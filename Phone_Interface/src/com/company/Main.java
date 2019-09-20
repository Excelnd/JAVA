package com.company;

public class Main {

    public static void main(String[] args) {

        ITelephone ihsPhone;
        ihsPhone = new DeskPhone(3789624);
        ihsPhone.powerOn();
        ihsPhone.callPhone(3789624);
        ihsPhone.answer();

        ihsPhone = new MobilePhone(235647);
        ihsPhone.powerOn();
        ihsPhone.callPhone(235647);
        ihsPhone.answer();
    }
}
