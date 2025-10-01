import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {
    private JLabel taskLabel;
    private JButton deleteButton;
    private JCheckBox doneTask;
    private String originalText;

    public Task(String taskText, Runnable onDelete) {
        originalText = taskText;

        setLayout(new BorderLayout(10, 10));
        setMaximumSize(new Dimension(450, 55));
        setBackground(Color.WHITE);

        // Border with shadow-like effect
        setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(220, 220, 220), 1, true),
                BorderFactory.createEmptyBorder(8, 10, 8, 10)
        ));

        // Checkbox
        doneTask = new JCheckBox();
        doneTask.addActionListener(e -> toggleCompletion());

        // Task label
        taskLabel = new JLabel(taskText);
        taskLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        // Delete button
        deleteButton = new JButton("X");
        deleteButton.setBackground(new Color(231, 76, 60));
        deleteButton.setForeground(Color.WHITE);
        deleteButton.setFocusPainted(false);
        deleteButton.setBorder(BorderFactory.createEmptyBorder(5, 12, 5, 12));

        if (onDelete != null) {
            deleteButton.addActionListener(e -> onDelete.run());
        }

        // Left (checkbox + label)
        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        leftPanel.setOpaque(false);
        leftPanel.add(doneTask);
        leftPanel.add(taskLabel);

        add(leftPanel, BorderLayout.CENTER);
        add(deleteButton, BorderLayout.EAST);
    }

    private void toggleCompletion() {
        if (doneTask.isSelected()) {
            taskLabel.setText("<html><strike>" + originalText + "</strike></html>");
            taskLabel.setForeground(Color.GRAY);
            setBackground(new Color(245, 245, 245));
        } else {
            taskLabel.setText(originalText);
            taskLabel.setForeground(Color.BLACK);
            setBackground(Color.WHITE);
        }
    }
}
