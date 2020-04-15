package panels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KalkulatorPanel extends JPanel{
	JTextField tfAngka1;
	JTextField tfAngka2;
	JButton btnKalkulasi;
	JLabel labelHasil;
	
	public KalkulatorPanel() {
		tfAngka1 = new JTextField();
		tfAngka2 = new JTextField();
		btnKalkulasi = new JButton("Kalkulasi");
		labelHasil = new JLabel("0");
		
		btnKalkulasi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int angka1 = Integer.valueOf(tfAngka1.getText().toString());
				int angka2 = Integer.valueOf(tfAngka2.getText().toString());
				
				int hasil = angka1 + angka2;
				
				labelHasil.setText(String.valueOf(hasil));
				
			}
			
		});
		add(tfAngka1);
		add(tfAngka2);
		add(btnKalkulasi);
		add(labelHasil);
	}
	
	
}
