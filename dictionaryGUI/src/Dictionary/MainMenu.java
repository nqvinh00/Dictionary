/*
 * Created by JFormDesigner on Tue Sep 29 20:10:17 ICT 2020
 */

package Dictionary;

import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


/**
 * @author Nguyen Vinh
 */
public class MainMenu extends JFrame {
    private void initComponents() {
        dm = new DictionaryManagement();
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Nguyen Vinh
        frame1 = new JFrame();
        panel11 = new JPanel();
        p1 = new JPanel();
        home = new JLabel();
        p2 = new JPanel();
        wordTrans = new JLabel();
        p3 = new JPanel();
        paraTrans = new JLabel();
        p4 = new JPanel();
        modify = new JLabel();
        p5 = new JPanel();
        about = new JLabel();
        panel12 = new JPanel();
        panel6 = new JPanel();
        label5 = new JLabel();
        panel33 = new JPanel();
        aboutPane = new JPanel();
        textArea4 = new JTextArea();
        modifyPane = new JPanel();
        panel2 = new JPanel();
        label1 = new JLabel();
        textField2 = new JTextField();
        panel3 = new JPanel();
        label2 = new JLabel();
        panel4 = new JPanel();
        label3 = new JLabel();
        panel5 = new JPanel();
        label4 = new JLabel();
        homePane = new JPanel();
        panel9 = new JPanel();
        label10 = new JLabel();
        label8 = new JLabel();
        wordTransPane = new JPanel();
        panel34 = new JPanel();
        textField1 = new JTextField();
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        panel1 = new JPanel();
        scrollPane2 = new JScrollPane();
        textArea1 = new JTextArea();
        paraTransPane = new JPanel();
        panel7 = new JPanel();
        scrollPane3 = new JScrollPane();
        textArea2 = new JTextArea();
        scrollPane4 = new JScrollPane();
        textArea3 = new JTextArea();
        label6 = new JLabel();
        panel8 = new JPanel();
        label7 = new JLabel();

        //======== frame1 ========
        {
            var frame1ContentPane = frame1.getContentPane();

            //======== panel11 ========
            {
                panel11.setBackground(new Color(69, 73, 74));
                panel11.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
                border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER
                , javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font
                .BOLD ,12 ), java. awt. Color. red) ,panel11. getBorder( )) ); panel11. addPropertyChangeListener (
                new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r"
                .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );

                //======== p1 ========
                {
                    p1.setBackground(new Color(69, 73, 74));

                    //---- home ----
                    home.setText("Trang ch\u1ee7");
                    home.setIcon(new ImageIcon(getClass().getResource("/Dictionary/icons8-squared-menu-50.png")));
                    home.setFont(new Font("Inconsolata", Font.BOLD, 24));
                    home.setForeground(new Color(187, 211, 248));

                    GroupLayout p1Layout = new GroupLayout(p1);
                    p1.setLayout(p1Layout);
                    p1Layout.setHorizontalGroup(
                        p1Layout.createParallelGroup()
                            .addGroup(p1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(home, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(55, Short.MAX_VALUE))
                    );
                    p1Layout.setVerticalGroup(
                        p1Layout.createParallelGroup()
                            .addGroup(p1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(home, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                }

                //======== p2 ========
                {
                    p2.setBackground(new Color(69, 73, 74));

                    //---- wordTrans ----
                    wordTrans.setText("D\u1ecbch t\u1eeb");
                    wordTrans.setIcon(new ImageIcon(getClass().getResource("/Dictionary/icons8-search-50.png")));
                    wordTrans.setFont(new Font("Inconsolata", Font.BOLD, 24));
                    wordTrans.setForeground(new Color(187, 211, 248));

                    GroupLayout p2Layout = new GroupLayout(p2);
                    p2.setLayout(p2Layout);
                    p2Layout.setHorizontalGroup(
                        p2Layout.createParallelGroup()
                            .addGroup(p2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(wordTrans)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    p2Layout.setVerticalGroup(
                        p2Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(wordTrans)
                                .addContainerGap())
                    );
                }

                //======== p3 ========
                {
                    p3.setBackground(new Color(69, 73, 74));

                    //---- paraTrans ----
                    paraTrans.setText("D\u1ecbch \u0111o\u1ea1n");
                    paraTrans.setIcon(new ImageIcon(getClass().getResource("/Dictionary/icons8-window-search-50.png")));
                    paraTrans.setFont(new Font("Inconsolata", Font.BOLD, 24));
                    paraTrans.setForeground(new Color(187, 211, 248));

                    GroupLayout p3Layout = new GroupLayout(p3);
                    p3.setLayout(p3Layout);
                    p3Layout.setHorizontalGroup(
                        p3Layout.createParallelGroup()
                            .addGroup(p3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(paraTrans)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    p3Layout.setVerticalGroup(
                        p3Layout.createParallelGroup()
                            .addGroup(p3Layout.createSequentialGroup()
                                .addComponent(paraTrans, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 12, Short.MAX_VALUE))
                    );
                }

                //======== p4 ========
                {
                    p4.setBackground(new Color(69, 73, 74));

                    //---- modify ----
                    modify.setText("Ch\u1ec9nh s\u1eeda t\u1eeb");
                    modify.setIcon(new ImageIcon(getClass().getResource("/Dictionary/icons8-services-50.png")));
                    modify.setFont(new Font("Inconsolata", Font.BOLD, 24));
                    modify.setForeground(new Color(187, 211, 248));

                    GroupLayout p4Layout = new GroupLayout(p4);
                    p4.setLayout(p4Layout);
                    p4Layout.setHorizontalGroup(
                        p4Layout.createParallelGroup()
                            .addGroup(p4Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(modify)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    p4Layout.setVerticalGroup(
                        p4Layout.createParallelGroup()
                            .addGroup(p4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(modify)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                }

                //======== p5 ========
                {
                    p5.setBackground(new Color(69, 73, 74));

                    //---- about ----
                    about.setText("Th\u00f4ng tin");
                    about.setIcon(new ImageIcon(getClass().getResource("/Dictionary/icons8-about-50.png")));
                    about.setFont(new Font("Inconsolata", Font.BOLD, 24));
                    about.setForeground(new Color(187, 211, 248));

                    GroupLayout p5Layout = new GroupLayout(p5);
                    p5.setLayout(p5Layout);
                    p5Layout.setHorizontalGroup(
                        p5Layout.createParallelGroup()
                            .addGroup(p5Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(about)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    p5Layout.setVerticalGroup(
                        p5Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, p5Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(about)
                                .addContainerGap())
                    );
                }

                GroupLayout panel11Layout = new GroupLayout(panel11);
                panel11.setLayout(panel11Layout);
                panel11Layout.setHorizontalGroup(
                    panel11Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, panel11Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addGroup(panel11Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(GroupLayout.Alignment.LEADING, panel11Layout.createSequentialGroup()
                                    .addComponent(p1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 20, Short.MAX_VALUE))
                                .addComponent(p2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(p3, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(p4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(p5, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(25, 25, 25))
                );
                panel11Layout.setVerticalGroup(
                    panel11Layout.createParallelGroup()
                        .addGroup(panel11Layout.createSequentialGroup()
                            .addGap(119, 119, 119)
                            .addComponent(p1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(p2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(54, 54, 54)
                            .addComponent(p3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42)
                            .addComponent(p4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42)
                            .addComponent(p5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }

            //======== panel12 ========
            {
                panel12.setBackground(new Color(69, 73, 74));
                panel12.setLayout(null);

                //======== panel6 ========
                {
                    panel6.setBackground(new Color(69, 73, 74));

                    //---- label5 ----
                    label5.setIcon(new ImageIcon(getClass().getResource("/Dictionary/icons8-speaker-50.png")));
                    label5.setBackground(new Color(69, 73, 74));

                    GroupLayout panel6Layout = new GroupLayout(panel6);
                    panel6.setLayout(panel6Layout);
                    panel6Layout.setHorizontalGroup(
                        panel6Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                                .addContainerGap(8, Short.MAX_VALUE)
                                .addComponent(label5)
                                .addContainerGap())
                    );
                    panel6Layout.setVerticalGroup(
                        panel6Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                                .addContainerGap(8, Short.MAX_VALUE)
                                .addComponent(label5)
                                .addContainerGap())
                    );
                }
                panel12.add(panel6);
                panel6.setBounds(775, 65, 64, 64);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel12.getComponentCount(); i++) {
                        Rectangle bounds = panel12.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel12.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel12.setMinimumSize(preferredSize);
                    panel12.setPreferredSize(preferredSize);
                }
            }

            //======== panel33 ========
            {
                panel33.setLayout(new CardLayout());

                //======== aboutPane ========
                {

                    //---- textArea4 ----
                    textArea4.setBackground(new Color(69, 73, 74));
                    textArea4.setEditable(false);
                    textArea4.setLineWrap(true);
                    textArea4.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));

                    GroupLayout aboutPaneLayout = new GroupLayout(aboutPane);
                    aboutPane.setLayout(aboutPaneLayout);
                    aboutPaneLayout.setHorizontalGroup(
                        aboutPaneLayout.createParallelGroup()
                            .addGroup(aboutPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(textArea4)
                                .addContainerGap())
                    );
                    aboutPaneLayout.setVerticalGroup(
                        aboutPaneLayout.createParallelGroup()
                            .addGroup(aboutPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(textArea4, GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                }
                panel33.add(aboutPane, "card5");

                //======== modifyPane ========
                {

                    //======== panel2 ========
                    {
                        panel2.setBackground(new Color(69, 73, 74));

                        //---- label1 ----
                        label1.setText("Nh\u1eadp t\u1eeb");
                        label1.setFont(new Font("Inconsolata", Font.PLAIN, 20));
                        label1.setBackground(new Color(69, 73, 74));

                        //---- textField2 ----
                        textField2.setFont(new Font("Inconsolata", Font.PLAIN, 20));
                        textField2.setBackground(new Color(69, 73, 73));

                        //======== panel3 ========
                        {
                            panel3.setBackground(new Color(69, 73, 74));

                            //---- label2 ----
                            label2.setIcon(new ImageIcon(getClass().getResource("/Dictionary/icons8-add-property-50.png")));
                            label2.setBackground(new Color(69, 73, 74));
                            label2.setToolTipText("Th\u00eam t\u1eeb");

                            GroupLayout panel3Layout = new GroupLayout(panel3);
                            panel3.setLayout(panel3Layout);
                            panel3Layout.setHorizontalGroup(
                                panel3Layout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                                        .addContainerGap(18, Short.MAX_VALUE)
                                        .addComponent(label2)
                                        .addGap(16, 16, 16))
                            );
                            panel3Layout.setVerticalGroup(
                                panel3Layout.createParallelGroup()
                                    .addGroup(panel3Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(label2)
                                        .addContainerGap(19, Short.MAX_VALUE))
                            );
                        }

                        //======== panel4 ========
                        {
                            panel4.setBackground(new Color(69, 73, 74));
                            panel4.setToolTipText("X\u00f3a t\u1eeb");

                            //---- label3 ----
                            label3.setIcon(new ImageIcon(getClass().getResource("/Dictionary/icons8-remove-property-50.png")));
                            label3.setBackground(new Color(69, 73, 74));
                            label3.setToolTipText("X\u00f3a t\u1eeb");

                            GroupLayout panel4Layout = new GroupLayout(panel4);
                            panel4.setLayout(panel4Layout);
                            panel4Layout.setHorizontalGroup(
                                panel4Layout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                                        .addContainerGap(18, Short.MAX_VALUE)
                                        .addComponent(label3)
                                        .addGap(16, 16, 16))
                            );
                            panel4Layout.setVerticalGroup(
                                panel4Layout.createParallelGroup()
                                    .addGroup(panel4Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(label3)
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            );
                        }

                        //======== panel5 ========
                        {
                            panel5.setBackground(new Color(69, 73, 74));
                            panel5.setToolTipText("Ch\u1ec9nh s\u1eeda");

                            //---- label4 ----
                            label4.setBackground(new Color(69, 73, 74));
                            label4.setIcon(new ImageIcon(getClass().getResource("/Dictionary/icons8-edit-property-50.png")));
                            label4.setToolTipText("Ch\u1ec9nh s\u1eeda");

                            GroupLayout panel5Layout = new GroupLayout(panel5);
                            panel5.setLayout(panel5Layout);
                            panel5Layout.setHorizontalGroup(
                                panel5Layout.createParallelGroup()
                                    .addGroup(panel5Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(label4)
                                        .addContainerGap(20, Short.MAX_VALUE))
                            );
                            panel5Layout.setVerticalGroup(
                                panel5Layout.createParallelGroup()
                                    .addGroup(panel5Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(label4)
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            );
                        }

                        GroupLayout panel2Layout = new GroupLayout(panel2);
                        panel2.setLayout(panel2Layout);
                        panel2Layout.setHorizontalGroup(
                            panel2Layout.createParallelGroup()
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGroup(panel2Layout.createParallelGroup()
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addGap(105, 105, 105)
                                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addGap(91, 91, 91)
                                            .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(panel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addGap(105, 105, 105)
                                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(498, Short.MAX_VALUE))
                        );
                        panel2Layout.setVerticalGroup(
                            panel2Layout.createParallelGroup()
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGap(143, 143, 143)
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panel4, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addContainerGap(275, Short.MAX_VALUE))
                        );
                    }

                    GroupLayout modifyPaneLayout = new GroupLayout(modifyPane);
                    modifyPane.setLayout(modifyPaneLayout);
                    modifyPaneLayout.setHorizontalGroup(
                        modifyPaneLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, modifyPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                    modifyPaneLayout.setVerticalGroup(
                        modifyPaneLayout.createParallelGroup()
                            .addGroup(modifyPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                }
                panel33.add(modifyPane, "card4");

                //======== homePane ========
                {

                    //======== panel9 ========
                    {
                        panel9.setBackground(new Color(69, 73, 74));

                        //---- label10 ----
                        label10.setText("text");
                        label10.setIcon(new ImageIcon(getClass().getResource("/Dictionary/download.png")));

                        //---- label8 ----
                        label8.setText("T\u1eeb \u0111i\u1ec3n Anh - Vi\u1ec7t");
                        label8.setForeground(new Color(187, 211, 248));
                        label8.setFont(new Font("Inconsolata", Font.BOLD, 36));
                        label8.setHorizontalAlignment(SwingConstants.CENTER);

                        GroupLayout panel9Layout = new GroupLayout(panel9);
                        panel9.setLayout(panel9Layout);
                        panel9Layout.setHorizontalGroup(
                            panel9Layout.createParallelGroup()
                                .addGroup(panel9Layout.createSequentialGroup()
                                    .addContainerGap(26, Short.MAX_VALUE)
                                    .addComponent(label10, GroupLayout.PREFERRED_SIZE, 811, GroupLayout.PREFERRED_SIZE)
                                    .addGap(16, 16, 16))
                                .addGroup(panel9Layout.createSequentialGroup()
                                    .addGap(96, 96, 96)
                                    .addComponent(label8, GroupLayout.PREFERRED_SIZE, 654, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(103, Short.MAX_VALUE))
                        );
                        panel9Layout.setVerticalGroup(
                            panel9Layout.createParallelGroup()
                                .addGroup(panel9Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(label10, GroupLayout.PREFERRED_SIZE, 502, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label8, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addGap(18, 18, 18))
                        );
                    }

                    GroupLayout homePaneLayout = new GroupLayout(homePane);
                    homePane.setLayout(homePaneLayout);
                    homePaneLayout.setHorizontalGroup(
                        homePaneLayout.createParallelGroup()
                            .addGroup(homePaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                    homePaneLayout.setVerticalGroup(
                        homePaneLayout.createParallelGroup()
                            .addGroup(homePaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                }
                panel33.add(homePane, "card1");

                //======== wordTransPane ========
                {

                    //======== panel34 ========
                    {
                        panel34.setBackground(new Color(69, 73, 74));

                        //---- textField1 ----
                        textField1.setFont(new Font("Inconsolata", Font.PLAIN, 20));
                        textField1.setForeground(new Color(204, 204, 204));
                        textField1.setCaretColor(new Color(153, 153, 153));
                        textField1.setBackground(new Color(69, 74, 74));
                        textField1.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                        textField1.setHorizontalAlignment(SwingConstants.LEFT);
                        textField1.setMaximumSize(textField1.getPreferredSize());
                        textField1.setMinimumSize(textField1.getPreferredSize());

                        //======== scrollPane1 ========
                        {
                            list1.setFont(new Font("Inconsolata", Font.PLAIN, 20));
                            list1.setForeground(new Color(204, 204, 204));
                            list1.setBackground(new Color(69, 74, 74));
                            list1.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                            list1.setMaximumSize(list1.getPreferredSize());
                            list1.setMinimumSize(list1.getPreferredSize());

                            //---- list1 ----
                            list1.setForeground(new Color(204, 204, 204));
                            list1.setFont(new Font("Inconsolata", Font.PLAIN, 20));
                            scrollPane1.setViewportView(list1);
                        }

                        GroupLayout panel34Layout = new GroupLayout(panel34);
                        panel34.setLayout(panel34Layout);
                        panel34Layout.setHorizontalGroup(
                            panel34Layout.createParallelGroup()
                                .addGroup(panel34Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel34Layout.createParallelGroup()
                                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                        .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                                    .addContainerGap())
                        );
                        panel34Layout.setVerticalGroup(
                            panel34Layout.createParallelGroup()
                                .addGroup(panel34Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                                    .addContainerGap())
                        );
                    }

                    //======== panel1 ========
                    {
                        panel1.setBackground(new Color(69, 73, 74));

                        //======== scrollPane2 ========
                        {

                            //---- textArea1 ----
                            textArea1.setForeground(new Color(204, 204, 204));
                            textArea1.setFont(new Font("Inconsolata", Font.PLAIN, 20));
                            textArea1.setEditable(false);
                            scrollPane2.setViewportView(textArea1);
                        }

                        GroupLayout panel1Layout = new GroupLayout(panel1);
                        panel1.setLayout(panel1Layout);
                        panel1Layout.setHorizontalGroup(
                            panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                                    .addContainerGap())
                        );
                        panel1Layout.setVerticalGroup(
                            panel1Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                                    .addContainerGap())
                        );
                    }

                    GroupLayout wordTransPaneLayout = new GroupLayout(wordTransPane);
                    wordTransPane.setLayout(wordTransPaneLayout);
                    wordTransPaneLayout.setHorizontalGroup(
                        wordTransPaneLayout.createParallelGroup()
                            .addGroup(wordTransPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel34, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                    wordTransPaneLayout.setVerticalGroup(
                        wordTransPaneLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, wordTransPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(wordTransPaneLayout.createParallelGroup()
                                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panel34, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                    );
                }
                panel33.add(wordTransPane, "card2");

                //======== paraTransPane ========
                {

                    //======== panel7 ========
                    {
                        panel7.setBackground(new Color(69, 73, 74));

                        //======== scrollPane3 ========
                        {

                            //---- textArea2 ----
                            textArea2.setForeground(new Color(204, 204, 204));
                            textArea2.setFont(new Font("Inconsolata", Font.PLAIN, 20));
                            textArea2.setBackground(new Color(69, 74, 74));
                            scrollPane3.setViewportView(textArea2);
                        }

                        //======== scrollPane4 ========
                        {

                            //---- textArea3 ----
                            textArea3.setForeground(new Color(204, 204, 204));
                            textArea3.setFont(new Font("Inconsolata", Font.PLAIN, 20));
                            textArea3.setBackground(new Color(69, 73, 74));
                            textArea3.setEditable(false);
                            scrollPane4.setViewportView(textArea3);
                        }

                        //---- label6 ----
                        label6.setText("Nh\u1eadp \u0111o\u1ea1n v\u0103n b\u1ea3n c\u1ea7n d\u1ecbch (s\u1eed d\u1ee5ng API)");
                        label6.setForeground(new Color(204, 204, 204));
                        label6.setFont(new Font("Inconsolata", Font.PLAIN, 20));

                        //======== panel8 ========
                        {
                            panel8.setBackground(new Color(69, 73, 74));

                            //---- label7 ----
                            label7.setIcon(new ImageIcon(getClass().getResource("/Dictionary/icons8-window-search-50.png")));
                            label7.setHorizontalAlignment(SwingConstants.CENTER);

                            GroupLayout panel8Layout = new GroupLayout(panel8);
                            panel8.setLayout(panel8Layout);
                            panel8Layout.setHorizontalGroup(
                                panel8Layout.createParallelGroup()
                                    .addGroup(panel8Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            );
                            panel8Layout.setVerticalGroup(
                                panel8Layout.createParallelGroup()
                                    .addGroup(panel8Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            );
                        }

                        GroupLayout panel7Layout = new GroupLayout(panel7);
                        panel7.setLayout(panel7Layout);
                        panel7Layout.setHorizontalGroup(
                            panel7Layout.createParallelGroup()
                                .addGroup(panel7Layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addGroup(panel7Layout.createParallelGroup()
                                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 501, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panel7Layout.createSequentialGroup()
                                            .addGroup(panel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(scrollPane4, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                                                .addComponent(scrollPane3, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
                                            .addGap(41, 41, 41)
                                            .addComponent(panel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGap(57, 57, 57))
                        );
                        panel7Layout.setVerticalGroup(
                            panel7Layout.createParallelGroup()
                                .addGroup(panel7Layout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel7Layout.createParallelGroup()
                                        .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                                            .addComponent(panel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addGap(17, 17, 17)))
                                    .addGap(62, 62, 62)
                                    .addComponent(scrollPane4, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(182, Short.MAX_VALUE))
                        );
                    }

                    GroupLayout paraTransPaneLayout = new GroupLayout(paraTransPane);
                    paraTransPane.setLayout(paraTransPaneLayout);
                    paraTransPaneLayout.setHorizontalGroup(
                        paraTransPaneLayout.createParallelGroup()
                            .addGroup(paraTransPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                    paraTransPaneLayout.setVerticalGroup(
                        paraTransPaneLayout.createParallelGroup()
                            .addGroup(paraTransPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                }
                panel33.add(paraTransPane, "card6");
            }

            GroupLayout frame1ContentPaneLayout = new GroupLayout(frame1ContentPane);
            frame1ContentPane.setLayout(frame1ContentPaneLayout);
            frame1ContentPaneLayout.setHorizontalGroup(
                frame1ContentPaneLayout.createParallelGroup()
                    .addGroup(frame1ContentPaneLayout.createSequentialGroup()
                        .addComponent(panel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(frame1ContentPaneLayout.createParallelGroup()
                            .addComponent(panel33, GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
                            .addComponent(panel12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            );
            frame1ContentPaneLayout.setVerticalGroup(
                frame1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(frame1ContentPaneLayout.createSequentialGroup()
                        .addComponent(panel12, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(panel33, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panel11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        homePane.setBackground(new Color(60, 63, 65));
        wordTransPane.setBackground(new Color(60, 63, 65));
        paraTransPane.setBackground(new Color(60, 63, 65));
        modifyPane.setBackground(new Color(60, 63, 65));
        aboutPane.setBackground(new Color(60, 63, 65));
        home.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                homePane.setVisible(true);
                wordTransPane.setVisible(false);
                paraTransPane.setVisible(false);
                modifyPane.setVisible(false);
                aboutPane.setVisible(false);
                panel6.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {}

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {}

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                p1.setBackground(new Color(60, 63, 65));
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                p1.setBackground(background1);

            }
        });

        wordTrans.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                homePane.setVisible(false);
                wordTransPane.setVisible(true);
                paraTransPane.setVisible(false);
                modifyPane.setVisible(false);
                aboutPane.setVisible(false);
                panel6.setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {}

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {}

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                p2.setBackground(new Color(60, 63, 65));
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                p2.setBackground(background1);

            }
        });

        paraTrans.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                homePane.setVisible(false);
                wordTransPane.setVisible(false);
                paraTransPane.setVisible(true);
                modifyPane.setVisible(false);
                aboutPane.setVisible(false);
                panel6.setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {}

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {}

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                p3.setBackground(new Color(60, 63, 65));
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                p3.setBackground(background1);

            }
        });

        modify.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                homePane.setVisible(false);
                wordTransPane.setVisible(false);
                paraTransPane.setVisible(false);
                modifyPane.setVisible(true);
                aboutPane.setVisible(false);
                panel6.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {}

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {}

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                p4.setBackground(new Color(60, 63, 65));
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                p4.setBackground(background1);

            }
        });

        about.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                homePane.setVisible(false);
                wordTransPane.setVisible(false);
                paraTransPane.setVisible(false);
                modifyPane.setVisible(false);
                aboutPane.setVisible(true);
                panel6.setVisible(false);
                textArea4.setText("\n  Tác giả: Nguyễn Quang Vinh \n  Lớp: K63K1\n  MSSV: 18024129\n  Phần mềm có sử dụng:" +
                        "\n\t   - Java\n\t   - Swing\n\t   - JFormDesigner 7\n\t   - Microsoft Translator API");
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {}

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {}

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                p5.setBackground(new Color(60, 63, 65));
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                p5.setBackground(background1);

            }
        });

        label2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                String word = textField2.getText();
                JOptionPane meaning = new JOptionPane();
                meaning.setBackground(background1);
                String input = meaning.showInputDialog(null, "Nhập nghĩa của từ:", "Thêm từ", 1);
                if (input != null && !input.equals("")) {
                    dm.addWord(word, input);
                    JOptionPane.showMessageDialog(null, "Thêm thành công");
                } else {
                    System.out.println("Cancel add");
                }
                textField2.setText("");
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {}

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {}

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                panel3.setBackground(new Color(60, 63, 65));
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                panel3.setBackground(background1);
            }

        });

        label3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                String word = textField2.getText();
                if (!word.equals("")) {
                    Word deleteWord = dm.dictionaryLookup(word);
                    if (deleteWord.getWord().length() == 0 && deleteWord.getMeaning().length() == 0) {
                        JOptionPane.showMessageDialog(null, "Không tìm thấy từ muốn xóa !");
                    } else {
                        JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa từ \"" + deleteWord.getWord() + "\" ?", "Xóa từ", JOptionPane.YES_NO_OPTION);
                        dm.deleteWordFromDictionary(word);
                        JOptionPane.showMessageDialog(null, "Xóa thành công");
                    }
                    textField2.setText("");
                }
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {}

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {}

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                panel4.setBackground(new Color(60, 63, 65));
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                panel4.setBackground(background1);

            }
        });

        label4.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                String word = textField2.getText();
                if (!word.equals("")) {
                    String[] options = {"Chỉnh sửa từ", "Chỉnh sửa nghĩa"};
                    JPanel panel = new JPanel();
                    JLabel label = new JLabel("Nhập từ/nghĩa cần sửa: ");
                    JTextField textField = new JTextField();
                    textField.setPreferredSize(new Dimension(230, 45));
                    panel.add(label);
                    panel.add(textField);
                    int option = JOptionPane.showOptionDialog(null, panel, "Chỉnh sửa", JOptionPane.NO_OPTION, JOptionPane.DEFAULT_OPTION, null, options, null);
                    String input = textField.getText();
                    System.out.println(option + input);
                    if (!input.equals("") && option == 0) {
                        if (dm.modifyWord(word, input)) {
                            JOptionPane.showMessageDialog(null, "Chỉnh sửa thành công");
                        } else {
                            JOptionPane.showMessageDialog(null, "Không tìm thấy từ muốn chỉnh sửa !");
                        }
                    }

                    if (!input.equals("") && option == 1) {
                        if (dm.modifyMeaning(word, input)) {
                            JOptionPane.showMessageDialog(null, "Chỉnh sửa thành công");
                        } else {
                            JOptionPane.showMessageDialog(null, "Không tìm thấy từ muốn chỉnh sửa !");
                        }
                    }
                }
                textField2.setText("");
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {}

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {}

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                panel5.setBackground(new Color(60, 63, 65));
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) { panel5.setBackground(background1); }
        });
        Border border = BorderFactory.createLineBorder(new Color(5, 5, 5));
        textField1.setBorder(border);
        scrollPane1.setBorder(border);
        textArea1.setBackground(background1);

        textField1.setText("Nhập từ cần tra");
        textField1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                textField1.setText("");
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {}

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {}

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {}

            @Override
            public void mouseExited(MouseEvent mouseEvent) {}
        });

        textField1.getDocument().addDocumentListener(new DocumentListener() {
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
                String input = textField1.getText();
                words = dm.dictionarySearcher(input);
                if (words != null) {
                    for (Word w : words) {
                        word.addElement(w.getWord());
                    }
                    list1.setModel(word);
                }
                if (words == null) {
                    word.addElement("Không tìm thấy từ");
                    list1.setModel(word);
                    textArea1.setText("");
                }
            }
        });

        list1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int index = list1.locationToIndex(e.getPoint());
                if (words != null) {
                    String meaning = words.get(index).getMeaning();
                    String[] word_with_meaning = meaning.split("\t");
                    String output = word_with_meaning[0] + "\n";
                    for (int i = 1; i < word_with_meaning.length; i++) {
                        System.out.println(word_with_meaning[i]);
                        output +=  " - " + word_with_meaning[i] + "\n";
                    }
                    textArea1.setText(output);
                }
            }
        });

        label5.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) { }

            @Override
            public void mousePressed(MouseEvent mouseEvent) { }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) { }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) { panel6.setBackground(new Color(60, 63, 65)); }

            @Override
            public void mouseExited(MouseEvent mouseEvent) { panel6.setBackground(background1); }
        });

        label7.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                String paragraph = textArea2.getText();
                API api = new API(paragraph);
                String response;
                try {
                    response = api.Post();
                    textArea3.setText(API.prettify(response));
                } catch (IOException e) {
                    response = e.toString();
                    textArea3.setText(response);
                }
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) { }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) { }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) { panel8.setBackground(new Color(60, 63, 65)); }

            @Override
            public void mouseExited(MouseEvent mouseEvent) { panel8.setBackground(background1); }
        });
    }

    private void defaultPage() {
        DefaultListModel word = new DefaultListModel();
        words = dm.dictionarySearcher("");
        for (int i = 0; i < words.size(); i++) {
            word.addElement(words.get(i).getWord());
        }
        list1.setModel(word);
    }

    private Color background1 = new Color(69, 73, 74);
    private DictionaryManagement dm;
    private ArrayList<Word> words = new ArrayList<Word>();
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Nguyen Vinh
    private JFrame frame1;
    private JPanel panel11;
    private JPanel p1;
    private JLabel home;
    private JPanel p2;
    private JLabel wordTrans;
    private JPanel p3;
    private JLabel paraTrans;
    private JPanel p4;
    private JLabel modify;
    private JPanel p5;
    private JLabel about;
    private JPanel panel12;
    private JPanel panel6;
    private JLabel label5;
    private JPanel panel33;
    private JPanel aboutPane;
    private JTextArea textArea4;
    private JPanel modifyPane;
    private JPanel panel2;
    private JLabel label1;
    private JTextField textField2;
    private JPanel panel3;
    private JLabel label2;
    private JPanel panel4;
    private JLabel label3;
    private JPanel panel5;
    private JLabel label4;
    private JPanel homePane;
    private JPanel panel9;
    private JLabel label10;
    private JLabel label8;
    private JPanel wordTransPane;
    private JPanel panel34;
    private JTextField textField1;
    private JScrollPane scrollPane1;
    private JList list1;
    private JPanel panel1;
    private JScrollPane scrollPane2;
    private JTextArea textArea1;
    private JPanel paraTransPane;
    private JPanel panel7;
    private JScrollPane scrollPane3;
    private JTextArea textArea2;
    private JScrollPane scrollPane4;
    private JTextArea textArea3;
    private JLabel label6;
    private JPanel panel8;
    private JLabel label7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public void runApplication() throws IndexOutOfBoundsException{
        FlatDarkFlatIJTheme.install();
        try {
            UIManager.setLookAndFeel(String.valueOf(new FlatDarkFlatIJTheme()));
        } catch( Exception ex ) { }
        initComponents();
        defaultPage();
        frame1.setVisible(true);
        frame1.setLocationRelativeTo(null);
        frame1.setResizable(false);
        panel6.setVisible(false);
        homePane.show();
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}