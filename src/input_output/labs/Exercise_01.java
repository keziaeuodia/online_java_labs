package input_output.labs;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a file byte by byte and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */
public class Exercise_01 {
    public static void main(String[] args) {

        BufferedInputStream InputStream = null;
        FileOutputStream out = null;

        try {
            InputStream = new BufferedInputStream(new FileInputStream("/home/kezia/Documents/coding_exercises/test.txt"));
            out = new FileOutputStream("/home/kezia/Documents/coding_exercises/test_copy.txt");
            int c;

            while ((c = InputStream.read()) != -1) {
                out.write(c);
            }
        } catch (IOException ioe){
            System.out.println("IOException caught");
            ioe.printStackTrace();
        }finally {
            try{
                if (InputStream != null) {
                    InputStream.close();
                }
                if (out != null) {
                    out.close();
                }
            }
            catch(IOException ioe){
                System.out.println("IOException caught - No connection to close ");
            }


        }
    }
}
