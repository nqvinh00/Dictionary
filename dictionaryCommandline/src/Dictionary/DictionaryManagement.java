package Dictionary;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DictionaryManagement {
    private Dictionary dictionary = new Dictionary();
//    private String source_path = "../../docs/dictionaries.txt";

    public DictionaryManagement() {
        this.insertFromFile();
    }

    public void insertFromCommandLine() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập số lượng từ: ");
        int number_of_words = in.nextInt();
        in.nextLine();
        for (int i = 0; i < number_of_words; i++) {
            System.out.print("Nhập từ: ");
            String w = in.nextLine();
            System.out.print("Nhập nghĩa: ");
            String d = in.nextLine();
            dictionary.addWord(w, d);
        }
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

    public void exportToFile() {
        try {
//            FileWriter writer = new FileWriter("docs/dictionaries1.txt");
            FileWriter writer = new FileWriter("docs/dictionaries.txt");
            writer.write(dictionary.outputToExport());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteWordFromDictionary() {
        System.out.print("Nhập từ để xóa: ");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        dictionary.deleteWord(word);
    }

    public void dictionaryLookup() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập từ để tra: ");
        String w = in.nextLine();
        Word find_word = dictionary.findWord(w);
        String output;
        if (find_word == null) {
            output = "Không tìm thấy từ";
        } else {
            output = "Từ: " + find_word.getWord() + "\nNghĩa: " + find_word.getMeaning() + "\n";
        }
        System.out.println(output);
    }

    public void modifyWord() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập từ cần sửa: ");
        String w = in.nextLine();
        dictionary.modifyWord(w);
    }

    public void modifyMeaning() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập từ cần sửa nghĩa: ");
        String w = in.nextLine();
        dictionary.modifyMeaning(w);
    }

    public void dictionarySearcher() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập kí tự để tìm kiếm: ");
        String w = in.nextLine();
        String output = dictionary.searchWord(w);
        if (output.equals("")) {
            System.out.println("Không tìm thấy kết quả");
        } else {
            System.out.println("Từ bắt đầu với " + w + " :");
            System.out.println(output);
        }
    }

    public void showDictionary() {
        dictionary.showWords();
    }
}