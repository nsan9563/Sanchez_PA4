import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {
    //declare variables for class
    private int wordCounter;
    private Map<String, Integer> countingWords;

    //create a constructor method
    public DuplicateCounter()   {
        this.countingWords = new HashMap<String, Integer>();

    }//end constructor DuplicateCounter

    //create a method to count the number of word occurrences
    public void count( String dataFile ) throws FileNotFoundException   {
        Scanner in = new Scanner( new File( dataFile ) );
        String words;

        //create a while loop to start counting words in the file
        while( in.hasNext() )   {
            words = in.next();
            Integer counter = countingWords.get( words );
            wordCounter++;

            //create an if condition to check if counter is not null, to start adding to counter
            if( counter != null )   {
                counter = counter + 1;

            }//end if condition
            else    {
                counter = 1;

            }//end else condition

            countingWords.put( words, counter);

        }//end while loop

    }//end count method

    //create a method that will write the results to a textfile
    public void write( String outputFile ) throws IOException   {
        FileWriter fWriter = new FileWriter( new File( outputFile ) );

        //create a for loop to check throughout the file and write it out
        for( Map.Entry<String, Integer> entry : countingWords.entrySet() )  {
            fWriter.write(entry.getKey() + ": " + entry.getValue() + "\n" );

        }//end for loop

        //display results
        fWriter.write("Number of words: " + wordCounter + "\n" );

        //close file
        System.out.println("File has been created.");
        fWriter.close();

    }//end write method

}//end public class DuplicateRemover
