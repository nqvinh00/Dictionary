package Dictionary;

import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Menu {
    private JPanel rootPanel;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JTextField enterWordTextField;
    private JButton button1;
    private JList wordList;
    private JTextArea textArea1;
    private DictionaryManagement dm = new DictionaryManagement();
    private ArrayList<Word> words = new ArrayList<Word>();

    public void defaultPage() {
        DefaultListModel word = new DefaultListModel();
        words = dm.dictionarySearcher("");
        for (int i = 0; i < words.size(); i++) {
            word.addElement(words.get(i).getWord());
        }
        wordList.setModel(word);
    }

    public Menu() {
        defaultPage();
        enterWordTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent documentEvent) {
                warn(documentEvent);
            }

            @Override
            public void removeUpdate(DocumentEvent documentEvent) {
                warn(documentEvent);
            }

            @Override
            public void changedUpdate(DocumentEvent documentEvent) {
                warn(documentEvent);
            }

            public void warn(DocumentEvent documentEvent) {
                DefaultListModel word = new DefaultListModel();
                String input = enterWordTextField.getText();
                words = dm.dictionarySearcher(input);
                if (words != null) {
                    for (int i = 0; i < words.size(); i++) {
                        word.addElement(words.get(i).getWord());
                    }
                }
                wordList.setModel(word);
                if (words == null || input.equals("")) {
                    textArea1.setText("");
                }
            }
        });


        wordList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int index = wordList.locationToIndex(e.getPoint());
                if (words != null) {
                    String meaning = words.get(index).getMeaning();
                    System.out.println(meaning);
                    textArea1.setText(meaning);
                }
            }
        });
    }

    public static void runApplication() {
        FlatDarkFlatIJTheme.install();
        try {
            UIManager.setLookAndFeel(String.valueOf(new FlatDarkFlatIJTheme()));
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        JFrame frame = new JFrame("Dictionary");
        frame.setContentPane(new Menu().rootPanel);;
        frame.setPreferredSize(new Dimension(900, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        new Menu();
    }

    public static void main(String[] args) {
        runApplication();
    }
}
