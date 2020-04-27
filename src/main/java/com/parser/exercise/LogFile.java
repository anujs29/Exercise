package com.parser.exercise;

public class LogFile implements FileFormat {

    @Override
    public void getFormat() {
        System.out.println("Inside LogFile::getFormat() method.");
    }
}
