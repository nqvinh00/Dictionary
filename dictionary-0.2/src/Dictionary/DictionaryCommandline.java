package Dictionary;

public class DictionaryCommandline {
    private DictionaryManagement manager = new DictionaryManagement();

    public void showAllWords() {
        manager.showDictionary();
    }

    public void dictionaryBasic() {
        manager.insertFromCommandLine();
    }

    public void dictionaryAdvanced() {
        manager.insertFromFile();
        showAllWords();
        String output = manager.dictionaryLookup();
        System.out.println(output);
    }
}
