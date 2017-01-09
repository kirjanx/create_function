import org.apache.commons.lang3.StringUtils;

public class NewFileTitle {

    private String file;
    private String path1;
    private String extension1;
    private static String newFilePath1 = StringUtils.EMPTY;

    public void newFileName (String fileName) {

        this.file = fileName;
        String parts[] = file.split("[.]");

        this.path1 = parts[0];
        this.extension1 = parts[1];

        this.newFilePath1 = path1 + "_res." + extension1;
    }

    public void printPathToTheResultFile() {
        System.out.println(getNewFilePath1());
    }

    public String getPath1() {
        return path1;
    }

    public String getExtension1() {
        return extension1;
    }

    public static String getNewFilePath1() {
        return newFilePath1;
    }
}
