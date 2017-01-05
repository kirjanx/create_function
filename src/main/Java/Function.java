import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Scanner;

public class Function {

    private String filePath;
    private int numberOfStrings;

    public void getParameters () {
        ConsoleMenu menu = new ConsoleMenu();
        menu.consoleMenu();
    }

    public void readFile() throws IOException {

        this.filePath = ConsoleMenu.getPath();

        FileInputStream inFile = new FileInputStream(filePath); //Use next filepath for tests - D:/all_pairs.txt
        byte[] str = new byte[inFile.available()];
        inFile.read(str, 0, inFile.available());

        System.out.println("File's content"); //Delete after testing

        for (int i = 0; i < str.length; i++) {

            System.out.print((char) str[i]);
        }
    }

    public void cutStringsFromFile () {

    }

    public void writeCutStringsInResultFile () {

    }

    public void saveInitialFileWithoutCutStrings () {

    }

   /*public String returnPathToInitialFile () {

        return ;

    }*/

//getters - setters
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }




}
