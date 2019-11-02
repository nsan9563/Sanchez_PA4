import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {
    //declare variables for class
    private Set<String>uniqueWords;

    //declare a method that will take the file name as input and remove the duplicate words using the Set
    public void remove( String dataFile ) throws FileNotFoundException  {
        //declare variables for method
        String word;
        uniqueWords = new HashSet<String>();
        Scanner in = new Scanner( new File( dataFile ) );

        //create a while loop to take input of words
        while( in.hasNext() ) {
            word = in.next();
            uniqueWords.add( word );

        }//end while loop

        //we close the file
        in.close();

    }//end remove method

    //create a method that will write the contents of Set to the output file
    public void write( String outputFile ) throws IOException {
        //declare variables for method
        File fOpen;
        FileWriter fWriter = null;
        String words;

        fOpen = new File( outputFile );

        //create an if condition to check if a file exists.
        if( fOpen.exists() )    {
            fWriter = new FileWriter( fOpen, true );
            Iterator itr = uniqueWords.iterator();

            //create a while loop to check for words on file
            while( itr.hasNext() ) {
                words = ( String )itr.next();
                fWriter.write( words + "\n" );

            }//end while loop

            //close the file
            fWriter.close();
            System.out.println("File exists.");
            System.out.println("Information has been written to current file");

        }//end if condition

        //use an else condition if a file does not exist
        else    {
            fOpen.createNewFile();
            fWriter = new FileWriter( fOpen );
            Iterator itr = uniqueWords.iterator();

            //create a while loop to check for words
            while ( itr.hasNext() )    {
                words = ( String )itr.next();
                fWriter.write( words + "\n" );

            }//end while loop

            //close file
            fWriter.close();
            System.out.println("File created.");
            System.out.println("Information has been written to current file");

        }//end else condition

    }//end write method

}//end DuplciateRemover class
