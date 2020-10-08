package Dictionary;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Nguyen Vinh
 */
public class Dictionary {
    private ArrayList<Word> words = new ArrayList<Word>();

    /**
     * add new Word with arraylist add method.
     * @param w word
     * @param m meaning
     */
    public void addWord(String w, String m) {
        Word word = new Word(w, m);
        words.add(word);
    }

    /**
     * display word and meaning.
     */
    public void showWords() {
        System.out.printf("%-20s %-20s %-20s%n","No", "English", "Vietnamese");
        for (int i = 0; i < words.size(); i++)
        {
            System.out.printf("%-20d %-20s %-20s%n", i + 1, words.get(i).getWord(), words.get(i).getMeaning());
        }
    }

    /**
     * get size of words array list.
     * @return words size
     */
    public int getCurrentSize() {
        return words.size();
    }

    /**
     * find word in words arraylist.
     * @param w word
     * @return word needed
     */
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

    /**
     * search for word start with <w>.
     * @param w string to search word
     * @return list of word startsWith(w)
     */
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

    /**
     * get index of word.
     * @param w word
     * @return index
     */
    public int findIndex(String w) {
        int index = -1;
        for (Word word : words) {
            if (word.getWord().equals((w))) {
                index = words.indexOf(word);
            }
        }
        return index;
    }

    /**
     * delete word.
     * @param w word
     */
    public void deleteWord(String w) {
        int index = findIndex(w);
        if (index != -1) {
            words.remove(index);
        } else {
            System.out.println("Word not found");
        }
    }

    /**
     * modify word.
     * @param word word need to modify
     * @param replace replace word
     * @return true if success
     */
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

    /**
     * modify meaning of word.
     * @param w word neead to modify
     * @param meaning replaced meaning
     * @return true if success
     */
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

    /**
     * create output to export to file.
     * @return output
     */
    public String outputToExport() {
        String output = "";
        for (int i = 0; i < words.size(); i++)
        {
            output += words.get(i).getWord() + "\t" + words.get(i).getMeaning();
        }
        return output;
    }
}