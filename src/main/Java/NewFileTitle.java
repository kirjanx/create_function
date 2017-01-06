public class NewFileTitle {

    private String file;
    private String path;
    private String title;
    private String extension;

    public void newFileName () {
        this.file = ConsoleMenu.getPath();
        String parts[] = file.split("[/.]");

        this.path = parts[0];
        this.title = parts[1];
        this.extension = parts[2];

        //delete after tests
        System.out.println("path = " + path);
        System.out.println("title = " + title);
        System.out.println("ext = " + extension);

    }


    public String file() {
        return file;
    }

    public void setFilePath(String file) {
        this.file = file;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }













   /* private String fullPath;
    private char extensionSeparator;
    private char pathSeparator;

    public NewFileTitle (String str, char sep, char ext) {
        /*this.fullPath = "example";
        this.pathSeparator = '.';
        this.extensionSeparator = '/';
        //////
        fullPath = str;
        pathSeparator = sep;
        extensionSeparator = ext;///////////
    }

    public String extension () {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        return fullPath.substring(dot + 1);
    }

    //get name without extension
    public String filename () {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(0, sep);
    }

    ///!!!!!!!!!!!!!!!!!!!!!
    public void path () {

        System.out.println("Extension = " +myHomePage0extension());
    }


    public void setExtensionSeparator(char extensionSeparator) {
        this.extensionSeparator = extensionSeparator;
    }

    public void setPathSeparator(char pathSeparator) {
        this.pathSeparator = pathSeparator;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }
    */
}
