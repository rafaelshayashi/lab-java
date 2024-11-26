package dev.hayashi.util;

import java.util.Locale;
import java.util.Scanner;

public class ScannerTests {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        var locale = new Locale("pt-br");
        scanner.useLocale(locale);

        while (scanner.hasNext()){
            String s = scanner.nextLine();
            System.out.println(s);
        }

    }
}
