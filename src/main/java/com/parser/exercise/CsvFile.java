package com.parser.exercise;

public class CsvFile implements FileFormat {

    @Override
    public void parse() {
        System.out.println("Inside CsvFile::parse() method.");
    }
}
