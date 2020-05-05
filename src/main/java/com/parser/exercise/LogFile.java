package com.parser.exercise;

public class LogFile implements FileFormat {

    @Override
    public void parse() {
        System.out.println("Inside LogFile::parse() method.");
    }
}
