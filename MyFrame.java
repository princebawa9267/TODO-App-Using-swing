import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private JPanel tasksPanel;
    private JTextField taskInput;

    public MyFrame() {
        // ---------------- Frame ----------------
        setTitle("TODO App");
        setSize(500, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon("TodoImage.jpg");
         this.setIconImage(icon.getImage());


        // Global font
        UIManager.put("Label.font", new Font("Segoe UI", Font.PLAIN, 14));
        UIManager.put("Button.font", new Font("Segoe UI", Font.BOLD, 13));
        UIManager.put("CheckBox.font", new Font("Segoe UI", Font.PLAIN, 13));

        getContentPane().setBackground(new Color(245, 246, 250));
        setLayout(new BorderLayout(10, 10));

        // ---------------- Top Input Bar ----------------
        JPanel inputPanel = new JPanel(new BorderLayout(8, 8));
        inputPanel.setBackground(new Color(245, 246, 250));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 10, 15));

        taskInput = new JTextField();
        taskInput.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        taskInput.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200), 1, true),
                BorderFactory.createEmptyBorder(8, 10, 8, 10)));

        JButton addButton = new JButton("+ Add Task");
        addButton.setBackground(new Color(46, 204, 113));
        addButton.setForeground(Color.WHITE);
        addButton.setFocusPainted(false);
        addButton.setBorder(BorderFactory.createEmptyBorder(8, 15, 8, 15));

        // Add to panel
        inputPanel.add(taskInput, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.EAST);

        add(inputPanel, BorderLayout.NORTH);

        // ---------------- Tasks Panel ----------------
        tasksPanel = new JPanel();
        tasksPanel.setLayout(new BoxLayout(tasksPanel, BoxLayout.Y_AXIS));
        tasksPanel.setBackground(Color.WHITE);

        JScrollPane scrollPane = new JScrollPane(tasksPanel);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        add(scrollPane, BorderLayout.CENTER);

        // ---------------- Bottom Panel ----------------
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        bottomPanel.setBackground(new Color(245, 246, 250));

        JButton removeAllButton = new JButton("🗑️ Remove All");
        removeAllButton.setBackground(new Color(231, 76, 60));
        removeAllButton.setForeground(Color.WHITE);
        removeAllButton.setFocusPainted(false);
        removeAllButton.setBorder(BorderFactory.createEmptyBorder(8, 15, 8, 15));

        bottomPanel.add(removeAllButton);
        add(bottomPanel, BorderLayout.SOUTH);

        // ---------------- Event Handling ----------------
        addButton.addActionListener(e -> addTask());
        taskInput.addActionListener(e -> addTask());

        removeAllButton.addActionListener(e -> removeAllTasks());

        setVisible(true);
    }

    // ---------------- Add Single Task ----------------
    private void addTask() {
        String text = taskInput.getText().trim();
        if (!text.isEmpty()) {
            final Task[] taskHolder = new Task[1];
            taskHolder[0] = new Task(text, () -> {
                // Confirm before deleting
                int confirm = JOptionPane.showConfirmDialog(
                        this,
                        "Are you sure you want to delete this task?",
                        "Confirm Delete",
                        JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    // Remove the exact task component
                    tasksPanel.remove(taskHolder[0]);
                    tasksPanel.revalidate();
                    tasksPanel.repaint();
                }
            });
            Task task = taskHolder[0];
            tasksPanel.add(Box.createVerticalStrut(5));
            tasksPanel.add(task);
            tasksPanel.revalidate();

            // ✅ Clear input so user can type next task
            taskInput.setText("");

        } else {
            JOptionPane.showMessageDialog(this, "Task cannot be empty!");
        }
    }

    // ---------------- Remove All Tasks ----------------
    private void removeAllTasks() {
        if (tasksPanel.getComponentCount() > 0) {
            int confirm = JOptionPane.showConfirmDialog(
                    this,
                    "Are you sure you want to remove ALL tasks?",
                    "Confirm Remove All",
                    JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                tasksPanel.removeAll();
                tasksPanel.revalidate();
                tasksPanel.repaint();
            }
        } else {
            JOptionPane.showMessageDialog(this, "ℹNo tasks to remove!");
        }
    }
}
