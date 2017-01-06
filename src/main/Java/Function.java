import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Function {

    private String filePath;
    private String newFilePath;
    private int numberOfStrings;
    private int rand;

    public void getParameters () {
        ConsoleMenu menu = new ConsoleMenu();
        menu.consoleMenu();
    }

    public void fileOperations() throws IOException {

        //read file

        this.filePath = ConsoleMenu.getPath();

        ArrayList<String> strings = new ArrayList<String>();
            try {
                BufferedReader in = new BufferedReader(new FileReader(filePath)); // - D:/all_pairs.txt
                String s;
                while ((s = in.readLine()) != null) {
                    strings.add(s);
                    System.out.println(s);
                }
                in.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        System.out.println("-----------");//!!!!!!!delete after tests

        //generate random numbers + write cut strings to a NEW file


        //working with bugs

        newFilePath = NewFileTitle.getNewFilePath1();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(newFilePath));

            this.numberOfStrings = ConsoleMenu.getNumber();

            //random

            for (int i = 0; i < numberOfStrings; i++) {
                this.rand = (int) (Math.random() * 10); //need to add cases when random numbers are equal!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                System.out.println(strings.get(rand));//!!!!!!!delete after tests
                bw.write(strings.get(rand) + "\r\n");
            }
            bw.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }


        //rewrite initial file without selected strings


        /////////////////////need to correct! not working with RANDOM
        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));

            for (int i = 0; i < (10 - numberOfStrings); i++) {
                if (i != rand) {
                    bw.write(strings.get(i) + "\r\n");
                }
            }
            bw.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }


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


    public String getNewFilePath() {
        return newFilePath;
    }

    public void setNewFilePath(String newFilePath) {
        this.newFilePath = newFilePath;
    }
}
