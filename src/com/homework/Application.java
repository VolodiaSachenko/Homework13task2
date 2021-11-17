package com.homework;

import java.util.Scanner;

/**
 * @author Volodia Sachenko
 * @version 0.1
 * @since 16.11.21
 */

public class Application {
    static String scanning() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void useAllMethods(AbstractHandler abstractHandler) {
        abstractHandler.create();
        abstractHandler.open();
        abstractHandler.change();
        abstractHandler.save();
    }

    public static void main(String[] args) {
        System.out.println("Програма AbstractHandler 3000 \uD83D\uDCC4");
        System.out.println("Оберіть тип документа: TXT(1), DOC(2), XML(3)");
        String check = scanning();
        switch (check) {
            case "1":
                TXTHandler txtHandler = new TXTHandler();
                useAllMethods(txtHandler);
                break;
            case "2":
                DOCHandler docHandler = new DOCHandler();
                useAllMethods(docHandler);
                break;
            case "3":
                XMLHandler xmlHandler = new XMLHandler();
                useAllMethods(xmlHandler);
                break;
            default:
                System.out.println("\uD83D\uDEAB Помилка, введіть число від 1 до 3");
                break;
        }
    }
}
