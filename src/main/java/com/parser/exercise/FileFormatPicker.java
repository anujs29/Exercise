package com.parser.exercise;

public class FileFormatPicker {

    public FileFormat getFormat(String fileFormat){
        if(fileFormat == null){
            return null;
        }
        if(fileFormat.equalsIgnoreCase("LOG")){
            return new LogFile();
        }
        return null;
    }
}
