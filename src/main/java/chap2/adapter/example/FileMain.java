package chap2.adapter.example;

import java.io.IOException;

/**
 * Main 클래스. 프로그램 시작지점.
 * Client(의뢰자)의 역할.
 */
public class FileMain {

    public static void main(String[] args) {
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("file.txt");
            fileIO.setValue("year", "2004");
            fileIO.setValue("month", "4");
            fileIO.setValue("day", "21");
            fileIO.writeToFile("newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
