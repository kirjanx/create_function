import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Function function = new Function();
        NewFileTitle title = new NewFileTitle();

        function.getParameters();

        String fileName = ConsoleMenu.getPath();

        title.newFileName(fileName);

        function.fileOperations();

        title.printPathToTheResultFile();
    }
}