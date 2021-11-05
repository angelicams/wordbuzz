package com.example;

import java.util.ArrayList;
import java.util.Arrays;

public class WordBuzz {

    public int countChars(ArrayList<String> lines) 
    {
        return lines
        .stream()
        .mapToInt(line -> line.length())
        .sum();
    }
     public int countWords(ArrayList<String> lines) 
    {
        return lines
        .stream()
        .mapToInt(line -> (line.split(" ")).length)
        .sum();
    }
    public int countLines(ArrayList<String> lines)
    {
        return lines.size();
    }

    public String longestWord(ArrayList<String> lines)
    {
        ArrayList<String> words = new ArrayList<String>();
        for (String str: lines) {
            words.addAll(Arrays.asList(str.split(" ")));
        }
        return words
        .stream()
        .reduce(
            (longest, current) -> {
                if (longest.length() > current.length()) {
                    return longest;
                } else {
                    return current;
                }
        })
        .orElse("No words found. :(");
    }
}
