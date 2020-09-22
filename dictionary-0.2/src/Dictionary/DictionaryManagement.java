package Dictionary;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DictionaryManagement {
    private Dictionary dictionary = new Dictionary();
//    private String source_path = "../../docs/dictionaries.txt";

    public void insertFromCommandLine() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int number_of_words = in.nextInt();
        in.nextLine();
        for (int i = 0; i < number_of_words; i++) {
            System.out.print("Enter english word: ");
            String w = in.nextLine();
            System.out.print("Enter meaning of entered word: ");
            String d = in.nextLine();
            dictionary.addWord(w, d);
        }
    }

    public void insertFromFile() {
        try {
            File file = new File("/home/vinh/Documents/Dictionary/docs/dictionaries.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] word_with_meaning = scanner.nextLine().split("\t");
                dictionary.addWord(word_with_meaning[0], word_with_meaning[1]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String dictionaryLookup() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter word to search: ");
        String w = in.nextLine();
        Word find_word = dictionary.findWord(w);
        String output;
        if (find_word == null) {
            output = "Word not found";
        } else {
            output = "Word: " + find_word.getWord() + "\nMeaning: " + find_word.getMeaning() + "\n";
        }
        return output;
    }

    public void showDictionary() {
        dictionary.showWords();
    }
}
