package com.example;

import java.util.Scanner;

import java.util.ArrayList;

/**
 * Festlig kommentar.
 *
 */
public class BuzzWords
{
    private static ArrayList<String> fetch(String message, String safeWord)
    {
        Scanner scan = new Scanner(System.in);
        String lastRead = "";
        ArrayList<String> allLines = new ArrayList<String>(); 
        System.out.println(message + safeWord);
        while (true) {

            lastRead = scan.nextLine();
            if (lastRead.equals(safeWord)) {
                break;
            }
            if (lastRead.contains(safeWord)) {
                allLines.add(lastRead.split(safeWord)[0]);
                break;
            }
            allLines.add(lastRead);
        }
        scan.close();
        return allLines;
    }
    public static void main( String[] args )
    {
        ArrayList<String> allLines = fetch("Enter text. To stop, enter ", "stop");
        WordBuzz wb = new WordBuzz();
        
        System.out.println("Chars: " + wb.countChars(allLines));
        System.out.println("Words: " + wb.countWords(allLines));
        System.out.println("Lines: " + wb.countLines(allLines));
        System.out.println("Longest word: " + wb.longestWord(allLines));
    }
}
