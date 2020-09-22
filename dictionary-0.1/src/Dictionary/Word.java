package Dictionary;

public class Word {
    private String word_target;
    private String word_explain;

    public Word(String w, String d) {
        word_target = w;
        word_explain = d;
    }

    public String getWord() {
        return word_target;
    }
    public String getMeaning() {
        return word_explain;
    }
}