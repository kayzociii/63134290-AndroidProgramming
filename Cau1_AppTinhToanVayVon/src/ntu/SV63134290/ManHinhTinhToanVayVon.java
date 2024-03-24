package ntu.SV63134290;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class ManHinhTinhToanVayVon extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSoTien;
	private JTextField txtLaiSuat;
	private JTextField txtThoiHan;
	private JTextField txtSoTienHangThang;
	private JTextField txtTongTien;
	private JComboBox<String> cbbNganHang;
	private HashMap<String, Double> laiSuatNam;
	
	public ManHinhTinhToanVayVon() {
		setTitle("CHƯƠNG TRÌNH TÍNH TOÁN KHOẢN VAY ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 711, 671);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChuongTrinh = new JLabel("CHƯƠNG TRÌNH TÍNH TOÁN KHOẢN VAY");
		lblChuongTrinh.setForeground(Color.RED);
		lblChuongTrinh.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblChuongTrinh.setBounds(94, 26, 508, 61);
		contentPane.add(lblChuongTrinh);
		
		JLabel lblSoTien = new JLabel("Số tiền cần vay:");
		lblSoTien.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSoTien.setBounds(63, 99, 169, 55);
		contentPane.add(lblSoTien);
		
		txtSoTien = new JTextField();
		txtSoTien.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtSoTien.setColumns(10);
		txtSoTien.setBounds(292, 110, 298, 36);
		contentPane.add(txtSoTien);
		
		JLabel lblNganHang = new JLabel("Chọn ngân hàng:");
		lblNganHang.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNganHang.setBounds(63, 150, 179, 55);
		contentPane.add(lblNganHang);
		

		
		String[] nganHang = {"Techcombank", "VPBank", "ACB", "TPBank", "HDBank", "Sacombank", "VIB", "SHB", "OCB"};
		cbbNganHang = new JComboBox<>(nganHang);
		cbbNganHang.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cbbNganHang.setBounds(292, 163, 298, 36);
		contentPane.add(cbbNganHang);
		cbbNganHang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String chonNganHang = (String) cbbNganHang.getSelectedItem();
                if (chonNganHang != null) {
                    double LaiSuat = laiSuatNam.get(chonNganHang);
                    txtLaiSuat.setText(LaiSuat + "%");
                }
            }
        });

		JLabel lblLaiSuat = new JLabel("Lãi suất(%/năm):");
		lblLaiSuat.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLaiSuat.setBounds(63, 207, 190, 55);
		contentPane.add(lblLaiSuat);
		
		
		txtLaiSuat = new JTextField();
		txtLaiSuat.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtLaiSuat.setEditable(false);
		txtLaiSuat.setColumns(10);
		txtLaiSuat.setBounds(292, 218, 298, 36);
		contentPane.add(txtLaiSuat);
		
		//Thiết lập lãi suất tương ứng với ngân hàng
		laiSuatNam = new HashMap<>();
		laiSuatNam.put("Techcombank", 7.49);
		laiSuatNam.put("VPBank", 6.9);
		laiSuatNam.put("ACB", 9.0);
		laiSuatNam.put("TPBank", 6.4);
		laiSuatNam.put("HDBank", 6.8);
		laiSuatNam.put("Sacombank", 8.5);
		laiSuatNam.put("VIB", 8.3);
		laiSuatNam.put("SHB", 8.5);
		laiSuatNam.put("OCB", 5.99);
		       
		JLabel lblThoiHan = new JLabel("Thời hạn vay(tháng):");
		lblThoiHan.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblThoiHan.setBounds(62, 264, 220, 55);
		contentPane.add(lblThoiHan);
		
		txtThoiHan = new JTextField();
		txtThoiHan.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtThoiHan.setColumns(10);
		txtThoiHan.setBounds(292, 275, 298, 36);
		contentPane.add(txtThoiHan);
		
		JButton btnTinh = new JButton("TÍNH");
		btnTinh.setForeground(Color.BLACK);
		btnTinh.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnTinh.setBackground(Color.RED);
		btnTinh.setBounds(274, 338, 138, 55);
		contentPane.add(btnTinh);
		
		btnTinh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tinhLaiSuat();
            }
        });
		
		JLabel lblSoTienHangThang = new JLabel("Số tiền phải trả hàng tháng: ");
		lblSoTienHangThang.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSoTienHangThang.setBounds(63, 403, 337, 61);
		contentPane.add(lblSoTienHangThang);
		
		txtSoTienHangThang = new JTextField();
		txtSoTienHangThang.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtSoTienHangThang.setEditable(false);
		txtSoTienHangThang.setColumns(10);
		txtSoTienHangThang.setBounds(210, 458, 298, 36);
		contentPane.add(txtSoTienHangThang);
		
		JLabel lblTongTien = new JLabel("Tổng số tiền phải trả:");
		lblTongTien.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTongTien.setBounds(63, 494, 220, 61);
		contentPane.add(lblTongTien);
		
		txtTongTien = new JTextField();
		txtTongTien.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtTongTien.setEditable(false);
		txtTongTien.setColumns(10);
		txtTongTien.setBounds(210, 550, 298, 36);
		contentPane.add(txtTongTien);
	}
	private void tinhLaiSuat() {
		double tienCanVay = Double.parseDouble(txtSoTien.getText());
        String nganHang = (String) cbbNganHang.getSelectedItem();
        double laiSuat = laiSuatNam.get(nganHang);
        double laiSuatPhanTram = laiSuat/100;
        int soThang = Integer.parseInt(txtThoiHan.getText());
        
        double tienHangThang = (tienCanVay/12) + ((tienCanVay * laiSuatPhanTram)/12);
        double tongTien = tienHangThang * soThang;
        
        txtSoTienHangThang.setText(String.format("%.2f", tienHangThang));
        txtTongTien.setText(String.format("%.2f", tongTien));
	}
}
