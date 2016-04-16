package jdk8.lambda;

import javax.swing.JButton;

public class ListenerTest {
    public static void main(String[] args) {
        JButton btn = new JButton();
        btn.addActionListener(
            e -> System.out.println("Event Source is: " + e.getSource())
        );
    }
}
