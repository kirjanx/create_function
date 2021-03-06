import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Function {

    private String filePath;
    private String newFilePath;
    private int numberOfStrings;

    public void getParameters () {
        ConsoleMenu menu = new ConsoleMenu();
        menu.consoleMenu();
    }

    public ArrayList<String> createArray(String filePath) {

        ArrayList<String> strings = new ArrayList<String>();

        //read file

        try {
            BufferedReader in = new BufferedReader(new FileReader(filePath)); // - D:/all_pairs.txt
            String s;
            while ((s = in.readLine()) != null) {
                strings.add(s);
            }
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return strings;
    }

    public void fileOperations() throws IOException {

        this.filePath = ConsoleMenu.getPath();

        ArrayList<String> strings = createArray(filePath);

        //cut random number of strings + write cut strings to a NEW file

        newFilePath = NewFileTitle.getNewFilePath1();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(newFilePath));

            this.numberOfStrings = ConsoleMenu.getNumber();

            Collections.shuffle(strings);

            for (int i = 0; i < numberOfStrings; i++) {

                bw.write(strings.get(i) + "\r\n");
            }
            bw.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        //write cut strings to a NEW file

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));

            for (int i = numberOfStrings; i < 10; i++) {

                bw.write(strings.get(i) + "\r\n");
            }
            bw.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}
