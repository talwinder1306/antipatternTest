package org.example;

import org.antisingleton.AntiSingletonPatternCaller;
import org.example.classes.Class5;
import org.example.fields.Field1;
import org.example.methods.Impl1;
import org.example.methods.SomeInterface;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        AntiSingletonPatternCaller.callToAntiSingletonPattern();
        System.out.println(Field1.HELLO);
        new Class5().method51("Hi");
        SomeInterface someInterface = new Impl1();
        someInterface.doSomething("Dance");
    }
}