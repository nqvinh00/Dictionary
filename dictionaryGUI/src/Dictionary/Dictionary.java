package Dictionary;

import java.lang.reflect.Array;
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
        int index = findIndex(w);
        if (index != -1) {
            return words.get(index);
        } else {
            return new Word();
        }
//        int left = 0, right = words.size();
//        System.out.println(right);
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            int res = w.compareTo(words.get(mid).getWord());
//            if (res == 0) {
//                return words.get(mid);
//            } else if (res > 0) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return new Word();
    }

    public ArrayList searchWord(String w) {
        if (w != "") {
            ArrayList<Word> output = new ArrayList<Word>();
            for (Word word : words) {
                if (word.getWord().startsWith(w)) {
                    output.add(word);
                }
            }
            return output;
        } else {
            return words;
        }
    }

    public int findIndex(String w) {
        int index = -1;
        for (Word word : words) {
            if (word.getWord().equals((w))) {
                index = words.indexOf(word);
            }
        }
        return index;
    }

    public void deleteWord(String w) {
        int index = findIndex(w);
        if (index != -1) {
            words.remove(index);
        } else {
            System.out.println("Word not found");
        }
    }

    public boolean modifyWord(String word, String replace) {
        int index = findIndex(word);
        if (index != -1) {
            words.set(index ,new Word(replace, words.get(index).getMeaning()));
            return true;
        } else {
            System.out.println("Word not found");
            return false;
        }
    }

    public boolean modifyMeaning(String w, String meaning) {
        int index = findIndex(w);
        if (index != -1) {
            words.set(index ,new Word(words.get(index).getWord(), meaning));
            return true;
        } else {
            System.out.println("Word not found");
            return false;
        }
    }

    public String outputToExport() {
        String output = "";
        for (int i = 0; i < words.size(); i++)
        {
            output += words.get(i).getWord() + "\t" + words.get(i).getMeaning();
        }
        return output;
    }
}