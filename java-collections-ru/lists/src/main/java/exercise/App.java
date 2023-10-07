package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String setOfChars, String word) {
        setOfChars = setOfChars.toLowerCase();
        word = word.toLowerCase();

        List<String> charsList = new ArrayList<>();
        char[] setOfCharsArray = setOfChars.toCharArray();
        for (char l : setOfCharsArray) {
            charsList.add(String.valueOf(l));
        }

        List<String> wordCharsList = new ArrayList<>();
        char[] wordArray = word.toCharArray();
        for (char w : wordArray) {
            wordCharsList.add(String.valueOf(w));
        }

        for (String w : wordCharsList) {
            if (!charsList.contains(w)) {
                return false;
            }
            charsList.remove(w);
        }

        return true;
    }
}

//END
