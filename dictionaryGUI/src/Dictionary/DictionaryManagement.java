package Dictionary;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Nguyen Vinh
 */
public class DictionaryManagement {
    private Dictionary dictionary = new Dictionary();

    /**
     * constructor call insertFromFile.
     */
    public DictionaryManagement() {
        insertFromFile();
    }

    /**
     * insert word from commandline.
     * not use in version
     */
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

    /**
     * size of dictionary getter.
     * @return dictionary size
     */
    public int getSize() {
        return dictionary.getCurrentSize();
    }

    /**
     * insert words list from file.
     */
    public void insertFromFile() {
        try {
//            File file = new File("docs/dictionaries.txt");
            File file = new File(String.valueOf(ClassLoader.getSystemResource("dictionaries.txt").getFile()));
//            File file = new File(getClass().getClassLoader().getResource("dictionaries.txt").getFile());
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] word_with_meaning = scanner.nextLine().split("\t", 2);
                dictionary.addWord(word_with_meaning[0], word_with_meaning[1]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * call addWord method of Dictionary object.
     * @param word Word.word
     * @param meaning Word.meaning
     */
    public void addWord(String word, String meaning) {
        dictionary.addWord(word, meaning);
    }

    /**
     * export dictionary after modify to file, useless with database ver.
     */
    public void exportToFile() {
        try {
            File file = new File(String.valueOf(ClassLoader.getSystemResource("dictionaries.txt").getFile()));
            FileOutputStream outputFile = new FileOutputStream(file, false);
            OutputStreamWriter writer = new OutputStreamWriter(outputFile);
            writer.write(dictionary.outputToExport());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * call deleteWord method of Dictionary object.
     * @param word Word.word to delete
     */
    public void deleteWordFromDictionary(String word) {
        dictionary.deleteWord(word);
    }

    /**
     * call findWord method of Dictionary object.
     * @param word to find
     * @return word object needed
     */
    public Word dictionaryLookup(String word) {
        return dictionary.findWord(word);
    }

    /**
     * call modifyWord method of Dictionary object.
     * @param word need to modify
     * @param replace word to replace
     * @return true if success
     */
    public boolean modifyWord(String word, String replace) {
        boolean status = dictionary.modifyWord(word, replace);
        return status;
    }

    /**
     * call modifyMeaning method of Dictionary object.
     * @param word need to modify
     * @param meaning meaning to replace
     * @return true if success
     */
    public boolean modifyMeaning(String word, String meaning) {
        boolean status = dictionary.modifyMeaning(word, meaning);
        return status;
    }

    /**
     * call searchWord method of Dictionary object.
     * @param w string to search word
     * @return list of similar word
     */
    public ArrayList dictionarySearcher(String w) {
        ArrayList<Word> output = dictionary.searchWord(w);
        if (output.size() == 0) {
            System.out.println("No results found");
            return null;
        } else {
            return output;
        }
    }

    /**
     * show all words, not use in this ver.
     */
    public void showDictionary() {
        dictionary.showWords();
    }
}