package com.parser.exercise;

public class XmlFile implements FileFormat {

    @Override
    public void getFormat() {
        System.out.println("Inside XmlFile::getFormat() method.");
    }
}
