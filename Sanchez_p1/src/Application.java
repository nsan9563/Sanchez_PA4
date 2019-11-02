import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        DuplicateRemover DR = new DuplicateRemover();

        //create textfile problem1.txt
        DR.remove("problem1.txt");
        //output words to uniquewords textfile
        DR.write("unique_words.txt");

    }//end main method

}//end Application class
