package dima.p448;

import java.io.*;
import java.util.Formatter;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class ScannerDelimiter {
    private static String str = "15, 29, 33, 47, 59, 6, 74, 83, 91";


    public static void main(String[] args) {
        Scanner sc = new Scanner(str);
        Pattern p = Pattern.compile("\\S*\\d+\\S*");
        Formatter f = new Formatter(System.out);
        /**
        * символ s маленькое это любой пропуск(пробел, табуляция, переход на новую страницу),
        * а * - это квантификатор, означает повторение от 0 раз и более до бесконечности.
        */
//        sc.useDelimiter("\\s*,\\s*");

        while (sc.hasNext(p)) {
            sc.next(p);
            MatchResult match = sc.match();
            String group = match.group();
            f.format("The number %s%n", group);
        }
        sc.close();
    }
}
