package buzzfeedquiz;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import static org.junit.Assert.*;

public class BuzzfeedquizTest {

    @Test
    public void testReadFile() throws Exception{
        Buzzfeedquiz check = new Buzzfeedquiz();
        String pathExpected = new File("buzzfeedquiz.txt").getAbsolutePath();
        FileReader fileExpected = new FileReader(pathExpected);
        FileReader newfile = check.getFile("buzzfeedquiz.txt");
        BufferedReader readerExpected = new BufferedReader(fileExpected);
        BufferedReader readerFile = new BufferedReader(newfile);

        while(readerExpected.readLine() != null && readerFile.readLine() != null ){

            assertEquals(readerExpected.readLine(),readerFile.readLine());
        }
    }
}