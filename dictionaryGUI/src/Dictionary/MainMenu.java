/*
 * Created by JFormDesigner on Tue Sep 29 20:10:17 ICT 2020
 */

package Dictionary;

import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.*;

/**
 * @author Nguyen Vinh
 */
public class MainMenu extends JFrame {
    private void initComponents() {
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
        panel33 = new JPanel();
        aboutPane = new JPanel();
        modifyPane = new JPanel();
        panel2 = new JPanel();
        textField2 = new JTextField();
        panel3 = new JPanel();
        label1 = new JLabel();
        paraTransPane = new JPanel();
        homePane = new JPanel();
        wordTransPane = new JPanel();
        panel34 = new JPanel();
        textField1 = new JTextField();
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        panel1 = new JPanel();
        scrollPane2 = new JScrollPane();
        textArea1 = new JTextArea();

        //======== frame1 ========
        {
            var frame1ContentPane = frame1.getContentPane();

            //======== panel11 ========
            {
                panel11.setBackground(new Color(69, 73, 74));
                panel11.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .
                EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax. swing .border . TitledBorder. CENTER ,javax . swing
                . border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069alog", java .awt . Font. BOLD ,12 ) ,
                java . awt. Color .red ) ,panel11. getBorder () ) ); panel11. addPropertyChangeListener( new java. beans .PropertyChangeListener ( )
                { @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062order" .equals ( e. getPropertyName () ) )
                throw new RuntimeException( ) ;} } );

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

                GroupLayout panel12Layout = new GroupLayout(panel12);
                panel12.setLayout(panel12Layout);
                panel12Layout.setHorizontalGroup(
                    panel12Layout.createParallelGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                );
                panel12Layout.setVerticalGroup(
                    panel12Layout.createParallelGroup()
                        .addGap(0, 130, Short.MAX_VALUE)
                );
            }

            //======== panel33 ========
            {
                panel33.setLayout(new CardLayout());

                //======== aboutPane ========
                {

                    GroupLayout aboutPaneLayout = new GroupLayout(aboutPane);
                    aboutPane.setLayout(aboutPaneLayout);
                    aboutPaneLayout.setHorizontalGroup(
                        aboutPaneLayout.createParallelGroup()
                            .addGap(0, 850, Short.MAX_VALUE)
                    );
                    aboutPaneLayout.setVerticalGroup(
                        aboutPaneLayout.createParallelGroup()
                            .addGap(0, 636, Short.MAX_VALUE)
                    );
                }
                panel33.add(aboutPane, "card5");

                //======== modifyPane ========
                {

                    //======== panel2 ========
                    {
                        panel2.setBackground(new Color(69, 73, 74));

                        //---- textField2 ----
                        textField2.setFont(new Font("Inconsolata", Font.PLAIN, 20));

                        //======== panel3 ========
                        {
                            panel3.setBackground(new Color(69, 73, 74));

                            //---- label1 ----
                            label1.setText("Nh\u1eadp t\u1eeb");
                            label1.setFont(new Font("Inconsolata", Font.PLAIN, 20));

                            GroupLayout panel3Layout = new GroupLayout(panel3);
                            panel3.setLayout(panel3Layout);
                            panel3Layout.setHorizontalGroup(
                                panel3Layout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())
                            );
                            panel3Layout.setVerticalGroup(
                                panel3Layout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                                        .addGap(0, 37, Short.MAX_VALUE)
                                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                            );
                        }

                        GroupLayout panel2Layout = new GroupLayout(panel2);
                        panel2.setLayout(panel2Layout);
                        panel2Layout.setHorizontalGroup(
                            panel2Layout.createParallelGroup()
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGap(96, 96, 96)
                                    .addGroup(panel2Layout.createParallelGroup()
                                        .addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(497, Short.MAX_VALUE))
                        );
                        panel2Layout.setVerticalGroup(
                            panel2Layout.createParallelGroup()
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(428, Short.MAX_VALUE))
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

                //======== paraTransPane ========
                {

                    GroupLayout paraTransPaneLayout = new GroupLayout(paraTransPane);
                    paraTransPane.setLayout(paraTransPaneLayout);
                    paraTransPaneLayout.setHorizontalGroup(
                        paraTransPaneLayout.createParallelGroup()
                            .addGap(0, 850, Short.MAX_VALUE)
                    );
                    paraTransPaneLayout.setVerticalGroup(
                        paraTransPaneLayout.createParallelGroup()
                            .addGap(0, 636, Short.MAX_VALUE)
                    );
                }
                panel33.add(paraTransPane, "card3");

                //======== homePane ========
                {

                    GroupLayout homePaneLayout = new GroupLayout(homePane);
                    homePane.setLayout(homePaneLayout);
                    homePaneLayout.setHorizontalGroup(
                        homePaneLayout.createParallelGroup()
                            .addGap(0, 850, Short.MAX_VALUE)
                    );
                    homePaneLayout.setVerticalGroup(
                        homePaneLayout.createParallelGroup()
                            .addGap(0, 636, Short.MAX_VALUE)
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
                                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
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
                                    .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                                    .addContainerGap())
                        );
                        panel1Layout.setVerticalGroup(
                            panel1Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                                    .addContainerGap())
                        );
                    }

                    GroupLayout wordTransPaneLayout = new GroupLayout(wordTransPane);
                    wordTransPane.setLayout(wordTransPaneLayout);
                    wordTransPaneLayout.setHorizontalGroup(
                        wordTransPaneLayout.createParallelGroup()
                            .addGroup(wordTransPaneLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(panel34, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                    wordTransPaneLayout.setVerticalGroup(
                        wordTransPaneLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, wordTransPaneLayout.createSequentialGroup()
                                .addContainerGap(12, Short.MAX_VALUE)
                                .addGroup(wordTransPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panel34, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                    );
                }
                panel33.add(wordTransPane, "card2");
            }

            GroupLayout frame1ContentPaneLayout = new GroupLayout(frame1ContentPane);
            frame1ContentPane.setLayout(frame1ContentPaneLayout);
            frame1ContentPaneLayout.setHorizontalGroup(
                frame1ContentPaneLayout.createParallelGroup()
                    .addGroup(frame1ContentPaneLayout.createSequentialGroup()
                        .addComponent(panel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(frame1ContentPaneLayout.createParallelGroup()
                            .addComponent(panel33, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            );
            frame1ContentPaneLayout.setVerticalGroup(
                frame1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(frame1ContentPaneLayout.createSequentialGroup()
                        .addComponent(panel12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                p1.setBackground(new Color(60, 63, 65));
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                p1.setBackground(new Color(69, 73, 74));

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
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                p2.setBackground(new Color(60, 63, 65));
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                p2.setBackground(new Color(69, 73, 74));

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
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                p3.setBackground(new Color(60, 63, 65));
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                p3.setBackground(new Color(69, 73, 74));

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
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                p4.setBackground(new Color(60, 63, 65));
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                p4.setBackground(new Color(69, 73, 74));

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
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                p5.setBackground(new Color(60, 63, 65));
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                p5.setBackground(new Color(69, 73, 74));

            }
        });
        textField1.setBorder(new LineBorder(new Color(5, 5, 5)));
        scrollPane1.setBorder(new LineBorder(new Color(5, 5, 5)));
        textArea1.setBackground(new Color(69, 73, 74));
    }

    private void defaultPage() {
        DefaultListModel word = new DefaultListModel();
        words = dm.dictionarySearcher("");
        for (int i = 0; i < words.size(); i++) {
            word.addElement(words.get(i).getWord());
        }
        list1.setModel(word);
    }

    private DictionaryManagement dm = new DictionaryManagement();
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
    private JPanel panel33;
    private JPanel aboutPane;
    private JPanel modifyPane;
    private JPanel panel2;
    private JTextField textField2;
    private JPanel panel3;
    private JLabel label1;
    private JPanel paraTransPane;
    private JPanel homePane;
    private JPanel wordTransPane;
    private JPanel panel34;
    private JTextField textField1;
    private JScrollPane scrollPane1;
    private JList list1;
    private JPanel panel1;
    private JScrollPane scrollPane2;
    private JTextArea textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public MainMenu() {
        initComponents();
        defaultPage();
        frame1.setVisible(true);
        frame1.setLocationRelativeTo(null);
        frame1.setResizable(false);
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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
                    for (int i = 0; i < words.size(); i++) {
                        word.addElement(words.get(i).getWord());
                    }
                }
                list1.setModel(word);
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
    }

    private static void runApplication() throws IndexOutOfBoundsException{
        FlatDarkFlatIJTheme.install();
        try {
            UIManager.setLookAndFeel(String.valueOf(new FlatDarkFlatIJTheme()));
        } catch( Exception ex ) {}
        new MainMenu();
    }

    public static void main(String[] args) {
        runApplication();
    }
}
