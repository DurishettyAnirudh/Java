import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {

    public static void main(String[] args) {
        String selectedWord = null;
        int count = 0;

        // Read words from standard input
        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            count++;
            // Replace selectedWord with probability 1/count
            if (StdRandom.uniformInt(count) == 0) {
                selectedWord = word;
            }
        }

        // Print the selected random word
        if (selectedWord != null) {
            System.out.println(selectedWord);
        } else {
            System.out.println("No words were provided.");
        }
    }
}