## 📝 Java Swing TODO App

<img width="729" height="965" alt="Screenshot (311)" src="https://github.com/user-attachments/assets/3ebe7abd-f777-4a82-9a8e-15fdb6ff4e16" />

A simple, modern, and intuitive Task Management / To-Do List application built entirely with **Java Swing**. This project serves as an excellent example of building a functional and visually appealing desktop GUI application in Java.

This program allows you to add tasks, mark them as complete, edit them on the fly, and delete them individually or all at once. It features a clean, responsive UI that makes task management easy and efficient.

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

Add Task
<img width="735" height="963" alt="Screenshot (312)" src="https://github.com/user-attachments/assets/5bbebfb4-84fe-405c-9efe-50f2d34587c5" />

Mark as complete
<img width="737" height="961" alt="Screenshot (313)" src="https://github.com/user-attachments/assets/ebe39d8b-8f70-42bd-b0a8-7429b1dcf966" />

Delete Task
<img width="732" height="963" alt="Screenshot (314)" src="https://github.com/user-attachments/assets/300d4ab3-6dd0-4d24-aab9-bc4f0001e329" />

Remove all task
<img width="723" height="960" alt="Screenshot (315)" src="https://github.com/user-attachments/assets/7febc895-146a-4660-9436-0ba56bbf7870" />

---

## 🛠️ Tech Stack & Key Components

-   **Core Language**: Java
-   **GUI Framework**: Java Swing
-   **Key Swing Components Used**:
    -   `JFrame`: The main application window.
    -   `JPanel`: For organizing UI elements into logical groups.
    -   `JLabel`: To display task text.
    -   `JTextField`: For user input to add new tasks.
    -   `JButton`: For user actions like adding, deleting, and clearing tasks.
    -   `JCheckBox`: To toggle the completion status of a task.
    -   `JScrollPane`: To provide scrollability for the task list.
    -   `BoxLayout` & `BorderLayout`: For arranging components in a structured and responsive manner.
    -   `JOptionPane`: For displaying interactive dialog boxes.

---

## 🚀 Getting Started

Follow these instructions to get a copy of the project up and running on your local machine.

### Prerequisites

-   Java Development Kit (JDK) 8 or higher installed on your system.

### Running the Application

1.  **Clone or download the repository:**
    ```bash
    git clone [https://github.com/your-username/JavaSwingTodoApp.git](https://github.com/your-username/JavaSwingTodoApp.git)
    cd JavaSwingTodoApp
    ```

2.  **Compile the Java source files from the root directory:**
    *(This command assumes you are in the `JavaSwingTodoApp/` directory)*
    ```bash
    javac src/Main.java src/MyFrame.java src/Task.java
    ```

3.  **Run the application:**
    *(The `-cp src` flag tells Java where to find the compiled .class files)*
    ```bash
    java -cp src Main
    ```
4.  The TODO App window will now open! 🎉

---

## 📖 Learning Outcomes

This project was a great exercise in practical Java GUI development. Key takeaways include:
-   ✔ **Robust GUI Construction**: Building a complete graphical user interface from scratch using Swing components.
-   ✔ **Layout Management**: Professional UI structuring using `BorderLayout` and `BoxLayout`.
-   ✔ **Event Handling**: Managing user interactions like button clicks, key presses, and mouse events.
-   ✔ **Dynamic UI Updates**: Adding, removing, and modifying UI components at runtime and correctly refreshing the display with `revalidate()` and `repaint()`.
-   ✔ **Object-Oriented Design**: Creating custom, reusable components (`Task.java`) to build a modular and maintainable application.
-   ✔ **UI/UX Design**: Focusing on aesthetics and usability through custom fonts, colors, spacing, and intuitive confirmation dialogs.

---

## 🔮 Future Enhancements

-   [ ] **Data Persistence**: Save tasks to a local file (e.g., JSON or CSV) and load them when the app starts.
-   [ ] **Due Dates & Priorities**: Add functionality to set deadlines and priority levels (e.g., High, Medium, Low) for tasks.
-   [ ] **Drag-and-Drop**: Implement drag-and-drop functionality to reorder tasks in the list.
-   [ ] **Themes**: Add a settings option to switch between a light and a dark theme.
-   [ ] **Refactor to MVC**: Restructure the code to follow the Model-View-Controller pattern for better separation of concerns.

---

## 👨‍💻 Author

**Prince**

A passionate developer who built this project to solidify skills in Java GUI development, event handling, and UI design.

[![GitHub](https://img.shields.io/badge/GitHub-Profile-black?style=for-the-badge&logo=github)](https://github.com/your-username)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Profile-blue?style=for-the-badge&logo=linkedin)](https://www.linkedin.com/in/your-profile)
