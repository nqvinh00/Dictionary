package Dictionary;

import java.util.Scanner;

public class DictionaryCommandline {
    private DictionaryManagement manager = new DictionaryManagement();

    public void showAllWords() {
        manager.showDictionary();
    }

    public void dictionaryBasic() {
        manager.insertFromCommandLine();
    }

    public void dictionaryAdvanced() {
        System.out.println("1. Hiển thị từ điển ");
        System.out.println("2. Tìm kiếm từ ");
        System.out.println("3. Tìm kiếm từ bắt đầu với kí tự ");
        System.out.println("4. Thêm từ ");
        System.out.println("5. Xóa từ ");
        System.out.println("6. Sửa từ");
        System.out.println("7. Sửa nghĩa");
        System.out.println("8. Xuất ra file");
        System.out.println("9. Thoát ra");
        System.out.print("Chọn yêu cầu: ");
        Scanner scanner = new Scanner(System.in);
        int command = scanner.nextInt();
        while (true) {
            if (command == 1) {
                manager.showDictionary();
            }
            if (command == 2) {
                manager.dictionaryLookup();
            }
            if (command == 3) {
                manager.dictionarySearcher();
            }
            if (command == 4) {
                manager.insertFromCommandLine();
            }
            if (command == 5) {
                manager.deleteWordFromDictionary();
            }
            if (command == 6) {
                manager.modifyWord();
            }
            if (command == 7) {
                manager.modifyMeaning();
            }
            if (command == 8) {
                manager.exportToFile();
            }
            if (command == 9) {
                break;
            }
        }
//        manager.insertFromFile();
//        showAllWords();
//        manager.dictionarySearcher();
//        manager.deleteWordFromDictionary();
//        manager.exportToFile();
//        String output = manager.dictionaryLookup();
//        System.out.println(output);
    }
}