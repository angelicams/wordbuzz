package com.example;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class WordBuzzTest 
{
    
    
    @Test
    public void testCountCharsWithString() 
    {
        WordBuzz wb = new WordBuzz();
        ArrayList<String> al = new ArrayList<String>();
        al.add("text");
        int count = wb.countChars(al);
        assertEquals(4, count);
    }

    @Test
    public void testCountCharsWithEmpty()
    {
        WordBuzz wb = new WordBuzz();
        ArrayList<String> al = new ArrayList<String>();
        int count = wb.countChars(al);
        assertEquals(0, count);
    }

    @Test
    public void testCountWordsWithString()
    {
        WordBuzz wb = new WordBuzz();
        ArrayList<String> al = new ArrayList<String>();
        al.add("word");
        int count = wb.countWords(al);
        assertEquals(1, count);
    }

    @Test
    public void testCountWordsWithEmpty()
    {
        WordBuzz wb = new WordBuzz();
        ArrayList<String> al = new ArrayList<String>();
        int count = wb.countWords(al);
        assertEquals(0, count);
    }

    @Test
    public void testCountLinesWithString()
    {
        WordBuzz wb = new WordBuzz();
        ArrayList<String> al = new ArrayList<String>();
        al.add("string");
        int count = wb.countLines(al);
        assertEquals(1, count);
    }

    @Test
    public void testCountLinesWithEmpty()
    {
        WordBuzz wb = new WordBuzz();
        ArrayList<String> al = new ArrayList<String>();
        int count = wb.countLines(al);
        assertEquals(0, count);
    }

    @Test
    public void testLongestWordWithEmpty()
    {
        WordBuzz wb = new WordBuzz();
        ArrayList<String> al = new ArrayList<String>();
        String longest = wb.longestWord(al);
        assertEquals("No words found. :(", longest);
    }
    
    @Test
    public void testLongestWordWithWords()
    {
        WordBuzz wb = new WordBuzz();
        ArrayList<String> al = new ArrayList<String>();
        String theLongestWord = "Flaggstångsknoppsmålargesällen";
        al.add("text");
        al.add("text också");
        al.add(theLongestWord + " mycket text");
        String longest = wb.longestWord(al);
        assertEquals(theLongestWord, longest);
    }
}
