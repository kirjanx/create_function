import javafx.scene.shape.Path;

import java.util.Scanner;

public class Function {

    private String filePath;
    private int numberOfStrings;

    public void getParameters () {

        ConsoleMenu menu = new ConsoleMenu ();
        menu.consoleMenu();

        this.filePath = ConsoleMenu.getPath();
        this.numberOfStrings = ConsoleMenu.getNumber();

    }

  public void readFile () {


      this.filePath = ConsoleMenu.getPath();
      this.numberOfStrings = ConsoleMenu.getNumber();


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
