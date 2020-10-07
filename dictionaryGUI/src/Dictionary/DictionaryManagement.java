package Dictionary;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DictionaryManagement {
    private Dictionary dictionary = new Dictionary();

    public DictionaryManagement() {
        insertFromFile();
    }

    public DictionaryManagement(Database db) {

    }

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

    public int getSize() {
        return dictionary.getCurrentSize();
    }

    public void insertFromFile() {
        try {
            File file = new File("docs/dictionaries.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] word_with_meaning = scanner.nextLine().split("\t", 2);
                dictionary.addWord(word_with_meaning[0], word_with_meaning[1]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addWord(String word, String meaning) {
        dictionary.addWord(word, meaning);
    }

    public void exportToFile() {
        try {
            FileWriter writer = new FileWriter("/home/vinh/Documents/Dictionary/docs/dictionaries1.txt");
            writer.write(dictionary.outputToExport());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteWordFromDictionary(String word) {
        dictionary.deleteWord(word);
    }

    public Word dictionaryLookup(String word) {
        return dictionary.findWord(word);
    }

    public boolean modifyWord(String word, String replace) {
        boolean status = dictionary.modifyWord(word, replace);
        return status;
    }

    public boolean modifyMeaning(String word, String meaning) {
        boolean status = dictionary.modifyMeaning(word, meaning);
        return status;
    }

    public ArrayList dictionarySearcher(String w) {
        ArrayList<Word> output = dictionary.searchWord(w);
        if (output.size() == 0) {
            System.out.println("No results found");
            return null;
        } else {
            return output;
        }
    }

    public void showDictionary() {
        dictionary.showWords();
    }
}