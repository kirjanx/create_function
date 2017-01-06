import java.io.*;
import java.util.ArrayList;

public class Function {

    private String filePath;
    private int numberOfStrings;

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

        //generate random numbers + write cut strings to file

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:/all_pairs_NEW.txt"));////generate file name in separate class

            this.numberOfStrings = ConsoleMenu.getNumber();

            for (int i = 0; i < numberOfStrings; i++) {
                int randomNumber = (int) (Math.random() * 10); //need to add cases when random numbers are equal!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                System.out.println(strings.get(randomNumber));//!!!!!!!delete after tests
                bw.write(strings.get(randomNumber) + "\r\n");
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



}
