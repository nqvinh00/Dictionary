package Dictionary;

import java.util.Scanner;

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

    public void showDictionary() {
        dictionary.showWords();
    }
}
