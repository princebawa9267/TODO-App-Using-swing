import javax.swing.SwingUtilities;

// Entry point of the application
public class Main {
    public static void main(String[] args) {

        // Always start Swing apps inside Event Dispatch Thread for thread safety
        SwingUtilities.invokeLater(MyFrame::new);
        
    }
}
