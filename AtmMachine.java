import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.Arrays;

public class AtmMachine {
    JLabel l1, l2, l3, l4, l5;
    JFrame f1, f2, f3, f4, f5;
    JButton b1, b2, b3, b4, b5, b6, b7 , b8;
    JTextArea ta1, ta2;
    final JPasswordField ps1;
    JDialog d1, d2, d3;
    public int amount = 100000;

    AtmMachine() {

        f1 = new JFrame("Welcome Window");
        f1.setBounds(600, 250, 600, 600);

        l1 = new JLabel("Hey!");
        l1.setFont(new Font("Verdana", Font.BOLD, 18));
        l1.setForeground(Color.BLUE);
        l1.setBounds(250, 150, 188, 30);

        l2 = new JLabel("Welcome To SBI");
        l2.setFont(new Font("Verdana", Font.BOLD, 18));
        l2.setForeground(Color.BLUE);
        l2.setBounds(200, 180, 188, 30);
        ps1 = new JPasswordField();
        ps1.setBounds(230, 220, 100, 40);

        ps1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                char ps[] = ps1.getPassword();
                if (checkIfCorrect(ps)) {
                    f2 = new JFrame("OPTION WINDOW");
                    f2.setSize(500, 500);
                    f2.setLayout(null);
                    f2.setVisible(true);
                    f2.getContentPane().setBackground(Color.YELLOW);

                    b2 = new JButton("FAST CASH");
                    b2.setBounds(150, 100, 200, 50);
                    b2.setFont(new Font("Verdana", Font.BOLD, 15));
                    b2.setBackground(Color.yellow);

                    b3 = new JButton("WITHDRAW");
                    b3.setBounds(150, 160, 200, 50);
                    b3.setFont(new Font("Verdana", Font.BOLD, 15));
                    b3.setBackground(Color.yellow);

                    b4 = new JButton("BALANCE");
                    b4.setBounds(150, 220, 200, 50);
                    b4.setFont(new Font("Verdana", Font.BOLD, 15));
                    b4.setBackground(Color.YELLOW);

                    f2.add(b2);
                    f2.add(b3);
                    f2.add(b4);

                    b2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            // JOptionPane.showMessageDialog(null, "I Love You!");\
                            f3 = new JFrame("FAST CASH");
                            f3.setSize(300, 300);
                            f3.setLayout(null);
                            f3.setVisible(true);
                            f3.getContentPane().setBackground(Color.cyan);

                            b5 = new JButton("1000");
                            b5.setBounds(70, 40, 100, 40);
                            b5.setBackground(Color.cyan);

                            b6 = new JButton("5000");
                            b6.setBounds(70, 100, 100, 40);
                            b6.setBackground(Color.cyan);

                            b7 = new JButton("10000");
                            b7.setBounds(70, 160, 100, 40);
                            b7.setBackground(Color.cyan);

                            b5.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    int x = amount - 1000;
                                    if (amount < 1000) {
                                        JOptionPane.showMessageDialog(null, "Low Balance");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Success Transaction\n" + x);
                                    }
                                }
                            });
                            b6.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    int x = amount - 5000;
                                    if (amount < 5000) {
                                        JOptionPane.showMessageDialog(null, "Low Balance");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Success Transaction\n" + x);
                                    }

                                }
                            });
                            b7.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    int x = amount - 10000;
                                    if (amount < 10000) {
                                        JOptionPane.showMessageDialog(null, "Low Balance");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Success Transaction\n" + x);
                                    }
                                }
                            });

                            f3.add(b5);
                            f3.add(b6);
                            f3.add(b7);
                        }
                    });

                    b3.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            f4 = new JFrame("Withdraw");
                            f4.setSize(200, 200);
                            f4.setLayout(null);
                            f4.setVisible(true);
                            f4.getContentPane().setBackground(Color.pink);

                            l3 = new JLabel("Enter Amount : ");
                            l3.setBounds(30, 30, 100, 30);
                            l3.setBackground(Color.pink);

                            ta2 = new JTextArea();
                            ta2.setBounds(30, 70, 100, 30);

                            b8 = new JButton("ENTER");
                            b8.setBounds(40, 110, 80, 30);
                            b8.setBackground(Color.pink);

                            f4.add(l3);
                            f4.add(ta2);
                            f4.add(b8);

                            b8.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    String s = ta2.getText();
                                    int x = Integer.parseInt(s);
                                    // int y = amount - x;
                                    if (amount > x) {
                                        JOptionPane.showMessageDialog(null, "Amount Trasnsaction SuccessFul\n" + x);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Low Balance");
                                    }
                                }
                            });

                        }
                    });

                    b4.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            JOptionPane.showMessageDialog(null, amount);
                        }
                    });

                } else {
                    JOptionPane.showMessageDialog(null, "Password Is Incorret");
                }
            }
        });

        b1 = new JButton("ENTER");
        b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.black);
        b1.setBounds(240, 270, 80, 50);

        f1.add(b1);
        f1.add(ps1);
        f1.add(l2);
        f1.add(l1);

        f1.getContentPane().setBackground(Color.GRAY);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setResizable(false);

        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private boolean checkIfCorrect(char[] ps) {
        boolean isCorrect = false;
        char[] correctPass = { '2', '6', '0', '9' };
        if (ps.length != correctPass.length) {
            isCorrect = false;
        } else {
            isCorrect = Arrays.equals(ps, correctPass);
        }
        Arrays.fill(correctPass, '0');
        return isCorrect;
    }

    public static void main(String[] args) {
        new AtmMachine();
    }
}
