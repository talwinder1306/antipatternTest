package org.antisingleton;

public class AntiSingletonPatternCaller {

    public static void callToAntiSingletonPattern() {
        AntiSingletonPattern.getInstance().mail();
    }
}
