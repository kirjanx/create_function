public class NewFileTitle {

    private String file;
    private String path1;
    private String extension1;
    private static String NewFilePath1;

    public void newFileName (String fileName) {

        this.file = fileName;
        String parts[] = file.split("[.]");

        this.path1 = parts[0];
        this.extension1 = parts[1];

        this.NewFilePath1 = path1 + "_res." + extension1;
    }

    public void resultFilePath () {
        System.out.println("Result file path:" + NewFilePath1);
    }

    public String file() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getPath1() {
        return path1;
    }

    public void setPath1(String Path1) {
        this.path1 = path1;
    }

    public String getExtension1() {
        return extension1;
    }

    public void setExtension1(String Extension1) {
        this.extension1 = extension1;
    }

    public static String getNewFilePath1() {
        return NewFilePath1;
    }

    public void setNewFilePath1(String NewFilePath1) {
        this.NewFilePath1 = NewFilePath1;
    }

}
