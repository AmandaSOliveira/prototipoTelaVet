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
import javax.swing.border.BevelBorder;

public class CrudVeterinario extends JInternalFrame {
	private JTextField inputId;
	private JTextField inputName;
	private JTextField inputSpeciality;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrudVeterinario frame = new CrudVeterinario();
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
	public CrudVeterinario() {
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Veterinário");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(10, 11, 414, 14);
		getContentPane().add(lblTitle);
		
		JPanel pGeneral = new JPanel();
		pGeneral.setBounds(10, 25, 414, 234);
		getContentPane().add(pGeneral);
		pGeneral.setLayout(null);
		
		JPanel pFields = new JPanel();
		pFields.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pFields.setBounds(10, 11, 264, 212);
		pGeneral.add(pFields);
		pFields.setLayout(null);
		
		JLabel lblId = new JLabel("Código:");
		lblId.setBounds(10, 11, 244, 14);
		pFields.add(lblId);
		
		inputId = new JTextField();
		inputId.setBounds(10, 36, 244, 20);
		pFields.add(inputId);
		inputId.setColumns(10);
		
		JLabel lblName = new JLabel("Nome:");
		lblName.setBounds(10, 67, 244, 14);
		pFields.add(lblName);
		
		inputName = new JTextField();
		inputName.setColumns(10);
		inputName.setBounds(10, 92, 244, 20);
		pFields.add(inputName);
		
		JLabel lblSpeciality = new JLabel("Especialidade:");
		lblSpeciality.setBounds(10, 123, 244, 14);
		pFields.add(lblSpeciality);
		
		inputSpeciality = new JTextField();
		inputSpeciality.setColumns(10);
		inputSpeciality.setBounds(10, 148, 244, 20);
		pFields.add(inputSpeciality);
		
		JButton btnCancel = new JButton("Cancelar");
		btnCancel.setBounds(28, 179, 89, 23);
		pFields.add(btnCancel);
		
		JButton btnSave = new JButton("Salvar");
		btnSave.setBounds(145, 179, 89, 23);
		pFields.add(btnSave);
		
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
