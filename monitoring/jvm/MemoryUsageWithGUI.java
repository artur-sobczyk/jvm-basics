package pl.art.tutorial.jvm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MemoryUsageWithGUI extends JFrame {

    private static final Random RANDOM = new Random();
    private static final int NUM_OF_BYTES = 5000000;
    private static final List<byte[]> list = new ArrayList<>();

    public MemoryUsageWithGUI() {
        initUI();
    }

    private void initUI() {

        createLayout(shortTermObjectsButton(), longTermObjectsButton(), invokeGCButton());
        setTitle("Memory test");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private JButton shortTermObjectsButton() {
        JButton button = new JButton("allocateShortTerm");

        button.addActionListener((ActionEvent event) -> {
            getRandomBytes(NUM_OF_BYTES);
        });

        return button;
    }

    private JButton longTermObjectsButton() {
        JButton button = new JButton("allocateLongTerm");

        button.addActionListener((ActionEvent event) -> {
            list.add(getRandomBytes(NUM_OF_BYTES));
        });

        return button;
    }

    private JButton invokeGCButton() {
        JButton button = new JButton("invokeGC");

        button.addActionListener((ActionEvent event) -> {
            System.gc();
        });

        return button;
    }

    private void createLayout(JComponent... arg) {

        GridLayout experimentLayout = new GridLayout(arg.length,1);
        setLayout(experimentLayout);

        Arrays.asList(arg).forEach(e -> add(e));
    }

    private static byte[] getRandomBytes(int numberOfBytes) {
        byte[] bytes = new byte[numberOfBytes];
        RANDOM.nextBytes(bytes);
        return bytes;
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            MemoryUsageWithGUI ex = new MemoryUsageWithGUI();
            ex.setVisible(true);
        });
    }
}