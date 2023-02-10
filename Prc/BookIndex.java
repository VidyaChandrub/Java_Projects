import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookIndex {
    public static void main(String[] args) {
        List<String> excludeWords = new ArrayList<>();
        Map<String, List<Integer>> index = new HashMap<>();

        try {
            // Read exclude words from file
            BufferedReader excludeWordsReader = new BufferedReader(new FileReader("exclude-words.txt"));
            String line;
            while ((line = excludeWordsReader.readLine()) != null) {
                excludeWords.add(line.trim().toLowerCase());
            }
            excludeWordsReader.close();

            // Read pages and create index
            for (int pageNum = 1; pageNum <= 3; pageNum++) {
                BufferedReader pageReader = new BufferedReader(new FileReader("Page" + pageNum + ".txt"));
                while ((line = pageReader.readLine()) != null) {
                    String[] words = line.split("\\s+");
                    for (String word : words) {
                        word = word.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
                        if (!excludeWords.contains(word) && !word.isEmpty()) {
                            if (!index.containsKey(word)) {
                                index.put(word, new ArrayList<>());
                            }
                            index.get(word).add(pageNum);
                        }
                    }
                    pageReader.close();
                }
            }

            // Write index to file
            FileWriter indexWriter = new FileWriter(new File("index.txt"));
            for (Map.Entry<String, List<Integer>> entry : index.entrySet()) {
                indexWriter.write(entry.getKey() + " : " + entry.getValue().toString().replace("[", "").replace("]", "") + "\n");
            }
            indexWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
