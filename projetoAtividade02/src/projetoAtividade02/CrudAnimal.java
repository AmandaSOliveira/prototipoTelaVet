package projetoAtividade02;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.BevelBorder;

public class CrudAnimal extends JInternalFrame {
	private JTextField inputClientName;
	private JTextField inputClientId;
	private JTextField inputPetName;
	private JTextField inputPetRace;
	private JTextField inputPetBirthday;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrudAnimal frame = new CrudAnimal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CrudAnimal() {
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 506, 300);
		getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Pet");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(10, 11, 470, 14);
		getContentPane().add(lblTitle);
		
		JPanel pGeneral = new JPanel();
		pGeneral.setBounds(10, 25, 470, 234);
		getContentPane().add(pGeneral);
		pGeneral.setLayout(null);
		
		JPanel petRegister = new JPanel();
		petRegister.setBounds(10, 0, 330, 234);
		pGeneral.add(petRegister);
		petRegister.setLayout(null);
		
		JButton btnCancel = new JButton("Cancelar");
		btnCancel.setBounds(63, 208, 89, 23);
		petRegister.add(btnCancel);
		
		JButton btnSave = new JButton("Salvar");
		btnSave.setBounds(174, 208, 89, 23);
		petRegister.add(btnSave);
		
		JPanel petData = new JPanel();
		petData.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		petData.setBounds(10, 79, 310, 118);
		petRegister.add(petData);
		petData.setLayout(null);
		
		JLabel lblPetName = new JLabel("Nome do Pet:");
		lblPetName.setBounds(10, 11, 84, 14);
		petData.add(lblPetName);
		
		inputPetName = new JTextField();
		inputPetName.setBounds(96, 8, 204, 17);
		petData.add(inputPetName);
		inputPetName.setColumns(10);
		
		JLabel lblPetType = new JLabel("Tipo:");
		lblPetType.setBounds(10, 34, 37, 14);
		petData.add(lblPetType);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(49, 30, 105, 22);
		petData.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cachorro", "Gato"}));
		comboBox.setSelectedIndex(-1);
		
		JLabel lblPetColor = new JLabel("Cor:");
		lblPetColor.setBounds(164, 34, 30, 14);
		petData.add(lblPetColor);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(195, 30, 105, 22);
		petData.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Marrom", "caramelo", "preto", "cinza", "bicolor", "tricolor"}));
		comboBox_1.setSelectedIndex(-1);
		
		JLabel lblPetRace = new JLabel("Raça: ");
		lblPetRace.setBounds(10, 62, 37, 14);
		petData.add(lblPetRace);
		
		inputPetRace = new JTextField();
		inputPetRace.setBounds(59, 59, 241, 20);
		petData.add(inputPetRace);
		inputPetRace.setColumns(10);
		
		JLabel lblPetBirthday = new JLabel("Data de Nascimento: ");
		lblPetBirthday.setBounds(10, 90, 154, 14);
		petData.add(lblPetBirthday);
		
		inputPetBirthday = new JTextField();
		inputPetBirthday.setBounds(174, 87, 126, 20);
		petData.add(inputPetBirthday);
		inputPetBirthday.setColumns(10);
		
		JPanel clientData = new JPanel();
		clientData.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		clientData.setBounds(10, 11, 310, 64);
		petRegister.add(clientData);
		clientData.setLayout(null);
		
		JLabel lblClientName = new JLabel("Nome:");
		lblClientName.setBounds(10, 42, 40, 14);
		clientData.add(lblClientName);
		
		inputClientName = new JTextField();
		inputClientName.setBounds(60, 39, 240, 20);
		clientData.add(inputClientName);
		inputClientName.setColumns(10);
		
		JLabel lblClientId = new JLabel("Código Cliente:");
		lblClientId.setBounds(10, 14, 98, 14);
		clientData.add(lblClientId);
		
		inputClientId = new JTextField();
		inputClientId.setBounds(118, 11, 98, 20);
		clientData.add(inputClientId);
		inputClientId.setColumns(10);
		
		JPanel pButtons = new JPanel();
		pButtons.setBounds(350, 0, 120, 234);
		pGeneral.add(pButtons);
		pButtons.setLayout(null);
		
		JButton btnInsert = new JButton("Inserir");
		btnInsert.setBounds(10, 32, 100, 23);
		pButtons.add(btnInsert);
		
		JButton btnUpdate = new JButton("Alterar");
		btnUpdate.setBounds(10, 66, 100, 23);
		pButtons.add(btnUpdate);
		
		JButton btnDelete = new JButton("Excluir");
		btnDelete.setBounds(10, 100, 100, 23);
		pButtons.add(btnDelete);
		
		JButton btnSearch = new JButton("Pesquisar");
		btnSearch.setBounds(10, 134, 100, 23);
		pButtons.add(btnSearch);
		
		JButton btnClose = new JButton("Fechar");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setBounds(10, 165, 100, 23);
		pButtons.add(btnClose);

	}
}
