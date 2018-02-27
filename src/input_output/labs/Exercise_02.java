package input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      BONUS: If you are feeling bold, read back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

public class Exercise_02{
    public static void main(String[] args) throws IOException {
        BufferedReader in = null;
        PrintWriter out = null;

        try {
            in = new BufferedReader(new FileReader("/home/kezia/Documents/coding_exercises/ioexercise_copy.txt"));
            out = new PrintWriter(new FileWriter("/home/kezia/Documents/coding_exercises/ioexercise_copy2.txt"));
            String l;
            while ((l = in.readLine()) != null) {

                int count = 0;
                int numLoops = l.length();

                while (numLoops > 0) {
                    String character = String.valueOf(l.charAt(count));
                    if (character.equalsIgnoreCase("-")) {
                        character = "a";
                    } else if (character.equalsIgnoreCase("~")) {
                        character = "e";
                    }
                    out.print(character);
                    count++;
                    numLoops--;
                }
                out.println();
            }
        }

//        try{
//            in = new BufferedReader(new FileReader("/home/kezia/Documents/coding_exercises/ioexercise.txt"));
//            out = new PrintWriter(new FileWriter("/home/kezia/Documents/coding_exercises/ioexercise_copy.txt"));
//            String l;
//            while ((l = in.readLine()) != null){
//
//                int count = 0;
//                int numLoops = l.length();
//
//                while (numLoops>0){
//                    String character = String.valueOf(l.charAt(count));
//                    if (character.equalsIgnoreCase("a")){
//                        character = "-";
//                    }
//                    else if (character.equalsIgnoreCase("e")){
//                        character = "~";
//                    }
//                    out.print(character);
//                    count++;
//                    numLoops--;
//                }
//                out.println();
//            }
//        }
        finally {
            if (in != null){
                in.close();
            }
            if (out != null){
                out.close();
            }
        }
    }
}