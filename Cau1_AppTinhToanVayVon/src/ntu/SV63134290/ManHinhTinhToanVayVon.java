package ntu.SV63134290;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class ManHinhTinhToanVayVon extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public ManHinhTinhToanVayVon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 711, 671);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblchuongTrinh = new JLabel("CHƯƠNG TRÌNH TÍNH TOÁN KHOẢN VAY");
		lblchuongTrinh.setForeground(Color.RED);
		lblchuongTrinh.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblchuongTrinh.setBounds(94, 26, 508, 61);
		contentPane.add(lblchuongTrinh);
		
		JLabel lblsoTien = new JLabel("Số tiền cần vay:");
		lblsoTien.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblsoTien.setBounds(63, 107, 169, 55);
		contentPane.add(lblsoTien);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField.setColumns(10);
		textField.setBounds(292, 118, 298, 36);
		contentPane.add(textField);
		
		JLabel lblnganHang = new JLabel("Chọn ngân hàng:");
		lblnganHang.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblnganHang.setBounds(63, 172, 179, 55);
		contentPane.add(lblnganHang);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(292, 185, 298, 36);
		contentPane.add(comboBox);
		
		JLabel lbllaiSuat = new JLabel("Lãi suất(%/năm):");
		lbllaiSuat.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbllaiSuat.setBounds(63, 237, 190, 55);
		contentPane.add(lbllaiSuat);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(292, 248, 298, 36);
		contentPane.add(textField_1);
		
		JLabel lblthoiHan = new JLabel("Thời hạn vay(tháng):");
		lblthoiHan.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblthoiHan.setBounds(63, 302, 220, 55);
		contentPane.add(lblthoiHan);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_2.setColumns(10);
		textField_2.setBounds(292, 313, 298, 36);
		contentPane.add(textField_2);
		
		JButton btnTinh = new JButton("TÍNH");
		btnTinh.setForeground(Color.BLACK);
		btnTinh.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnTinh.setBackground(Color.RED);
		btnTinh.setBounds(272, 378, 138, 55);
		contentPane.add(btnTinh);
	}
}
