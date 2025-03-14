package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CharacterForm {

	private JFrame frame;
	private JTextField nameField;
	private JLabel lblDescription;
	private JTextField descriptionField;
	private JLabel lblHabilities;
	private JTextField groupField;
	private JTextField habilitiesField;
	private JLabel lblGroup;
	private JButton btnSave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CharacterForm window = new CharacterForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CharacterForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(12, 12, 424, 17);
		frame.getContentPane().add(lblName);
		
		nameField = new JTextField();
		nameField.setBounds(12, 41, 424, 21);
		frame.getContentPane().add(nameField);
		nameField.setColumns(10);
		
		lblDescription = new JLabel("Description:");
		lblDescription.setBounds(12, 74, 424, 17);
		frame.getContentPane().add(lblDescription);
		
		descriptionField = new JTextField();
		descriptionField.setColumns(10);
		descriptionField.setBounds(12, 103, 424, 21);
		frame.getContentPane().add(descriptionField);
		
		lblHabilities = new JLabel("Habilities:");
		lblHabilities.setBounds(12, 136, 424, 17);
		frame.getContentPane().add(lblHabilities);
		
		habilitiesField = new JTextField();
		habilitiesField.setColumns(10);
		habilitiesField.setBounds(12, 165, 424, 21);
		frame.getContentPane().add(habilitiesField);
		
		lblGroup = new JLabel("Group:");
		lblGroup.setBounds(12, 198, 424, 17);
		frame.getContentPane().add(lblGroup);
		
		groupField = new JTextField();
		groupField.setColumns(10);
		groupField.setBounds(12, 227, 424, 21);
		frame.getContentPane().add(groupField);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(330, 382, 106, 27);
		frame.getContentPane().add(btnSave);
	}
}
