package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> wordsCount = new HashMap<>();
        if (sentence.isEmpty()){
            return wordsCount;
        }
        String[] wordsArray = sentence.split(" ");
        for (String word : wordsArray) {
            if (wordsCount.containsKey(word)) {
                wordsCount.put(word, wordsCount.get(word) + 1);
            } else {
                wordsCount.put(word, 1);
            }
        }
        return wordsCount;
    }

    public static String toString(Map<String, Integer> wordsCount) {
        StringBuilder s = new StringBuilder();
        if (wordsCount.isEmpty()) {
            return "{}";
        }
        s.append("{\n");
        for (Map.Entry<String, Integer> word: wordsCount.entrySet()) {
            s.append("  ").append(word.getKey()).append(": ").append(word.getValue()).append("\n");
        }
        s.append("}\n");
        return s.toString();
    }
}
//END
