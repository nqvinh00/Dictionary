package Dictionary;

import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {
    private ArrayList<Word> words = new ArrayList<Word>();

    public void addWord(String w, String d) {
        Word word = new Word(w, d);
        words.add(word);
    }

    public void showWords() {
        System.out.printf("%-20s %-20s %-20s%n","No", "English", "Vietnamese");
        for (int i = 0; i < words.size(); i++)
        {
            System.out.printf("%-20d %-20s %-20s%n", i + 1, words.get(i).getWord(), words.get(i).getMeaning());
        }
    }

    public int getCurrentSize() {
        return words.size();
    }

    public Word findWord(String w) {
        int left = 0, right = words.size();
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int res = w.compareTo(words.get(mid).getWord());
            if (res == 0) {
                return words.get(mid);
            } else if (res > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public String searchWord(String w) {
        String output = "";
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).getWord().startsWith(w)) {
                output += words.get(i).getWord() + "\n";
            }
        }
        return output;
    }

    public int findIndex(String w) {
        int index = -1;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).getWord().equals((w))) {
                index = i;
            }
        }
        return index;
    }

    public void deleteWord(String w) {
        int index = findIndex(w);
        if (index != -1) {
            words.remove(index);
        } else {
            System.out.println("Không tìm thấy từ");
        }
    }

    public void modifyWord(String w) {
        int index = findIndex(w);
        if (index != -1) {
            words.set(index ,new Word(w, words.get(index).getMeaning()));
        } else {
            System.out.println("Không tìm thấy từ");
        }
    }

    public void modifyMeaning(String w) {
        int index = findIndex(w);
        if (index != -1) {
            Scanner in = new Scanner(System.in);
            System.out.print("Nhập nghĩa để điều chỉnh: ");
            String newMean = in.nextLine();
            words.set(index ,new Word(words.get(index).getWord(), newMean));
        } else {
            System.out.println("Không tìm thấy từ");
        }
    }

    public String outputToExport() {
        String output = "";
        for (int i = 0; i < words.size(); i++)
        {
            output += words.get(i).getWord() + "\t" + words.get(i).getMeaning() + "\n";
        }
        return output;
    }
}