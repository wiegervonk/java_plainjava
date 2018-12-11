package com.java_plainjava.readcsvfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCSVFile {

    public ReadCSVFile(String fileNaam) throws FileNotFoundException {
        File f;
        //Get scanner instance
        Scanner scanner = new Scanner(f = new File(fileNaam));
        System.out.println("ReadCSVFile = " + fileNaam +
                ", getName = " + f.getName() );
//                + ", Scanner.toString()" + scanner.toString());

        //Set the delimiter used in file
        scanner.useDelimiter(";");

        //Get all tokens and store them in some data structure
        //I am just printing them
        while (scanner.hasNext()) {
            System.out.print(scanner.next() + "|");
        }

        //Do not forget to close the scanner
        scanner.close();
    }
}