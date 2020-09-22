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

    public void exportToFile() {
        try {
            FileWriter writer = new FileWriter("/home/vinh/Documents/Dictionary/docs/dictionaries1.txt");
            writer.write(dictionary.outputToExport());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteWordFromDictionary() {
        System.out.print("Enter word to delete: ");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        dictionary.deleteWord(word);
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

    public void modifyWord() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter word to modify meaning: ");
        String w = in.nextLine();
        dictionary.modifyMeaning(w);
    }

    public void modifyMeaning() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter word to modify: ");
        String w = in.nextLine();
        dictionary.modifyWord(w);
    }

    public void dictionarySearcher() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter some charaters to search: ");
        String w = in.nextLine();
        String output = dictionary.searchWord(w);
        if (output.equals("")) {
            System.out.println("No results found");
        } else {
            System.out.println("Word start with " + w + " :");
            System.out.println(output);
        }
    }

    public void showDictionary() {
        dictionary.showWords();
    }
}