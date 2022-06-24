package filedialog;

import java.awt.FileDialog;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class FileDialogTest extends JFrame implements ActionListener{
	JButton btnSave, btnLoad;
	JTextArea txtArea;
	
	public FileDialogTest() {
		setTitle("파일대화창");
		initLayout();
		
		setBounds(200, 200, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void initLayout() {
		setLayout(new GridLayout(3, 1));
		txtArea = new JTextArea();
		btnSave = new JButton("SAVE");
		btnLoad = new JButton("LOAD");
		
		getContentPane().add(txtArea);
		getContentPane().add(btnSave);
		getContentPane().add(btnLoad);
		
		btnSave.addActionListener(this);
		btnLoad.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new FileDialogTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnSave)) {
			FileDialog dialog = new FileDialog(this, "저장", FileDialog.SAVE);
			dialog.setDirectory(".");
			dialog.setVisible(true);
			
			String fileName = dialog.getDirectory() + dialog.getFile();
			
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
				writer.write(txtArea.getText());
				writer.close();
				
				setTitle(dialog.getFile() + "-메모장");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(btnLoad)) {
			FileDialog dialog = new FileDialog(this, "열기", FileDialog.LOAD);
			dialog.setDirectory(".");
			dialog.setVisible(true);
			
			String fileName = dialog.getDirectory() + dialog.getFile();
			
			try {
				BufferedReader reader = new BufferedReader(new FileReader(fileName));
				txtArea.setText("");
				String line;
				while((line=reader.readLine()) !=null) {
					txtArea.append(line + "\n");
				}
				reader.close();
				setTitle(dialog.getFile());
				
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}
