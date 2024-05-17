package nl.saxion.sdp.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVReader {
    private static Scanner fileReader;

    public CSVReader(String filename) throws FileNotFoundException {
        fileReader = new Scanner(new File(filename));
    }

    public static String readLine() {
        return fileReader.nextLine();
    }

    public static boolean hasNext() {
        return fileReader.hasNext();
    }
}
