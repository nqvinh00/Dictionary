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
        System.out.printf("%-20s %-20s %-20s%n", "No", "English", "Vietnamese");
        for (int i = 0; i < size; i++) {
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

    public String searchWord(String w) {
        String output = "";
        for (int i = 0; i < size; i++) {
            if (words[i].getWord().startsWith(w)) {
                output += words[i].getWord() + "\n";
            }
        }
        return output;
    }

    public int findIndex(String w) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (words[i].getWord().equals((w))) {
                index = i;
            }
        }
        return index;
    }

    public void deleteWord(String w) {
        int index = findIndex(w);
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                words[i] = words[i + 1];
            }
            size--;
        } else {
            System.out.println("Word not found");
        }
    }

    public void modifyWord(String w) {
        int index = findIndex(w);
        if (index != -1) {
            words[index] = new Word(w, words[index].getMeaning());
        } else {
            System.out.println("Word not found");
        }
    }

    public void modifyMeaning(String w) {
        int index = findIndex(w);
        if (index != -1) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter meaning to modify: ");
            String newMean = in.nextLine();
            words[index] = new Word(words[index].getWord(), newMean);
        } else {
            System.out.println("Word not found");
        }
    }

    public String outputToExport() {
        String output = "";
        for (int i = 0; i < size; i++) {
            output += words[i].getWord() + "\t" + words[i].getMeaning();
        }
        return output;
    }
}