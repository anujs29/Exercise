package com.parser.exercise;

public class TextFileLogParser {

    public boolean isLogPresent(String logText, String searchText){

        return logText.contains(searchText);
    }
}
