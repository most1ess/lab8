package gui;

import javax.swing.*;
import java.awt.*;

public class ConnectorFrame {
    private final int width = 300;
    private final int height = 300;

    private JFrame frame;
    private JLabel portLabel;
    private JTextField enteredPortField;
    private JLabel hostLabel;
    private JTextField enteredHostField;
    private JButton submitButton;

    public ConnectorFrame() {
        createFrame();
        createElements();
        fillFrame();
        addActionListeners();
    }

    private void createFrame() {
        frame = new JFrame("Подключение к серверу");
        frame.setLayout(new GridBagLayout());
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }

    private void createElements() {
        portLabel = new JLabel("Введите порт:");
        enteredPortField = new JTextField();
        hostLabel = new JLabel("Введите имя хоста:");
        enteredHostField = new JTextField();
        submitButton = new JButton("Готово");
    }

    private void fillFrame() {
        frame.add(portLabel, new GridBagConstraints(0, 1, 1, 1, 1.0, 0.1,
                GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, new Insets(0, 50, 0, 50), 0, 0));
        frame.add(enteredPortField, new GridBagConstraints(0, 2, 1, 1, 1.0, 1.0,
                GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, new Insets(0, 50, 0, 50), 0, 0));
        frame.add(hostLabel, new GridBagConstraints(0, 3, 1, 1, 1.0, 0.1,
                GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, new Insets(0, 50, 0, 50), 0, 0));
        frame.add(enteredHostField, new GridBagConstraints(0, 4, 1, 1, 1.0, 1.0,
                GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, new Insets(0, 50, 0, 50), 0, 0));
        frame.add(submitButton, new GridBagConstraints(0, 6, 1, 1, 1.0, 1.0,
                GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, new Insets(0, 50, 0, 50), 0, 0));
    }

    private void addActionListeners() {
        submitButton.addActionListener(e -> {

        });
    }
}
