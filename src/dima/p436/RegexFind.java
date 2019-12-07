package dima.p436;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFind {
//    private static String str = ;
    private static String[] reg = {"Java now has regular expressions", "^Java", "\\Breg.*", "n.w\\s+h(a|i)s","s?","s*","s+","s{4}","s{1}","s{0,3}"};
    private static String ss = "Java!!now!!has!!regular!!expressions";

    public static void main(String[] args) {
        for (String s:reg) {
            Pattern p = Pattern.compile(s);
            Matcher m = p.matcher(reg[0]);
            if (m.find()){
                System.out.println(s + " exist whithin our string argument");
            }
        }
    }
}
