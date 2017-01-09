import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

public class MainTest {

    @Ignore("Verify that file path was splitted correctly")
    @Test
    public void testNewFileNamePathIsValid() {

        NewFileTitle newFileTitle = new NewFileTitle();

        newFileTitle.newFileName("D:/all_pairs.txt");

        assertEquals(newFileTitle.getPath1(), "D:/all_pairs");
    }

    @Ignore("Verify that file extension was splitted correctly")
    @Test
    public void testNewFileNameExtensionIsValid() {

        NewFileTitle newFileTitle = new NewFileTitle();

        newFileTitle.newFileName("D:/all_pairs.txt");

        assertEquals(newFileTitle.getExtension1(), "txt");
    }

    @Ignore("Verify that new file full path is valid")
    @Test
    public void testNewFileNameResultPath() {

        NewFileTitle newFileTitle = new NewFileTitle();

        newFileTitle.newFileName("D:/all_pairs.txt");

        assertEquals(newFileTitle.getNewFilePath1(), "D:/all_pairs_res.txt");
    }

    @Test
    public void testCreateArray() throws IOException {

        Function function = new Function();

        ArrayList<String> strings = function.createArray("D:/all_pairs.txt");

        assertEquals(strings.size(), 10);
    }
}