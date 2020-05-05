package com.parser.exercise;

public class FileFormatPicker {

    public static FileFormat getFormat(FileFormatType fileFormatType) {
        FileFormat fileFormat = null;
        switch (fileFormatType) {
            case LOG:
                fileFormat = new LogFile();
                break;
            case CSV:
                fileFormat = new CsvFile();
                break;
            case XML:
                fileFormat = new XmlFile();
                break;
        }
        return fileFormat;
    }
}
