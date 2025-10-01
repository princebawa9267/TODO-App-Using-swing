# 📝 Java Swing TODO App

<p align="center">
  <img src="https://github.com/user-attachments/assets/3ebe7abd-f777-4a82-9a8e-15fdb6ff4e16" width="400" alt="Main App Window"/>
</p>

A simple, modern, and intuitive Task Management / To-Do List application built entirely with **Java Swing**. This project serves as an excellent example of building a functional and visually appealing desktop GUI application in Java.

This program allows you to add, edit, complete, and delete tasks individually or all at once. It features a clean, responsive UI that makes task management easy and efficient.

---

## ✨ Features

-   ✅ **Add Tasks**: Quickly add new tasks via an input field. Pressing `Enter` or clicking the `+ Add Task` button works.
-   ✅ **Mark as Completed**: Use the checkbox to mark tasks as done, which visually strikes through the text.
-   ✏️ **Edit Tasks**: Double-click on a task's text to open an edit dialog and update it.
-   ❌ **Delete Single Task**: Each task has a dedicated delete button to remove it.
-   🗑️ **Clear All Tasks**: A "Clear All" button to remove every task with a confirmation dialog to prevent accidental deletion.
-   📜 **Scrollable List**: The task list automatically becomes scrollable when tasks exceed the window height.
-   🎨 **Modern UI**: A clean and professional user interface with carefully chosen fonts, colors, and component spacing.
-   🛡️ **User-Friendly Dialogs**: Uses `JOptionPane` for warnings and confirmation dialogs, ensuring a safe user experience.

---

## 📸 Screenshots

Here is a gallery showcasing the app's functionality.

<table align="center">
  <tr>
    <td align="center"><strong>Add Task</strong></td>
    <td align="center"><strong>Mark as Complete</strong></td>
  </tr>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/5bbebfb4-84fe-405c-9efe-50f2d34587c5" width="350" alt="Adding a Task"></td>
    <td><img src="https://github.com/user-attachments/assets/ebe39d8b-8f70-42bd-b0a8-7429b1dcf966" width="350" alt="Task Completed"></td>
  </tr>
  <tr>
    <td align="center"><strong>Delete Task (Confirmation)</strong></td>
    <td align="center"><strong>Remove All Tasks (Confirmation)</strong></td>
  </tr>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/300d4ab3-6dd0-4d24-aab9-bc4f0001e329" width="350" alt="Delete Task Dialog"></td>
    <td><img src="https://github.com/user-attachments/assets/7febc895-146a-4660-9436-0ba56bbf7870" width="350" alt="Remove All Dialog"></td>
  </tr>
</table>

---

## 🛠️ Tech Stack & Key Components

-   **Core Language**: Java (JDK 8+)
-   **GUI Framework**: Java Swing
-   **Key Swing Components Used**:
    -   `JFrame`, `JPanel`, `JLabel`, `JTextField`
    -   `JButton`, `JCheckBox`, `JScrollPane`
    -   `BoxLayout`, `BorderLayout`, `JOptionPane`

---

## 🚀 Getting Started

Follow these instructions to get a copy of the project up and running on your local machine.

### Prerequisites

-   Java Development Kit (JDK) 8 or higher installed and configured on your system.

### Running the Application

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/your-username/JavaSwingTodoApp.git](https://github.com/your-username/JavaSwingTodoApp.git)
    cd JavaSwingTodoApp
    ```

2.  **Compile the Java source files from the project's root directory:**
    ```bash
    javac src/*.java
    ```

3.  **Run the application:**
    *(The `-cp src` flag tells Java where to find the compiled class files)*
    ```bash
    java -cp src Main
    ```
4.  The TODO App window will now open! 🎉

---

## 📖 Learning Outcomes

This project was a great exercise in practical Java GUI development. Key takeaways include:
-   ✔ **Robust GUI Construction**: Building a complete graphical user interface from scratch.
-   ✔ **Layout Management**: Professional UI structuring using `BorderLayout` and `BoxLayout`.
-   ✔ **Event Handling**: Managing user interactions like button clicks, key presses, and mouse events.
-   ✔ **Dynamic UI Updates**: Adding and removing UI components at runtime and correctly refreshing the display.
-   ✔ **Object-Oriented Design**: Creating custom, reusable components (`Task.java`) for a modular application.
-   ✔ **UI/UX Design**: Focusing on aesthetics and usability through custom fonts, colors, and dialogs.

