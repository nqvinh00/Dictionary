package Dictionary;

/**
 * @author Nguyen Vinh
 */
public class Word {
    private String word;
    private String meaning;

    /**
     * default constructor.
     */
    public Word() {
        meaning = "";
        word = "";
    }

    /**
     * constructor with params.
     * @param w word
     * @param m meaning
     */
    public Word(String w, String m) {
        word = w;
        meaning = m;
    }

    /**
     * constructor copy.
     * @param w
     */
    public Word(Word w) {
        word = w.word;
        meaning = w.word;
    }

    /**
     * word setter.
     * @param word word
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * meaning setter.
     * @param meaning of word
     */
    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    /**
     * word getter.
     * @return word
     */
    public String getWord() {
        return word;
    }

    /**
     * meaning getter.
     * @return meaning
     */
    public String getMeaning() {
        return meaning;
    }
}