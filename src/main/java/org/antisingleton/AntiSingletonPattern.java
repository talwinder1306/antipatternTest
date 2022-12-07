package org.antisingleton;

class AntiSingletonPattern {

    public static AntiSingletonPattern INSTANCE = new AntiSingletonPattern();

    private AntiSingletonPattern() {
        //throw new UnsupportedOperationException("Singleton INSTANCE creation is not allowed");
    }

    public static AntiSingletonPattern getInstance() {
        return INSTANCE;
    }

    public void mail() {
        System.out.println("Mail sent to external party");
    }
}