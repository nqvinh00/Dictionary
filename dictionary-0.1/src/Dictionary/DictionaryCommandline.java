package Dictionary;

public class DictionaryCommandline {
    private DictionaryManagement manager = new DictionaryManagement();

    public void showAllWords() {
        manager.showDictionary();
    }

    public void dictionaryBasic() {
        manager.insertFromCommandLine();
    }
}
