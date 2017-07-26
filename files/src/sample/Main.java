package sample;

import java.io.*;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<String, String> envMap = System.getenv();
        printMap(envMap, "Environment variables");

        System.getProperties().list(System.out);

        System.out.println("Create file");
        getTxtFile();
        writeToFile(getTxtFile());

        String parentOfTextFile = getTxtFile().getParent();
        System.out.println("Parent of text file: " + parentOfTextFile + ".");
    }

    private static void printMap(Map<String, String> mapToPrint, String descriptor) {
        System.out.println(descriptor);
        int i = 1;
        for (Map.Entry<String, String> envEntry: mapToPrint.entrySet()) {
            System.out.println(i++ + ": " + envEntry.getKey() + "/" + envEntry.getValue());
        }
        System.out.println();
    }

    private static File getAppDirectory() {
        return new File(System.getProperty("user.dir"));
    }

    private static File getSubFolder() {
        File subFolder = new File(getAppDirectory(), "subFolder");
        subFolder.mkdir();
        if(subFolder.exists()) return subFolder;
        else return null;
    }

    private static File getTxtFile() throws IOException {
        File textFile = new File(getSubFolder(), "textFile.txt");
        textFile.createNewFile();
        if(textFile.exists()) return textFile;
        else return null;
    }

    private static void writeToFile(File writeTo) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter printWriter = new PrintWriter(writeTo, "UTF-8");
        printWriter.println("First line.");
        printWriter.println("Second line.");
        printWriter.close();
    }
}

