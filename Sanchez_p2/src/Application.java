import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        DuplicateCounter DC = new DuplicateCounter();

        //create textfile problem1.txt
        DC.count("problem2.txt");
        //output words to uniquewords textfile
        DC.write("unique_word_counts.txt");
    }//end main method
}