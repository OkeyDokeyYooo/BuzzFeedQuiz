package buzzfeedquiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Buzzfeedquiz {
    //Main function
    public static void main(String[] args) throws Exception {

        String basePath = new File("buzzfeedquiz.txt").getAbsolutePath();         // this will give a absolutePath no matter in anyone's computer

        new Buzzfeedquiz().readFile(basePath);          //Calling the readFile function

    }
    public FileReader getFile(String basePath) throws Exception{
        FileReader file = new FileReader(basePath);
        return file;
    }
    // readFile function
    public void readFile(String basePath) throws Exception {
        FileReader file = getFile(basePath);         //getting the file and store in the file variable

        BufferedReader reader = new BufferedReader(file);          //then the reader start to read

        String lineFromFile = reader.readLine();        // the lineFromFile will get only one line from the file

        int readLineNumber = 0;          // count how many lines the lineFromFile read

        // each question has 7 lines
        // so once the number hit 7, then the program pause, wait user to input a value
        // this is the only way for me to solve these readFile problem
        int questionHasLineNumber = 7;

        Check result = new Check();          //create a new Check() class

        //read until to the end of the file
        while (lineFromFile != null){
            System.out.println(lineFromFile);
            lineFromFile = reader.readLine();
            readLineNumber++;

            //hit 7 lines then pause to get a input
            if (readLineNumber == questionHasLineNumber) {
                result.checkValid();
                readLineNumber = 0;
            }
        }
        //call the checkGrade() to check the user's final grade
        //give comments to these user
        result.checkGrade();
    }

}
