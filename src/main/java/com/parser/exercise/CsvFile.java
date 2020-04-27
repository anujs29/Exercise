package com.parser.exercise;

public class CsvFile implements FileFormat {

    @Override
    public void getFormat() {
        System.out.println("Inside CsvFile::getFormat() method.");
    }
}
