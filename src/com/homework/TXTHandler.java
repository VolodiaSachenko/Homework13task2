package com.homework;

public class TXTHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("\nВідкрити документи TXTHandler ↩");
        super.open();
    }

    @Override
    public void create() {
        System.out.println((char) 27 + "[33m" + "Створити документ TXTHandler ➕");
    }

    @Override
    public void change() {
        System.out.println("\nЗмінити документ TXTHandler ✔");
    }

    @Override
    public void save() {
        System.out.println("\nЗберегти документ TXTHandler?");
        super.save();
    }
}
