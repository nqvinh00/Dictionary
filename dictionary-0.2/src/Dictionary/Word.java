package Dictionary;

public class Word {
    private String word_target;
    private String word_explain;

    public Word(String w, String d) {
        word_target = w;
        word_explain = d;
    }

    public Word(Word w) {
        word_target = w.word_target;
        word_explain = w.word_explain;
    }

    public String getWord() {
        return word_target;
    }
    public String getMeaning() {
        return word_explain;
    }
}