package dima.p346;

import java.io.*;
import java.util.*;

public class Main {

    private static List<String> read(String str){
        List<String> file = new ArrayList<>();
        File f = new File(str);
        try {
            BufferedReader bf = new BufferedReader(new FileReader(f));
            String line;
            while((line = bf.readLine()) != null){
                Collections.addAll(file, line.toLowerCase().split("\\W+"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file);
        return file;
    }

    private static void count(List<String> list, Character...chars){
        Set<Character> set = new HashSet<>(Arrays.asList(chars));
        for(Character ch:set){
            int i=0;
            System.out.print("\"" + ch + "\"" + " LETTER IN: ");
            for(String s:list){

                int j=0;
                for(char c:s.toCharArray()){
                    if(ch==c){
                        j++;
                        i++;
                    }
                }
                System.out.print("\"" + s + "\" - " + j + "; ");
            }
            System.out.println("SUMMARY IN TEXT: " + i);
        }
    }

    public static void main(String[] args) {
        count(read("c:\\Old documents\\aaa.txt"), 'a','e','i', 'o','u','y');
    }

}