package fileInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputExample {
    public static void main(String[] args) {
        printFile();
    }

    public static void printFile() {
        try {
            Scanner scan = new Scanner(new File("file.txt"));
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException f) {
            System.out.println("file.txt does not exist!");
        }
    }
}
