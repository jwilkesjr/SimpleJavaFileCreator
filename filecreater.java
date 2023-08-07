import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.util.Scanner;
public class FileCreator{
	
	public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
	
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("File Creator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);

        JPanel panel = new JPanel(new GridLayout(2, 1));

        JTextField textField = new JTextField();
        JButton button = new JButton("Create Folders");

        button.addActionListener(e -> {
            createDirectories(textField.getText());
        });

        panel.add(new JLabel("Enter property address:"));
        panel.add(textField);
        panel.add(button);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
	
    private static void createDirectories(String userInput) {
        // Your existing directory path creation code and folder creation code goes here.
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Enter property address: ");
        String userString = scanner.nextLine();
		
		
		String directory= "H:\\.shortcut-targets-by-id\\1wZVcrdBzVyszAojOGlqCTCCTuIZIXYYW\\ACTIVE 1\\" + userString;
		String directory1= "H:\\.shortcut-targets-by-id\\1wZVcrdBzVyszAojOGlqCTCCTuIZIXYYW\\ACTIVE 1\\" + userString + "\\Seller Info";
		String directory2= "H:\\.shortcut-targets-by-id\\1wZVcrdBzVyszAojOGlqCTCCTuIZIXYYW\\ACTIVE 1\\" + userString + "\\Buyer Info";
		String directory3= "H:\\.shortcut-targets-by-id\\1wZVcrdBzVyszAojOGlqCTCCTuIZIXYYW\\ACTIVE 1\\" + userString + "\\Realtor Info";
		String directory4= "H:\\.shortcut-targets-by-id\\1wZVcrdBzVyszAojOGlqCTCCTuIZIXYYW\\ACTIVE 1\\" + userString + "\\HOA Info";
		String directory5= "H:\\.shortcut-targets-by-id\\1wZVcrdBzVyszAojOGlqCTCCTuIZIXYYW\\ACTIVE 1\\" + userString + "\\Title Items";
		String directory6= "H:\\.shortcut-targets-by-id\\1wZVcrdBzVyszAojOGlqCTCCTuIZIXYYW\\ACTIVE 1\\" + userString + "\\Invoices";
		String directory7= "H:\\.shortcut-targets-by-id\\1wZVcrdBzVyszAojOGlqCTCCTuIZIXYYW\\ACTIVE 1\\" + userString + "\\Lender Items";
		String directory8= "H:\\.shortcut-targets-by-id\\1wZVcrdBzVyszAojOGlqCTCCTuIZIXYYW\\ACTIVE 1\\" + userString + "\\Contract Items";
		String directory9= "H:\\.shortcut-targets-by-id\\1wZVcrdBzVyszAojOGlqCTCCTuIZIXYYW\\ACTIVE 1\\" + userString + "\\ATTN Items";
		
		
		File f = new File(directory);
		File f1 = new File(directory1);
		File f2 = new File(directory2);
		File f3 = new File(directory3);
		File f4 = new File(directory4);
		File f5 = new File(directory5);
		File f6 = new File(directory6);
		File f7 = new File(directory7);
		File f8 = new File(directory8);
		File f9 = new File(directory9);
		
		f.mkdirs();
		f1.mkdirs();
		f2.mkdirs();
		f3.mkdirs();
		f4.mkdirs();
		f5.mkdirs();
		f6.mkdirs();
		f7.mkdirs();
		f8.mkdirs();
		f9.mkdirs();
    }
		

}
