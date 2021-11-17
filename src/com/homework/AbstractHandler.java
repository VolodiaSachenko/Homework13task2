package com.homework;

public abstract class AbstractHandler {

    public abstract void create();

    public abstract void change();

    public void open() {
        System.out.println("\uD83D\uDCC1 Folder 1");
        System.out.println("\uD83D\uDCC1 Folder 2");
        System.out.println("\uD83D\uDCC1 Folder 3");
        System.out.println("\uD83D\uDCC1 Folder 4");
    }

    public void save() {
        System.out.println("Введіть: Так (1) Ні (2) , чи будь-яку іншу клавішу для виходу із системи");
        String check = Application.scanning();
        switch (check) {
            case "1":
                System.out.println("✅ Зміни в документі успішно збережено.");
                break;
            case "2":
                System.out.println("❌ Документ не збережено");
                break;
            default:
                System.out.println("Вихід із системи");
                break;
        }
    }
}
