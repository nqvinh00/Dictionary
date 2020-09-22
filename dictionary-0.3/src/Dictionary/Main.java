package Dictionary;

public class Main {
    public static void main(String[] args) {
        DictionaryManagement dcl = new DictionaryManagement();
        dcl.insertFromFile();
        dcl.showDictionary();
        dcl.dictionarySearcher();
    }
}