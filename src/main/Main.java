package main;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            System.setProperty("apple.awt.application.name", "월급 루팡");
        }

        SwingUtilities.invokeLater(() -> new SalaryLupin().setVisible(true));

    }
}
