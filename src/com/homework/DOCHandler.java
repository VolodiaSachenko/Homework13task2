package com.homework;

public class DOCHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("\nВідкрити документи DOCHandler ↩");
        super.open();
    }

    @Override
    public void create() {
        System.out.println((char) 27 + "[34m" + "Створити документ DOCHandler ➕");
    }

    @Override
    public void change() {
        System.out.println("\nЗмінити документ DOCHandler ✔");
    }

    @Override
    public void save() {
        System.out.println("\nЗберегти документ DOCHandler?");
        super.save();
    }
}
