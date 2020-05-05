package com.parser.exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParserApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ParserApplication.class, args);

        /**
         * Use this "**" pattern to get object of concrete class by passing an information such as type.
         */

        FileFormat fileFormat = FileFormatPicker.getFormat(FileFormatType.LOG);
        if (fileFormat != null) {
            fileFormat.parse();
        } else {
            System.out.println("This file can not be parsed.");
        }
    }
}
