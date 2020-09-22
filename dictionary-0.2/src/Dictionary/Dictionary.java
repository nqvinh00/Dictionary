package Dictionary;

import java.util.Scanner;

public class Dictionary {
    private Word[] words = new Word[50000];
    private int size = 0;

    public void addWord(String w, String d) {
        Word word = new Word(w, d);
        words[size] = word;
        size++;
    }

    public void showWords() {
        System.out.printf("%-20s %-20s %-20s%n","No", "English", "Vietnamese");
        for (int i = 0; i < size; i++)
        {
            System.out.printf("%-20d %-20s %-20s%n", i + 1, words[i].getWord(), words[i].getMeaning());
        }
    }

    public int getCurrentSize() {
        return size;
    }

    public Word findWord(String w) {
        int left = 0, right = size;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int res = w.compareTo(words[mid].getWord());
            if (res == 0) {
                return words[mid];
            } else if (res > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
