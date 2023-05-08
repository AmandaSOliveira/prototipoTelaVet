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

public class CrudUsuario extends JInternalFrame {
	private JTextField inputUserName;
	private JTextField inputLogin;
	private JTextField textPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrudUsuario frame = new CrudUsuario();
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
	public CrudUsuario() {
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Usuário");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(10, 11, 414, 14);
		getContentPane().add(lblTitle);
		
		JPanel pGeneral = new JPanel();
		pGeneral.setBounds(10, 25, 414, 234);
		getContentPane().add(pGeneral);
		pGeneral.setLayout(null);
		
		JPanel userData = new JPanel();
		userData.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		userData.setBounds(10, 11, 264, 212);
		pGeneral.add(userData);
		userData.setLayout(null);
		
		JLabel lblUserName = new JLabel("Nome:");
		lblUserName.setBounds(10, 40, 40, 14);
		userData.add(lblUserName);
		
		inputUserName = new JTextField();
		inputUserName.setColumns(10);
		inputUserName.setBounds(50, 37, 204, 20);
		userData.add(inputUserName);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(10, 68, 40, 14);
		userData.add(lblLogin);
		
		inputLogin = new JTextField();
		inputLogin.setColumns(10);
		inputLogin.setBounds(50, 65, 204, 20);
		userData.add(inputLogin);
		
		JButton btnCancel = new JButton("Cancelar");
		btnCancel.setBounds(28, 179, 89, 23);
		userData.add(btnCancel);
		
		JButton btnSave = new JButton("Salvar");
		btnSave.setBounds(145, 179, 89, 23);
		userData.add(btnSave);
		
		JLabel lblPassword = new JLabel("Senha:");
		lblPassword.setBounds(10, 96, 40, 14);
		userData.add(lblPassword);
		
		textPassword = new JTextField();
		textPassword.setColumns(10);
		textPassword.setBounds(50, 93, 204, 20);
		userData.add(textPassword);
		
		JLabel lblProfile = new JLabel("Perfil:");
		lblProfile.setBounds(10, 125, 46, 14);
		userData.add(lblProfile);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Administrador", "Atendente", "Gerente", "Veterinario"}));
		comboBox.setSelectedIndex(1);
		comboBox.setBounds(50, 124, 204, 22);
		userData.add(comboBox);
		
		JPanel pButtons = new JPanel();
		pButtons.setBounds(284, 11, 120, 212);
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
