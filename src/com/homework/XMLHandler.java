package com.homework;

public class XMLHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("\nВідкрити документи XMLHandler ↩");
        super.open();
    }

    @Override
    public void create() {
        System.out.println((char) 27 + "[35m" + "Створити документ XMLHandler ➕");
    }

    @Override
    public void change() {
        System.out.println("\nЗмінити документ XMLHandler ✔");
    }

    @Override
    public void save() {
        System.out.println("\nЗберегти документ XMLHandler?");
        super.save();
    }
}
